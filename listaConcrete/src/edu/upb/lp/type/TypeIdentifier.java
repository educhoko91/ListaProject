package edu.upb.lp.type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.util.Types;

import Lista.BooleanExpression;
import Lista.CompositeExpr;
import Lista.Evaluation;
import Lista.Expression;
import Lista.FunctionCall;
import Lista.FunctionDefinition;
import Lista.GetExpression;
import Lista.Identifier;
import Lista.IfExpression;
import Lista.MapExpression;
import Lista.NegExpr;
import Lista.NumberExpression;
import Lista.Operator;
import Lista.OutputExpression;
import Lista.Pair;
import Lista.PairExpr;
import Lista.Program;
import Lista.PutExpression;
import Lista.RemoveExpression;
import Lista.SeqExpression;
import Lista.StringExpression;

public class TypeIdentifier {

	private static TypeIdentifier ti;

	public static final String TYPEINT = "int";
	public static final String TYPESTRING = "String";
	public static final String TYPEBOOLEAN = "boolean";
	public static final String NOTYPE = "error";
	public static final String TYPEMAP = "HashMap";

	private HashMap<String, HashMap<String, String>> map = new HashMap<>();
	private HashMap<Expression, HashMap<String,String>> sequences = new HashMap<>();
	private int sequenceNumber =0;
	
	private HashMap<String, HashMap<String, MapExpression>> mapMaps = new HashMap<>();

	private TypeIdentifier(Program prog) {
		initMap(prog);
	}

	private void initMap(Program prog) {
		HashMap<String, HashMap<String, String>> prevMap = new HashMap<>();
		HashMap<String, String> global = new HashMap<>();
		map.put("global", global);
		EList<FunctionDefinition> listFD = prog.getFunctionDefinitions();
		int cnd = 0;
		while(!map.equals(prevMap)) {
			prevMap = (HashMap<String, HashMap<String, String>>)map.clone();
			for (FunctionDefinition fd : listFD) {
				HashMap<String, String> aux = new HashMap<>();
				if(!global.containsKey(fd.getName()))
					global.put(fd.getName(), NOTYPE);
				String fType = recursiveInitMap(fd.getExpression(), aux, NOTYPE);
				global.put(fd.getName(), fType);
				map.put(fd.getName(), aux);
				
			}
			System.out.println(++cnd);
		}
		//nueva linea
				recursiveInitMap(prog.getEvaluation().getExpression(), new HashMap<String,String>(), NOTYPE);
	}

	private String recursiveInitMap(Expression exp, HashMap<String, String> aux,String type) {
		
		
		if (exp instanceof CompositeExpr) {
			CompositeExpr cexp = (CompositeExpr) exp;
			Operator o = cexp.getOperator();
			try {
				Expression left = cexp.getSubExpressions().get(0);
				Expression right = cexp.getSubExpressions().get(1);
				if (o == Operator.PLUS || o == Operator.MINUS
						|| o == Operator.DIVIDE || o == Operator.TIMES
						|| o == Operator.SMALLERTHAN) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEINT);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEINT);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMap(left, aux,TYPEINT);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMap(right, aux,TYPEINT);
					}
	
