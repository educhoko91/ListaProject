package edu.upb.lp.type;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import Lista.CompositeExpr;
import Lista.Expression;
import Lista.FunctionCall;
import Lista.FunctionDefinition;
import Lista.Identifier;
import Lista.NumberExpression;
import Lista.Operator;
import Lista.Program;

public class TypeIdentifier {
	
	private TypeIdentifier ti;
	
	public static final String TYPEINT = "int";
	public static final String TYPESTRIGN = "String";
	
	private HashMap<String,HashMap<String, String>> map = new HashMap<>();
	
	private TypeIdentifier(Program prog) {
		initMap(prog);
	}
	
	private void initMap(Program prog) {
		EList<FunctionDefinition> listFD =  prog.getFunctionDefinitions();
		for(FunctionDefinition fd: listFD) {
			HashMap<String, String> aux = new HashMap<>();
			recursiveInitMap(fd.getExpression(),aux);
					
		
			//map.put(fd.getName(), )
		}
	}
	
	private String recursiveInitMap(Expression exp, HashMap<String, String> aux) {
		if(exp instanceof CompositeExpr) {
			CompositeExpr cexp = (CompositeExpr) exp;
			Operator o =  cexp.getOperator();
			if(o==Operator.PLUS || o==Operator.MINUS || o==Operator.DIVIDE || o==Operator.TIMES || o==Operator.SMALLERTHAN) {
				Expression left = cexp.getSubExpressions().get(0);
				Expression right = cexp.getSubExpressions().get(1);
				if(left instanceof Identifier) {
					aux.put(((Identifier)left).getName(), TYPEINT);
				}
				if(right instanceof Identifier) {
					aux.put(((Identifier)right).getName(), TYPEINT);
				}
				
				if(left instanceof CompositeExpr) {
					recursiveInitMap(left, aux);
				}
				
				if(right instanceof CompositeExpr) {
					recursiveInitMap(right, aux);
				}
				
				if(left instanceof FunctionCall) {
					FunctionCall fc = (FunctionCall) left;
					//HashMap<S, V>
					//map.addfc.getFunction().getName()
				}
				
				
			}
			
		}
		return null;
	}
	
	/*private void initMap(Program prog) {
		EList<FunctionDefinition> listFD =  prog.getFunctionDefinitions();
		for(FunctionDefinition fd: listFD) {
			map.put(key, value)
	}*/
	
	public TypeIdentifier getInstance(Program prog) {
		if(ti == null) {
			ti = new TypeIdentifier(prog);
			initMap(prog);
			
			return ti;
		}
		else
			return ti;
	}

}
