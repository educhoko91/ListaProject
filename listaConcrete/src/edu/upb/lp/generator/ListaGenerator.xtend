/*
 * generated by Xtext
 */
package edu.upb.lp.generator

import edu.upb.lp.type.TypeIdentifier
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import Lista.Program
import Lista.Expression
import Lista.FunctionCall
import Lista.NumberExpression
import Lista.StringExpression
import Lista.BooleanExpression
import Lista.Identifier
import Lista.InputExpression
import Lista.NegExpr
import Lista.OutputExpression
import Lista.SeqExpression
import Lista.CompositeExpr
import Lista.Operator
import Lista.IfExpression
import java.util.HashMap
import java.awt.Composite

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ListaGenerator implements IGenerator {
	
	var symbolTable = new HashMap<String,HashMap<String,String>>;
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val p = resource.contents.get(0) as Program
		val st = TypeIdentifier.getInstance(p)
		symbolTable=st.hashMap;
		println(st.hashMap)
		var f = resource.URI.trimFileExtension
		fsa.generateFile(f.segment(f.segmentCount-1)+".java",generateCode(p));
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	def generateCode(Program p)'''
	import java.util.*;
		public class Main{
			public static void main(String[] args){
				System.out.println(«generateExpression(p.evaluation.expression)»);
			}
		«FOR f: p.functionDefinitions»
		
			public static «symbolTable.get("global").get(f.name)» «f.name»(«FOR param:f.parameters SEPARATOR ','» «symbolTable.get(f.name).get(param.name)» «generateExpression(param)» «ENDFOR»){
				return («generateExpression(f.expression)»);
			}
		«ENDFOR»
		
		public static String input(String s){
			System.out.println(s);
			Scanner in = new Scanner(System.in);
			String aux = in.nextLine();
			return aux;
		}
		
		public static Object output(Object o){
			System.out.println(o);
			return o;
		}
		
		}'''
	def generateExpression(Expression e)'''
		«IF e instanceof FunctionCall»
			«var fc = e as FunctionCall»
			«fc.function.name» («FOR a: fc.arguments SEPARATOR ','»
									«generateExpression(a)»
								«ENDFOR»)
		«ELSEIF e instanceof NumberExpression»
			«var ne = e as NumberExpression»
			«ne.number»
		«ELSEIF e instanceof StringExpression»
			«var se = e as StringExpression»
			"«se.string.get(0)»"
		«ELSEIF e instanceof BooleanExpression»
			«var b =  e as BooleanExpression»
			«b.value»
		«ELSEIF e instanceof Identifier»
			«var i = e as Identifier»
			«i.name»
		«ELSEIF e instanceof InputExpression»
			«var input = e as InputExpression»
			input("«input.message»")
		«ELSEIF e instanceof IfExpression»
			«var ife = e as IfExpression»
			«var consequent = ife.consequent»
			«var alternative = ife.alternative»
			«IF (consequent instanceof NumberExpression) && alternative instanceof InputExpression»
				(«generateExpression(ife.cond)»? «generateExpression(consequent)» : Integer.parseInt(«generateExpression(alternative)»))
			«ELSEIF (consequent instanceof CompositeExpr && alternative instanceof InputExpression)»
				«var ce = consequent as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond)»? «generateExpression(consequent)» : Integer.parseInt(«generateExpression(alternative)»))
				«ELSE»
					(«generateExpression(ife.cond)»? «generateExpression(consequent)» : «generateExpression(alternative)»)
				«ENDIF»
			«ELSEIF alternative instanceof CompositeExpr && consequent instanceof InputExpression»
				«var ce = alternative as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond)»? Integer.parseInt(«generateExpression(consequent)») : «generateExpression(alternative)»)
				«ELSE»
					(«generateExpression(ife.cond)»? «generateExpression(consequent)» : «generateExpression(alternative)»)
				«ENDIF»
			«ELSEIF (alternative instanceof NumberExpression) && consequent instanceof InputExpression»
				(«generateExpression(ife.cond)»? Integer.parseInt(«generateExpression(consequent)») : «generateExpression(alternative)»)
			«ELSE»
				(«generateExpression(ife.cond)»? «generateExpression(consequent)» : «generateExpression(alternative)»)
			«ENDIF»
			
		«ELSEIF e instanceof NegExpr»
			«var neg = e as NegExpr»
			«generateExpression(neg.subExpr)»
		«ELSEIF e instanceof OutputExpression»
			«var out = e as OutputExpression»
			output(«generateExpression(out.parameter)»)
		«ELSEIF e instanceof SeqExpression»
			«var se = e as SeqExpression»
			«FOR sub:se.subExpressions»
				«generateExpression(sub)»
			«ENDFOR»
		«ELSEIF e instanceof CompositeExpr»
			«var ce = e as CompositeExpr»
			«var left = ce.subExpressions.get(0)»
			«var right = ce.subExpressions.get(1)»
			«var o = ce.operator»
			«IF (left instanceof InputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				Integer.parseInt(«generateExpression(left)»)
			«ELSEIF left instanceof InputExpression && o.getName=="EQUALS"»
				«IF right instanceof NumberExpression»
					Integer.parseInt(«generateExpression(left)»)
				«ELSEIF right instanceof CompositeExpr»
					«IF (right as CompositeExpr).operator=="PLUS" || (right as CompositeExpr).operator=="MINUS"|| (right as CompositeExpr).operator=="TIMES"|| (right as CompositeExpr).operator=="DIVIDE"|| (right as CompositeExpr).operator=="SMALLERTHAN"»
					Integer.parseInt(«generateExpression(left)»)
					«ELSE»
					«generateExpression(left)»
					«ENDIF»
				«ENDIF»	
			«ELSE»
				«generateExpression(left)»
			«ENDIF»«generateOperator(o)»
			«IF (right instanceof InputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				Integer.parseInt(«generateExpression(right)»)
			«ELSEIF right instanceof InputExpression && o.getName=="EQUALS"»
				«IF left instanceof NumberExpression»
					Integer.parseInt(«generateExpression(right)»)
				«ELSEIF left instanceof CompositeExpr»
					«IF (left as CompositeExpr).operator=="PLUS" || (left as CompositeExpr).operator=="MINUS"|| (left as CompositeExpr).operator=="TIMES"|| (left as CompositeExpr).operator=="DIVIDE"|| (left as CompositeExpr).operator=="SMALLERTHAN"»
					Integer.parseInt(«generateExpression(right)»)
					«ELSE»
					«generateExpression(right)»
				«ENDIF»
			«ENDIF»	
			
			«ELSE»
				«generateExpression(right)»
			«ENDIF»
			
			«ENDIF»'''
		
	def generateOperator(Operator o)'''
		«var operator = o.getName»
		«IF operator=="PLUS"»	+	«ELSEIF operator=="MINUS"»	-  «ELSEIF operator=="OR"»	||  «ELSEIF operator=="AND"»  &&  «ELSEIF operator=="TIMES"»  *  «ELSEIF operator=="DIVIDE"»  /  «ELSEIF operator=="CONCAT"»  +  «ELSEIF operator=="SMALLERTHAN"»  <  «ELSEIF operator=="EQUALS"»  ==  «ENDIF»	'''
}