					if (o == Operator.SMALLERTHAN) {
						return TYPEBOOLEAN;
					} else {
						return TYPEINT;
					}
	
				} else if (o == Operator.CONCAT) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPESTRING);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPESTRING);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMap(left, aux, TYPESTRING);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMap(right, aux, TYPESTRING);
					}
	
					return TYPESTRING;
				} else if (o == Operator.AND || o == Operator.OR) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEBOOLEAN);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEBOOLEAN);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMap(left, aux, TYPEBOOLEAN);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMap(right, aux, TYPEBOOLEAN);
					}
	
					return TYPEBOOLEAN;
				} else if (o == Operator.EQUALS) {
					if (left instanceof Identifier && right instanceof Identifier) {
						if(!aux.containsKey(((Identifier) left).getName()))
							aux.put(((Identifier) left).getName(), NOTYPE);
						else
							return aux.get(((Identifier) left).getName());
						if(!aux.containsKey(((Identifier) right).getName()))
							aux.put(((Identifier) right).getName(), NOTYPE);
						else
							return aux.get(((Identifier) right).getName());
						return NOTYPE;
					} else if (left instanceof NumberExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEINT);
					} else if (right instanceof NumberExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEINT);
					} else if (left instanceof StringExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPESTRING);
					}
					
					if (right instanceof StringExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPESTRING);
					}
	
					if (left instanceof BooleanExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEBOOLEAN);
					}
	
					if (right instanceof BooleanExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEBOOLEAN);
					}
	
					if (!(left instanceof Identifier)
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(),
								recursiveInitMap(left, aux,type));
					}
	
					if (!(right instanceof Identifier)
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(),
								recursiveInitMap(right, aux, type));
					}
	
					if (!(right instanceof Identifier)
							&& !(left instanceof Identifier)) {
						String rs = recursiveInitMap(right, aux, type);
						String ls = recursiveInitMap(left, aux, type);
						if(rs==NOTYPE) {
							recursiveInitMap(right, aux, recursiveInitMap(left, aux, type));
						}
						if(ls==NOTYPE) {
							recursiveInitMap(left, aux, recursiveInitMap(right, aux, type));
						}
					}
					
					
	
					return TYPEBOOLEAN;
				}
			} catch (Exception e) {}

		}
		
		if(exp instanceof IfExpression) {
			IfExpression ifexp = (IfExpression) exp;
			recursiveInitMap(ifexp.getCond(), aux, TYPEBOOLEAN);
			String a = recursiveInitMap(ifexp.getConsequent(), aux, type);
			String b = recursiveInitMap(ifexp.getAlternative(), aux, type);
			
			if(a==NOTYPE && b!=NOTYPE){
				a = recursiveInitMap(ifexp.getConsequent(), aux, b);
			}
			
			if(a!=NOTYPE && b==NOTYPE){
				b = recursiveInitMap(ifexp.getAlternative(), aux, a);
			}
			
			if(a==NOTYPE || b==NOTYPE) {
				return NOTYPE;
			} else {
				if(a.equals(b)) {
					return a;
				}
				else
					return NOTYPE;
			}
		}
		
		if(exp instanceof SeqExpression) {
			SeqExpression secExp = (SeqExpression) exp;
			Iterator<Expression> iter = secExp.getSubExpressions().iterator();
			
			while (iter.hasNext()) {
				Expression auxExp = iter.next();
				if(!iter.hasNext()) {
					String tipoAux = recursiveInitMap(auxExp, aux, type);
					if(sequences.containsKey(secExp)){
						HashMap<String,String> seqAux = sequences.get(secExp);
						for(String seq : seqAux.keySet()){
							seqAux.put(seq, tipoAux);
						}
						sequences.put(secExp, seqAux);
					}
					else{
						HashMap<String,String> seqAux = new HashMap<>();
						seqAux.put("seq"+sequenceNumber, tipoAux);
						sequences.put(secExp,seqAux);
						sequenceNumber++;
					}
					return tipoAux;
				} else
					recursiveInitMap(auxExp, aux, NOTYPE);
				
			}
		}
		
		if(exp instanceof Identifier) {
			Identifier iExp = (Identifier) exp;
			if(aux.containsKey(iExp.getName()))
				if(aux.get(iExp.getName())==NOTYPE) {
					aux.put(iExp.getName(), type);
					return type;
				} else
					return aux.get(iExp.getName());
			else {
				aux.put(iExp.getName(), type);
				return type;
			}
		}
		
		if(exp instanceof NumberExpression)
			return TYPEINT;
		
		if (exp instanceof StringExpression)
			return TYPESTRING;
		
		if (exp instanceof BooleanExpression)
			return TYPEBOOLEAN;
		
		if(exp instanceof OutputExpression) {
			OutputExpression outExp= (OutputExpression) exp;
			return recursiveInitMap(outExp.getParameter(), aux, type);
		}
		// f(a,b) = g(a,b)
		// g(x,y) = x+y
		if(exp instanceof FunctionCall) {
			FunctionCall fc = (FunctionCall) exp;
			FunctionDefinition fd = fc.getFunction();
			int i = 0;
			for(Expression e : fc.getArguments()) {
				recursiveInitMapFunctionCall(e, aux, type,fd.getName(), fd.getParameters().get(i).getName());
				i++;
			}
			if(map.get("global").get(fd.getName()).equals(NOTYPE))
				return type;
			else
				return map.get("global").get(fd.getName());
			
		}
		if(exp instanceof NegExpr) {
			NegExpr ne = (NegExpr)exp;
			recursiveInitMap(ne.getSubExpr(), aux, TYPEBOOLEAN);
			return TYPEBOOLEAN;
		}
		
		if(exp instanceof MapExpression) {
			MapExpression me = (MapExpression) exp;
			for(PairExpr e : me.getValues()) {
				recursiveInitMap(e.getKey(), aux, me.getKeyType());
				recursiveInitMap(e.getValue(), aux, me.getValueType());
			}
			aux.put(me.getName(), TYPEMAP);
			
			EObject fdo = (EObject) me;
			while(true) {
				fdo = fdo.eContainer();
				if(fdo instanceof FunctionDefinition)
					break;
				if(fdo instanceof Evaluation)
					break;
				
			}
			if(fdo instanceof FunctionDefinition) {
				FunctionDefinition fd = (FunctionDefinition) fdo;
				if(!mapMaps.containsKey(fd.getName())) {
					HashMap<String, MapExpression> aux2 = new HashMap<>();
					aux2.put(me.getName(), me);
					mapMaps.put(fd.getName(),aux2);
				}
				else {
					HashMap<String, MapExpression> aux2 = mapMaps.get(fd.getName());
					aux2.put(me.getName(), me);
				}
			}
			
			if(fdo instanceof Evaluation) {
				if(!mapMaps.containsKey("query")) {
					HashMap<String, MapExpression> aux2 = new HashMap<>();
					aux2.put(me.getName(), me);
					mapMaps.put("query",aux2);
				}
				else {
					HashMap<String, MapExpression> aux2 = mapMaps.get("query");
					aux2.put(me.getName(), me);
				}
			}
			
			return TYPEMAP;
		}
		
		if(exp instanceof PutExpression) {
			PutExpression pe = (PutExpression) exp;
			EObject fdo = (EObject)pe;
			MapExpression me = null;
			while(true) {
				fdo = fdo.eContainer();
				if(fdo instanceof FunctionDefinition)
					break;
				if(fdo instanceof Evaluation)
					break;
				
			}
			if(fdo instanceof FunctionDefinition) {
				FunctionDefinition fd = (FunctionDefinition) fdo;
				if(!mapMaps.containsKey(fd.getName())) {
					recursiveInitMap(pe.getMap(), aux, TYPEMAP);
					System.out.println(pe.getMap());
					return TYPEMAP;
				}
				else {
					me = mapMaps.get(fd.getName()).get(((MapExpression)pe.getMap()).getName());
				}
			}
			
			if(fdo instanceof Evaluation) {
				if(!mapMaps.containsKey("query")) {
					recursiveInitMap(pe.getMap(), aux, TYPEMAP);
					System.out.println(pe.getMap());
					return TYPEMAP;
				}
				else {
					me = mapMaps.get("query").get(((MapExpression)pe.getMap()).getName());
				}
			}
			
			
			recursiveInitMap(pe.getKeyExpr(), aux, me.getKeyType());
			recursiveInitMap(pe.getValExpr(), aux, me.getValueType());
			return TYPEMAP;
		}
		
		if(exp instanceof GetExpression) {
			GetExpression ge = (GetExpression) exp;
			
			Expression m = ge.getMap();
			recursiveInitMap(ge.getMap(), aux, TYPEMAP);
			if(m instanceof MapExpression){
				
				recursiveInitMap(ge.getKeyExpr(), aux, ((MapExpression)ge.getMap()).getKeyType());
				return ((MapExpression)ge.getMap()).getValueType();
			}
			else{
				return NOTYPE;
				
			}
		}
		
		if(exp instanceof RemoveExpression) {
			RemoveExpression re = (RemoveExpression) exp;
			Expression m = re.getMap();
			recursiveInitMap(re.getMap(), aux, TYPEMAP);
			if(m instanceof MapExpression){
				recursiveInitMap(re.getKeyExpr(), aux, ((MapExpression)re.getMap()).getKeyType());
				return TYPEMAP;
			}
			else{
				EObject fdo = (EObject)m;
				while(true){
					fdo = fdo.eContainer();
					if(fdo instanceof FunctionDefinition || fdo instanceof Evaluation)
						break;
				}
				if(fdo instanceof FunctionDefinition){
					
					recursiveInitMap(re.getKeyExpr(), aux, NOTYPE);
					return TYPEMAP;
				}
				if(fdo instanceof Evaluation){
					
					recursiveInitMap(re.getKeyExpr(), aux, NOTYPE);
					return TYPEMAP;
				}
				
			}
		}
		
		return NOTYPE;
	}
	
	
