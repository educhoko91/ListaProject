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
		public class Main{
			public static void main(String[] args){
				System.out.println(«generateExpression(p.evaluation.expression)»);
			}
		«FOR f: p.functionDefinitions»
		
			public static «symbolTable.get("global").get(f.name)» «f.name»(«FOR param:f.parameters SEPARATOR ','» «symbolTable.get(f.name).get(param.name)» «generateExpression(param)» «ENDFOR»){
				return («generateExpression(f.expression)»);
			}
		«ENDFOR»
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
			«se.string»
		«ELSEIF e instanceof BooleanExpression»
			«var b =  e as BooleanExpression»
			«b.value»
		«ELSEIF e instanceof Identifier»
			«var i = e as Identifier»
			«i.name»
		«ELSEIF e instanceof InputExpression»
			«var input = e as InputExpression»
			input("«input.message»");
		«ELSEIF e instanceof IfExpression»
			«var ife = e as IfExpression»
			(«generateExpression(ife.cond)»? «generateExpression(ife.consequent)» : «generateExpression(ife.alternative)»)
		«ELSEIF e instanceof NegExpr»
			«var neg = e as NegExpr»
			«generateExpression(neg.subExpr)»
		«ELSEIF e instanceof OutputExpression»
			«var out = e as OutputExpression»
			output(«generateExpression(out.parameter)»);
		«ELSEIF e instanceof SeqExpression»
			«var se = e as SeqExpression»
			«FOR sub:se.subExpressions»
				«generateExpression(sub)»
			«ENDFOR»
		«ELSEIF e instanceof CompositeExpr»
			«var ce = e as CompositeExpr»
			«generateExpression(ce.subExpressions.get(0))» «generateOperator(ce.operator)» «generateExpression(ce.subExpressions.get(1))»«ENDIF»'''
		
	def generateOperator(Operator o)'''
		«var operator = o.getName»
		«IF operator=="PLUS"»	+	«ELSEIF operator=="MINUS"»	-  «ELSEIF operator=="OR"»	||  «ELSEIF operator=="AND"»  &&  «ELSEIF operator=="TIMES"»  *  «ELSEIF operator=="DIVIDE"»  /  «ELSEIF operator=="CONCAT"»  +  «ELSEIF operator=="SMALLERTHAN"»  <  «ELSEIF operator=="EQUALS"»  ==  «ENDIF»	'''
}
