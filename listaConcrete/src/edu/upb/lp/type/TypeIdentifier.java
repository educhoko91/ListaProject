package edu.upb.lp.type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import com.google.inject.util.Types;

import Lista.BooleanExpression;
import Lista.CompositeExpr;
import Lista.Expression;
import Lista.FunctionCall;
import Lista.FunctionDefinition;
import Lista.Identifier;
import Lista.IfExpression;
import Lista.NumberExpression;
import Lista.Operator;
import Lista.OutputExpression;
import Lista.Program;
import Lista.SeqExpression;
import Lista.StringExpression;

public class TypeIdentifier {

	private static TypeIdentifier ti;

	public static final String TYPEINT = "int";
	public static final String TYPESTRING = "String";
	public static final String TYPEBOOLEAN = "boolean";
	public static final String NOTYPE = "error";
	private static boolean modifed = true;

	private HashMap<String, HashMap<String, String>> map = new HashMap<>();

	private TypeIdentifier(Program prog) {
		initMap(prog);
	}

	private void initMap(Program prog) {
		this.modifed= true;
		HashMap<String, String> global = new HashMap<>();
		map.put("global", global);
		EList<FunctionDefinition> listFD = prog.getFunctionDefinitions();
		for (FunctionDefinition fd : listFD) {
			HashMap<String, String> aux = new HashMap<>();
			String fType = recursiveInitMap(fd.getExpression(), aux, NOTYPE);
			global.put(fd.getName(), fType);
			map.put(fd.getName(), aux);
		}
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
						aux.put(((Identifier) left).getName(), NOTYPE);
						aux.put(((Identifier) right).getName(), NOTYPE);
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
					return recursiveInitMap(auxExp, aux, type);
				} else
					recursiveInitMap(auxExp, aux, type);
				
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
			ti.initMap(prog);
			return ti;
		}
	}

	public HashMap<String, HashMap<String, String>> getHashMap() {
		return map;
	}

}