private String recursiveInitMapFunctionCall(Expression exp, HashMap<String, String> aux,String type, String f, String p) {
		
	//f(a,b)=g(a+2,b)
	//g(x,y)=x::y
	
	
		if (exp instanceof CompositeExpr) {
			CompositeExpr cexp = (CompositeExpr) exp;
			Operator o = cexp.getOperator();
			try {
				Expression left = cexp.getSubExpressions().get(0);
				Expression right = cexp.getSubExpressions().get(1);
				if (o == Operator.PLUS || o == Operator.MINUS
						|| o == Operator.DIVIDE || o == Operator.TIMES
						|| o == Operator.SMALLERTHAN) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEINT);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEINT);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMapFunctionCall(left, aux,TYPEINT,f,p);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMapFunctionCall(right, aux,TYPEINT,f,p);
					}
	
					if (o == Operator.SMALLERTHAN) {
						return TYPEBOOLEAN;
					} else {
						return TYPEINT;
					}
	
				} else if (o == Operator.CONCAT) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPESTRING);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPESTRING);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMapFunctionCall(left, aux, TYPESTRING,f,p);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMapFunctionCall(right, aux, TYPESTRING,f,p);
					}
	
					return TYPESTRING;
				} else if (o == Operator.AND || o == Operator.OR) {
					if (left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEBOOLEAN);
					}
					if (right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEBOOLEAN);
					}
	
					if (!(left instanceof Identifier)) {
						recursiveInitMapFunctionCall(left, aux, TYPEBOOLEAN,f,p);
					}
	
					if (!(right instanceof Identifier)) {
						recursiveInitMapFunctionCall(right, aux, TYPEBOOLEAN,f,p);
					}
	
					return TYPEBOOLEAN;
				} else if (o == Operator.EQUALS) {
					if (left instanceof Identifier && right instanceof Identifier) {
						if(!aux.containsKey(((Identifier) left).getName()))
							aux.put(((Identifier) left).getName(), NOTYPE);
						else
							return aux.get(((Identifier) left).getName());
						if(!aux.containsKey(((Identifier) right).getName()))
							aux.put(((Identifier) right).getName(), NOTYPE);
						else
							return aux.get(((Identifier) right).getName());
						return NOTYPE;
					} else if (left instanceof NumberExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEINT);
					} else if (right instanceof NumberExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEINT);
					} else if (left instanceof StringExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPESTRING);
					}
					
					if (right instanceof StringExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPESTRING);
					}
	
					if (left instanceof BooleanExpression
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(), TYPEBOOLEAN);
					}
	
					if (right instanceof BooleanExpression
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(), TYPEBOOLEAN);
					}
	
					if (!(left instanceof Identifier)
							&& right instanceof Identifier) {
						aux.put(((Identifier) right).getName(),
								recursiveInitMapFunctionCall(left, aux,type,f,p));
					}
	
					if (!(right instanceof Identifier)
							&& left instanceof Identifier) {
						aux.put(((Identifier) left).getName(),
								recursiveInitMapFunctionCall(right, aux, type,f,p));
					}
	
					if (!(right instanceof Identifier)
							&& !(left instanceof Identifier)) {
						String rs = recursiveInitMapFunctionCall(right, aux, type,f,p);
						String ls = recursiveInitMapFunctionCall(left, aux, type,f,p);
						if(rs==NOTYPE) {
							recursiveInitMapFunctionCall(right, aux, recursiveInitMapFunctionCall(left, aux, type,f,p),f,p);
						}
						if(ls==NOTYPE) {
							recursiveInitMapFunctionCall(left, aux, recursiveInitMapFunctionCall(right, aux, type,f,p),f,p);
						}
					}
	
					return TYPEBOOLEAN;
				}
			} catch (Exception e) {}

		}
		
		if(exp instanceof IfExpression) {
			IfExpression ifexp = (IfExpression) exp;
			recursiveInitMapFunctionCall(ifexp.getCond(), aux, TYPEBOOLEAN,f,p);
			String a = recursiveInitMapFunctionCall(ifexp.getConsequent(), aux, type,f,p);
			String b = recursiveInitMapFunctionCall(ifexp.getAlternative(), aux, type,f,p);
			
			if(a==NOTYPE && b!=NOTYPE){
				a = recursiveInitMapFunctionCall(ifexp.getConsequent(), aux, b,f,p);
			}
			
			if(a!=NOTYPE && b==NOTYPE){
				b = recursiveInitMapFunctionCall(ifexp.getAlternative(), aux, a,f,p);
			}
			
			if(a==NOTYPE || b==NOTYPE) {
				return NOTYPE;
			} else {
				if(a.equals(b)) {
					return a;
				}
				else
					return NOTYPE;
			}
		}
		
		if(exp instanceof SeqExpression) {
			SeqExpression secExp = (SeqExpression) exp;
			Iterator<Expression> iter = secExp.getSubExpressions().iterator();
			
			while (iter.hasNext()) {
				Expression auxExp = iter.next();
				if(!iter.hasNext()) {
					String tipoAux = recursiveInitMapFunctionCall(auxExp, aux, type,f,p);
					if(sequences.containsKey(secExp)){
						HashMap<String,String> seqAux = sequences.get(secExp);
						for(String seq : seqAux.keySet()){
							seqAux.put(seq, tipoAux);
						}
						sequences.put(secExp, seqAux);
					}
					else{
						HashMap<String,String> seqAux = new HashMap<>();
						seqAux.put("seq"+sequenceNumber, tipoAux);
						sequences.put(secExp,seqAux);
						sequenceNumber++;
					}
					return tipoAux;
				} else
					recursiveInitMapFunctionCall(auxExp, aux, NOTYPE,f,p);
				
			}
		}
		
		if(exp instanceof Identifier) {
			Identifier iExp = (Identifier) exp;
			if(aux.containsKey(iExp.getName()))
				if(aux.get(iExp.getName())==NOTYPE) {
					if(map.containsKey(f))
						aux.put(iExp.getName(), map.get(f).get(p));
					return type;
				} else
					return aux.get(iExp.getName());
			else {
				if(map.containsKey(f))
					aux.put(iExp.getName(), map.get(f).get(p));
				return type;
			}
		}
		
		if(exp instanceof NumberExpression)
			return TYPEINT;
		
		if (exp instanceof StringExpression)
			return TYPESTRING;
		
		if (exp instanceof BooleanExpression)
			return TYPEBOOLEAN;
		
		if(exp instanceof OutputExpression) {
			OutputExpression outExp= (OutputExpression) exp;
			return recursiveInitMap(outExp.getParameter(), aux, type);
		}
		// f(a,b) = g(a,b)
		// g(x,y) = x+y
		if(exp instanceof FunctionCall) {
			FunctionCall fc = (FunctionCall) exp;
			FunctionDefinition fd = fc.getFunction();
			int j = 0;
			
			for(Expression e : fc.getArguments()) {
				recursiveInitMapFunctionCall(e, aux, type,fd.getName(), fd.getParameters().get(j).getName());
				j++;
			}
			//String s=recursiveInitMap(fd.getExpression(), aux, type);
			if(map.get("global").get(fd.getName()).equals(NOTYPE))
				return type;
			else
				return map.get("global").get(fd.getName());
			
		}
		
		if(exp instanceof NegExpr) {
			NegExpr ne = (NegExpr)exp;
			recursiveInitMapFunctionCall(ne.getSubExpr(), aux, TYPEBOOLEAN,f,p);
			return TYPEBOOLEAN;
		}
		

		if(exp instanceof MapExpression) {
			MapExpression me = (MapExpression) exp;
			for(PairExpr e : me.getValues()) {
				recursiveInitMapFunctionCall(e.getKey(), aux, me.getKeyType(),f,p);
				recursiveInitMapFunctionCall(e.getValue(), aux, me.getValueType(),f,p);
			}
			aux.put(me.getName(), TYPEMAP);
			
			EObject fdo = (EObject) me;
			while(true) {
				fdo = fdo.eContainer();
				if(fdo instanceof FunctionDefinition)
					break;
				if(fdo instanceof Evaluation)
					break;
				
			}
			if(fdo instanceof FunctionDefinition) {
				FunctionDefinition fd = (FunctionDefinition) fdo;
				if(!mapMaps.containsKey(fd.getName())) {
					HashMap<String, MapExpression> aux2 = new HashMap<>();
					aux2.put(me.getName(), me);
					mapMaps.put(fd.getName(),aux2);
				}
				else {
					HashMap<String, MapExpression> aux2 = mapMaps.get(fd.getName());
					aux2.put(me.getName(), me);
				}
			}
			
			if(fdo instanceof Evaluation) {
				if(!mapMaps.containsKey("query")) {
					HashMap<String, MapExpression> aux2 = new HashMap<>();
					aux2.put(me.getName(), me);
					mapMaps.put("query",aux2);
				}
				else {
					HashMap<String, MapExpression> aux2 = mapMaps.get("query");
					aux2.put(me.getName(), me);
				}
			}
			
			return TYPEMAP;
		}
		
		if(exp instanceof PutExpression) {
			PutExpression pe = (PutExpression) exp;
			EObject fdo = (EObject)pe;
			MapExpression me = null;
			while(true) {
				fdo = fdo.eContainer();
				if(fdo instanceof FunctionDefinition)
					break;
				if(fdo instanceof Evaluation)
					break;
				
			}
			if(fdo instanceof FunctionDefinition) {
				FunctionDefinition fd = (FunctionDefinition) fdo;
				if(!mapMaps.containsKey(fd.getName())) {
					recursiveInitMapFunctionCall(pe.getMap(), aux, TYPEMAP,f,p);
					System.out.println(pe.getMap());
					return TYPEMAP;
				}
				else {
					me = mapMaps.get(fd.getName()).get(((MapExpression)pe.getMap()).getName());
				}
			}
			
			if(fdo instanceof Evaluation) {
				if(!mapMaps.containsKey("query")) {
					recursiveInitMapFunctionCall(pe.getMap(), aux, TYPEMAP,f,p);
					System.out.println(pe.getMap());
					return TYPEMAP;
				}
				else {
					me = mapMaps.get("query").get(((MapExpression)pe.getMap()).getName());
				}
			}
			
			
			recursiveInitMapFunctionCall(pe.getKeyExpr(), aux, me.getKeyType(),f,p);
			recursiveInitMapFunctionCall(pe.getValExpr(), aux, me.getValueType(),f,p);
			return TYPEMAP;
		}
		
		if(exp instanceof GetExpression) {
			GetExpression ge = (GetExpression) exp;
			
			Expression m = ge.getMap();
			recursiveInitMapFunctionCall(ge.getMap(), aux, TYPEMAP,f,p);
			if(m instanceof MapExpression){
				
				recursiveInitMapFunctionCall(ge.getKeyExpr(), aux, ((MapExpression)ge.getMap()).getKeyType(),f,p);
				return ((MapExpression)ge.getMap()).getValueType();
			}
			else{
				return NOTYPE;
				
			}
		}
		
		if(exp instanceof RemoveExpression) {
			RemoveExpression re = (RemoveExpression) exp;
			Expression m = re.getMap();
			recursiveInitMapFunctionCall(re.getMap(), aux, TYPEMAP,f,p);
			if(m instanceof MapExpression){
				recursiveInitMapFunctionCall(re.getKeyExpr(), aux, ((MapExpression)re.getMap()).getKeyType(),f,p);
				return TYPEMAP;
			}
			else{
				EObject fdo = (EObject)m;
				while(true){
					fdo = fdo.eContainer();
					if(fdo instanceof FunctionDefinition || fdo instanceof Evaluation)
						break;
				}
				if(fdo instanceof FunctionDefinition){
					
					recursiveInitMapFunctionCall(re.getKeyExpr(), aux, NOTYPE,f,p);
					return TYPEMAP;
				}
				if(fdo instanceof Evaluation){
					
					recursiveInitMapFunctionCall(re.getKeyExpr(), aux, NOTYPE,f,p);
					return TYPEMAP;
				}
				
			}
		}
		
		
		return NOTYPE;
	}
	
	
	
	
	
	

	/*
	 * private void initMap(Program prog) { EList<FunctionDefinition> listFD =
	 * prog.getFunctionDefinitions(); for(FunctionDefinition fd: listFD) {
	 * map.put(key, value) }
	 */

	public static TypeIdentifier getInstance(Program prog) {
		if (ti == null) {
			ti = new TypeIdentifier(prog);
			ti.initMap(prog);

			return ti;
		} else {
			ti.map = new HashMap<>();
			ti.sequences = new HashMap<>();
			ti.sequenceNumber=0;
			ti.mapMaps = new HashMap<>();
			ti.initMap(prog);
			return ti;
		}
	}

	public HashMap<String, HashMap<String, String>> getHashMap() {
		return map;
	}

	public HashMap<Expression,HashMap<String,String>> getSequences(){
		return sequences;
	}
	
	public HashMap<String, HashMap<String, MapExpression>> getMapMaps() {
		return mapMaps;
	}
}
