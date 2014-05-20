/**
 */
package Lista.impl;

import Lista.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListaFactoryImpl extends EFactoryImpl implements ListaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListaFactory init() {
		try {
			ListaFactory theListaFactory = (ListaFactory)EPackage.Registry.INSTANCE.getEFactory(ListaPackage.eNS_URI);
			if (theListaFactory != null) {
				return theListaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ListaPackage.PROGRAM: return createProgram();
			case ListaPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
			case ListaPackage.EVALUATION: return createEvaluation();
			case ListaPackage.NEG_EXPR: return createNegExpr();
			case ListaPackage.COMPOSITE_EXPR: return createCompositeExpr();
			case ListaPackage.NUMBER_EXPRESSION: return createNumberExpression();
			case ListaPackage.STRING_EXPRESSION: return createStringExpression();
			case ListaPackage.IDENTIFIER: return createIdentifier();
			case ListaPackage.FUNCTION_CALL: return createFunctionCall();
			case ListaPackage.COMPOSITE_TERM: return createCompositeTerm();
			case ListaPackage.FACTOR: return createFactor();
			case ListaPackage.PARENTESIZED_EXP: return createParentesizedExp();
			case ListaPackage.IF_EXPRESSION: return createIfExpression();
			case ListaPackage.WHILE_EXPRESSION: return createwhileExpression();
			case ListaPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case ListaPackage.SEQ_EXPRESSION: return createSeqExpression();
			case ListaPackage.INPUT_EXPRESSION: return createInputExpression();
			case ListaPackage.OUTPUT_EXPRESSION: return createOutputExpression();
			case ListaPackage.MAP_EXPRESSION: return createMapExpression();
			case ListaPackage.PAIR_EXPR: return createPairExpr();
			case ListaPackage.PUT_EXPRESSION: return createPutExpression();
			case ListaPackage.GET_EXPRESSION: return createGetExpression();
			case ListaPackage.REMOVE_EXPRESSION: return createRemoveExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ListaPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case ListaPackage.TERM_OPERATOR:
				return createTermOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ListaPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case ListaPackage.TERM_OPERATOR:
				return convertTermOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegExpr createNegExpr() {
		NegExprImpl negExpr = new NegExprImpl();
		return negExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeExpr createCompositeExpr() {
		CompositeExprImpl compositeExpr = new CompositeExprImpl();
		return compositeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberExpression createNumberExpression() {
		NumberExpressionImpl numberExpression = new NumberExpressionImpl();
		return numberExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTerm createCompositeTerm() {
		CompositeTermImpl compositeTerm = new CompositeTermImpl();
		return compositeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor createFactor() {
		FactorImpl factor = new FactorImpl();
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentesizedExp createParentesizedExp() {
		ParentesizedExpImpl parentesizedExp = new ParentesizedExpImpl();
		return parentesizedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileExpression createwhileExpression() {
		whileExpressionImpl whileExpression = new whileExpressionImpl();
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqExpression createSeqExpression() {
		SeqExpressionImpl seqExpression = new SeqExpressionImpl();
		return seqExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputExpression createInputExpression() {
		InputExpressionImpl inputExpression = new InputExpressionImpl();
		return inputExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputExpression createOutputExpression() {
		OutputExpressionImpl outputExpression = new OutputExpressionImpl();
		return outputExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExpression createMapExpression() {
		MapExpressionImpl mapExpression = new MapExpressionImpl();
		return mapExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PairExpr createPairExpr() {
		PairExprImpl pairExpr = new PairExprImpl();
		return pairExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PutExpression createPutExpression() {
		PutExpressionImpl putExpression = new PutExpressionImpl();
		return putExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetExpression createGetExpression() {
		GetExpressionImpl getExpression = new GetExpressionImpl();
		return getExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveExpression createRemoveExpression() {
		RemoveExpressionImpl removeExpression = new RemoveExpressionImpl();
		return removeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermOperator createTermOperatorFromString(EDataType eDataType, String initialValue) {
		TermOperator result = TermOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaPackage getListaPackage() {
		return (ListaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListaPackage getPackage() {
		return ListaPackage.eINSTANCE;
	}

} //ListaFactoryImpl
