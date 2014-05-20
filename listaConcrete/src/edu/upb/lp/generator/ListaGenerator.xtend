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
import Lista.MapExpression
import Lista.PutExpression
import Lista.GetExpression
import Lista.RemoveExpression

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ListaGenerator implements IGenerator {
	
	var symbolTable = new HashMap<String,HashMap<String,String>>;
	var seqTable = new HashMap<Expression,HashMap<String,String>>;
	var sequences = 0;
	var mapMaps = new HashMap<String,HashMap<String,MapExpression>>();
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val p = resource.contents.get(0) as Program
		val st = TypeIdentifier.getInstance(p)
		symbolTable=st.hashMap;
		seqTable=st.sequences;
		mapMaps=st.mapMaps;
		sequences = 0;
		println(st.hashMap)
		println(mapMaps);
		var f = resource.URI.trimFileExtension
		var name = f.segment(f.segmentCount-1)
		fsa.generateFile(f.segment(f.segmentCount-1)+".java",generateCode(p,name));
		println(seqTable);
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	def generateCode(Program p,String name)'''
	import java.util.*;
		public class «name»{
			
		«FOR f: p.functionDefinitions»
		
			public static «symbolTable.get("global").get(f.name)» «f.name»(«FOR param:f.parameters SEPARATOR ','» «symbolTable.get(f.name).get(param.name)» «generateExpression(param,f.name)» «ENDFOR»){
				«generateMaps(f.name)»
				return («generateExpression(f.expression,f.name)»);
			}
		«ENDFOR»
		
		public static void main(String[] args){
			«generateMaps("query")»
				System.out.println(«generateExpression(p.evaluation.expression,"global")»);
			}
		
		public static String input(String s){
			System.out.println(s);
			Scanner in = new Scanner(System.in);
			String aux = in.nextLine();
			return aux;
		}
		
		public static String output(String s){
			System.out.println(s);
			return s;
		}
		
		public static boolean output(boolean b){
			System.out.println(b);
			return b;
		}
		
		public static int output(int a){
			System.out.println(a);
			return a;
		}
		
		public static HashMap<?,?> output(HashMap<?,?> m){
			System.out.println(m);
			return m;
		}
		
		public static int parseInt(String s){
			return Integer.parseInt(s);
		}
		
		public static int parseInt(int a){
			return a;
		}
		
		public static HashMap<String,String> put(HashMap<String,String> m,String k,String v){
			m.put(k,v);
			return m;
		}
		public static HashMap<String,Integer> put(HashMap<String,Integer> m,String k,Integer v){
			m.put(k,v);
			return m;
		}
		public static HashMap<String,Boolean> put(HashMap<String,Boolean> m,String k,Boolean v){
			m.put(k,v);
			return m;
		}
		public static HashMap<Integer,String> put(HashMap<Integer,String> m,Integer k,String v){
			m.put(k,v);
			return m;
		}
		public static HashMap<Integer,Integer> put(HashMap<Integer,Integer> m,Integer k,Integer v){
			m.put(k,v);
			return m;
		}
		public static HashMap<Integer,Boolean> put(HashMap<Integer,Boolean> m,Integer k,Boolean v){
			m.put(k,v);
			return m;
		}
		
		public static String get(HashMap<Integer,?> m,Integer k){
			return ""+m.get(k);
		}
		public static String get(HashMap<String,?> m,String k){
			return ""+m.get(k);
		}
		
		
		public static HashMap<Integer,?> remove(HashMap<Integer,?> m,Integer k){
			m.remove(k);
			return m;
		}
		public static HashMap<String,?> remove(HashMap<String,?> m,String k){
			m.remove(k);
			return m;
		}
		

		«generateSequences(seqTable)»
		}
		'''
	def generateExpression(Expression e,String scope)'''
		«IF e instanceof FunctionCall»
			«var fc = e as FunctionCall»
			«var i = 0»
			«fc.function.name» («FOR a: fc.arguments SEPARATOR ','»
									«IF (a instanceof InputExpression || a instanceof OutputExpression) && symbolTable.get(fc.function.name).get(fc.function.parameters.get(i).name).equals("int")»
										parseInt(«generateExpression(a,scope)»)
									«ELSE»
										«generateExpression(a,scope)»
									«ENDIF»
									«{i=i+1; null}»
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
				(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
			«ELSEIF (consequent instanceof CompositeExpr && alternative instanceof InputExpression)»
				«var ce = consequent as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
			«ELSEIF alternative instanceof CompositeExpr && consequent instanceof InputExpression»
				«var ce = alternative as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
			«ELSEIF (alternative instanceof NumberExpression) && consequent instanceof InputExpression»
				(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)
			«ELSEIF (consequent instanceof NumberExpression) && alternative instanceof OutputExpression»
				(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
			«ELSEIF (consequent instanceof CompositeExpr && alternative instanceof OutputExpression)»
				«var ce = consequent as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
			«ELSEIF alternative instanceof CompositeExpr && consequent instanceof OutputExpression»
				«var ce = alternative as CompositeExpr»
				«IF ce.operator.name=="PLUS"||ce.operator.name=="MINUS"||ce.operator.name=="TIMES"||ce.operator.name=="DIVIDE"||ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
			«ELSEIF (alternative instanceof NumberExpression) && consequent instanceof OutputExpression»
				(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)

			«ELSEIF consequent instanceof NumberExpression && alternative instanceof GetExpression»
				(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
			«ELSEIF consequent instanceof CompositeExpr && alternative instanceof GetExpression»
				«var ce = consequent as CompositeExpr»
				«IF ce.operator.name=="PLUS" || ce.operator.name=="MINUS" || ce.operator.name=="TIMES" || ce.operator.name=="DIVIDE" || ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : parseInt(«generateExpression(alternative,scope)»))
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
			«ELSEIF alternative instanceof NumberExpression && consequent instanceof GetExpression»
				(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)
			«ELSEIF alternative instanceof CompositeExpr && consequent instanceof GetExpression»
				«var ce = alternative as CompositeExpr»
				«IF ce.operator.name=="PLUS" || ce.operator.name=="MINUS" || ce.operator.name=="TIMES" || ce.operator.name=="DIVIDE" || ce.operator.name=="SMALLERTHAN"»
					(«generateExpression(ife.cond,scope)»? parseInt(«generateExpression(consequent,scope)») : «generateExpression(alternative,scope)»)
				«ELSE»
					(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
				«ENDIF»
				
			«ELSE»
				(«generateExpression(ife.cond,scope)»? «generateExpression(consequent,scope)» : «generateExpression(alternative,scope)»)
			«ENDIF»
			
		«ELSEIF e instanceof NegExpr»
			«var neg = e as NegExpr»
			!(«generateExpression(neg.subExpr,scope)»)
		«ELSEIF e instanceof OutputExpression»
			«var out = e as OutputExpression»
			output(«generateExpression(out.parameter,scope)»)
		«ELSEIF e instanceof SeqExpression»
			«var se = e as SeqExpression»
			seq«sequences»(«FOR sub : se.subExpressions SEPARATOR ','»«generateExpression(sub,scope)»«ENDFOR» )
			«{sequences=sequences+1;null}»
		«ELSEIF e instanceof CompositeExpr»
			«var ce = e as CompositeExpr»
			«var left = ce.subExpressions.get(0)»
			«var right = ce.subExpressions.get(1)»
			«var o = ce.operator»
			«IF (left instanceof InputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				parseInt(«generateExpression(left,scope)»)
			«ELSEIF left instanceof InputExpression && o.getName=="EQUALS"»
				«IF right instanceof NumberExpression»
					parseInt(«generateExpression(left,scope)»)
				«ELSEIF right instanceof CompositeExpr»
					«IF (right as CompositeExpr).operator=="PLUS" || (right as CompositeExpr).operator=="MINUS"|| (right as CompositeExpr).operator=="TIMES"|| (right as CompositeExpr).operator=="DIVIDE"|| (right as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(left,scope)»)
					«ELSE»
					«generateExpression(left,scope)»
					«ENDIF»
				«ENDIF»	
				
			«ELSEIF (left instanceof OutputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				parseInt(«generateExpression(left,scope)»)
			«ELSEIF left instanceof OutputExpression && o.getName=="EQUALS"»
				«IF right instanceof NumberExpression»
					parseInt(«generateExpression(left,scope)»)
				«ELSEIF right instanceof CompositeExpr»
					«IF (right as CompositeExpr).operator=="PLUS" || (right as CompositeExpr).operator=="MINUS"|| (right as CompositeExpr).operator=="TIMES"|| (right as CompositeExpr).operator=="DIVIDE"|| (right as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(left,scope)»)
					«ELSE»
					«generateExpression(left,scope)»
					«ENDIF»
				«ENDIF»	
			«ELSEIF (left instanceof GetExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE")»
				parseInt(«generateExpression(left,scope)»)
			«ELSEIF left instanceof GetExpression && o.getName=="EQUALS"»
				«IF right instanceof NumberExpression»
					parseInt(«generateExpression(left,scope)»)
				«ELSEIF right instanceof CompositeExpr»
					«IF (right as CompositeExpr).operator=="PLUS" || (right as CompositeExpr).operator=="MINUS"|| (right as CompositeExpr).operator=="TIMES"|| (right as CompositeExpr).operator=="DIVIDE"|| (right as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(left,scope)»)
					«ELSE»
					«generateExpression(left,scope)»
					«ENDIF»
				«ENDIF»	
				
				
			«ELSE»
				«generateExpression(left,scope)»
			«ENDIF»«generateOperator(o)»
			«IF (right instanceof InputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				parseInt(«generateExpression(right,scope)»)
			«ELSEIF right instanceof InputExpression && o.getName=="EQUALS"»
				«IF left instanceof NumberExpression»
					parseInt(«generateExpression(right,scope)»)
				«ELSEIF left instanceof CompositeExpr»
					«IF (left as CompositeExpr).operator=="PLUS" || (left as CompositeExpr).operator=="MINUS"|| (left as CompositeExpr).operator=="TIMES"|| (left as CompositeExpr).operator=="DIVIDE"|| (left as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(right,scope)»)
					«ELSE»
					«generateExpression(right,scope)»
				«ENDIF»
			«ENDIF»

			«ELSEIF (right instanceof OutputExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE") »
				parseInt(«generateExpression(right,scope)»)
			«ELSEIF right instanceof OutputExpression && o.getName=="EQUALS"»
				«IF left instanceof NumberExpression»
					parseInt(«generateExpression(right,scope)»)
				«ELSEIF left instanceof CompositeExpr»
					«IF (left as CompositeExpr).operator=="PLUS" || (left as CompositeExpr).operator=="MINUS"|| (left as CompositeExpr).operator=="TIMES"|| (left as CompositeExpr).operator=="DIVIDE"|| (left as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(right,scope)»)
					«ELSE»
					«generateExpression(right,scope)»
				«ENDIF»
			«ENDIF»
			«ELSEIF (right instanceof GetExpression) && (o.getName=="PLUS" || o.getName=="SMALLERTHAN" || o.getName=="MINUS" || o.getName=="TIMES" || o.getName=="DIVIDE")»
				parseInt(«generateExpression(right,scope)»)
			«ELSEIF right instanceof GetExpression && o.getName=="EQUALS"»
				«IF left instanceof NumberExpression»
					parseInt(«generateExpression(right,scope)»)
				«ELSEIF left instanceof CompositeExpr»
					«IF (left as CompositeExpr).operator=="PLUS" || (left as CompositeExpr).operator=="MINUS"|| (left as CompositeExpr).operator=="TIMES"|| (left as CompositeExpr).operator=="DIVIDE"|| (left as CompositeExpr).operator=="SMALLERTHAN"»
					parseInt(«generateExpression(right,scope)»)
					«ELSE»
					«generateExpression(right,scope)»
					«ENDIF»
				«ENDIF»

			«ELSE»
				«generateExpression(right,scope)»
			«ENDIF»
		«ELSEIF e instanceof MapExpression»
			«var me = e as MapExpression»
			«me.name»
		«ELSEIF e instanceof PutExpression»
			«var pe = e as PutExpression»
			«var m = pe.map»
			put(«generateExpression(m,scope)»,«generateExpression(pe.keyExpr,scope)»,«generateExpression(pe.valExpr,scope)»)
		«ELSEIF e instanceof GetExpression»
			«var ge = e as GetExpression»
			
			get(«generateExpression(ge.map,scope)»,«generateExpression(ge.keyExpr,scope)»)
		«ELSEIF e instanceof RemoveExpression»
			«var re = e as RemoveExpression»
			remove(«generateExpression(re.map,scope)»,«generateExpression(re.keyExpr,scope)»)
		«ENDIF»'''
		
	def generateOperator(Operator o)'''
		«var operator = o.getName»
			«IF operator=="PLUS"»	+	«ELSEIF operator=="MINUS"»	-  «ELSEIF operator=="OR"»	||  «ELSEIF operator=="AND"»  &&  «ELSEIF operator=="TIMES"»  *  «ELSEIF operator=="DIVIDE"»  /  «ELSEIF operator=="CONCAT"»  +  «ELSEIF operator=="SMALLERTHAN"»  <  «ELSEIF operator=="EQUALS"»  ==  «ENDIF»'''
		
	def generateSequences(HashMap<Expression,HashMap<String,String>> h)'''
	«FOR s : h.keySet»
		«var map = h.get(s)»
		«FOR k : map.keySet»
			«var type= map.get(k)»
			«{if(type.equals("int")){
				type="Integer";
				}
				else if(type.equals("boolean")){
					type="Boolean"	
				};null}»
			public static «type» «k»(Object... o){
				Object r = new Object();
				for(Object aux :o){
					r=aux;
				}
				return («type»)r;
			}
		«ENDFOR»
	«ENDFOR»
	'''
	def generateMaps(String scope)'''
	«var localMaps = mapMaps.get(scope)»
	«IF localMaps != null»
		«FOR k : localMaps.keySet »
			«var m = localMaps.get(k)»
			«var keyType = m.keyType»
			«var valType = m.valueType»
			«{if(keyType.equals("int")){
				keyType = "Integer"
				};null}»
			«{if(valType.equals("int")){
				valType = "Integer"
				};null}»
			HashMap<«keyType»,«valType»> «k» = new HashMap<>();
			«FOR p : m.values»
				put(«k»,«generateExpression(p.key,scope)»,«generateExpression(p.value,scope)»);
			«ENDFOR»
			
		«ENDFOR»
	«ENDIF»
	'''
	
}
