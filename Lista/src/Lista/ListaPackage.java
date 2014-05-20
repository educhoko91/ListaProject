/**
 */
package Lista;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Lista.ListaFactory
 * @model kind="package"
 * @generated
 */
public interface ListaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Lista";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.edu/Lista";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Lista";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListaPackage eINSTANCE = Lista.impl.ListaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Lista.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.ProgramImpl
	 * @see Lista.impl.ListaPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Function Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTION_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__EVALUATION = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lista.impl.ProgramComponentImpl <em>Program Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.ProgramComponentImpl
	 * @see Lista.impl.ListaPackageImpl#getProgramComponent()
	 * @generated
	 */
	int PROGRAM_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Program Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Program Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lista.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.FunctionDefinitionImpl
	 * @see Lista.impl.ListaPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__NAME = PROGRAM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PARAMETERS = PROGRAM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__EXPRESSION = PROGRAM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = PROGRAM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = PROGRAM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.EvaluationImpl
	 * @see Lista.impl.ListaPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EXPRESSION = PROGRAM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = PROGRAM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = PROGRAM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.ExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lista.impl.NegExprImpl <em>Neg Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.NegExprImpl
	 * @see Lista.impl.ListaPackageImpl#getNegExpr()
	 * @generated
	 */
	int NEG_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Sub Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR__SUB_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neg Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neg Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.CompositeExprImpl <em>Composite Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.CompositeExprImpl
	 * @see Lista.impl.ListaPackageImpl#getCompositeExpr()
	 * @generated
	 */
	int COMPOSITE_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXPR__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.NumberExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getNumberExpression()
	 * @generated
	 */
	int NUMBER_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPRESSION__NUMBER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.StringExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__STRING = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.TermImpl
	 * @see Lista.impl.ListaPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 11;

	/**
	 * The meta object id for the '{@link Lista.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.FactorImpl
	 * @see Lista.impl.ListaPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 13;

	/**
	 * The meta object id for the '{@link Lista.impl.ParentesizedExpImpl <em>Parentesized Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.ParentesizedExpImpl
	 * @see Lista.impl.ListaPackageImpl#getParentesizedExp()
	 * @generated
	 */
	int PARENTESIZED_EXP = 14;

	/**
	 * The meta object id for the '{@link Lista.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.IfExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 15;

	/**
	 * The meta object id for the '{@link Lista.impl.whileExpressionImpl <em>while Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.whileExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getwhileExpression()
	 * @generated
	 */
	int WHILE_EXPRESSION = 16;

	/**
	 * The meta object id for the '{@link Lista.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.BooleanExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 17;

	/**
	 * The meta object id for the '{@link Lista.impl.SeqExpressionImpl <em>Seq Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.SeqExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getSeqExpression()
	 * @generated
	 */
	int SEQ_EXPRESSION = 18;

	/**
	 * The meta object id for the '{@link Lista.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.Operator
	 * @see Lista.impl.ListaPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 26;

	/**
	 * The meta object id for the '{@link Lista.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.IdentifierImpl
	 * @see Lista.impl.ListaPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.FunctionCallImpl
	 * @see Lista.impl.ListaPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 10;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.CompositeTermImpl <em>Composite Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.CompositeTermImpl
	 * @see Lista.impl.ListaPackageImpl#getCompositeTerm()
	 * @generated
	 */
	int COMPOSITE_TERM = 12;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__OPERATOR = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__SUB_TERM = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__SUB_FACTOR = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTESIZED_EXP__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parentesized Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTESIZED_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parentesized Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTESIZED_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__COND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__CONSEQUENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ALTERNATIVE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>while Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>while Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seq Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Seq Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.InputExpressionImpl <em>Input Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.InputExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getInputExpression()
	 * @generated
	 */
	int INPUT_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EXPRESSION__MESSAGE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.OutputExpressionImpl <em>Output Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.OutputExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getOutputExpression()
	 * @generated
	 */
	int OUTPUT_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EXPRESSION__PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.MapExpressionImpl <em>Map Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.MapExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getMapExpression()
	 * @generated
	 */
	int MAP_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__KEY_TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__VALUES = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Map Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Map Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.PairImpl
	 * @see Lista.impl.ListaPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 22;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lista.impl.PutExpressionImpl <em>Put Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.PutExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getPutExpression()
	 * @generated
	 */
	int PUT_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_EXPRESSION__MAP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_EXPRESSION__KEY_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_EXPRESSION__VAL_EXPR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Put Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Put Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.GetExpressionImpl <em>Get Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.GetExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getGetExpression()
	 * @generated
	 */
	int GET_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION__MAP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION__KEY_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Get Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.impl.RemoveExpressionImpl <em>Remove Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.impl.RemoveExpressionImpl
	 * @see Lista.impl.ListaPackageImpl#getRemoveExpression()
	 * @generated
	 */
	int REMOVE_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_EXPRESSION__MAP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_EXPRESSION__KEY_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remove Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Lista.TermOperator <em>Term Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lista.TermOperator
	 * @see Lista.impl.ListaPackageImpl#getTermOperator()
	 * @generated
	 */
	int TERM_OPERATOR = 27;


	/**
	 * Returns the meta object for class '{@link Lista.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see Lista.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.Program#getFunctionDefinitions <em>Function Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Definitions</em>'.
	 * @see Lista.Program#getFunctionDefinitions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_FunctionDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.Program#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see Lista.Program#getEvaluation()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Evaluation();

	/**
	 * Returns the meta object for class '{@link Lista.ProgramComponent <em>Program Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Component</em>'.
	 * @see Lista.ProgramComponent
	 * @generated
	 */
	EClass getProgramComponent();

	/**
	 * Returns the meta object for class '{@link Lista.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see Lista.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Lista.FunctionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Lista.FunctionDefinition#getName()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.FunctionDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Lista.FunctionDefinition#getParameters()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.FunctionDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Lista.FunctionDefinition#getExpression()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Expression();

	/**
	 * Returns the meta object for class '{@link Lista.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see Lista.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.Evaluation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Lista.Evaluation#getExpression()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Expression();

	/**
	 * Returns the meta object for class '{@link Lista.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see Lista.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link Lista.NegExpr <em>Neg Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg Expr</em>'.
	 * @see Lista.NegExpr
	 * @generated
	 */
	EClass getNegExpr();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.NegExpr#getSubExpr <em>Sub Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Expr</em>'.
	 * @see Lista.NegExpr#getSubExpr()
	 * @see #getNegExpr()
	 * @generated
	 */
	EReference getNegExpr_SubExpr();

	/**
	 * Returns the meta object for class '{@link Lista.CompositeExpr <em>Composite Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Expr</em>'.
	 * @see Lista.CompositeExpr
	 * @generated
	 */
	EClass getCompositeExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.CompositeExpr#getSubExpressions <em>Sub Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
	 * @see Lista.CompositeExpr#getSubExpressions()
	 * @see #getCompositeExpr()
	 * @generated
	 */
	EReference getCompositeExpr_SubExpressions();

	/**
	 * Returns the meta object for the attribute '{@link Lista.CompositeExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Lista.CompositeExpr#getOperator()
	 * @see #getCompositeExpr()
	 * @generated
	 */
	EAttribute getCompositeExpr_Operator();

	/**
	 * Returns the meta object for class '{@link Lista.NumberExpression <em>Number Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Expression</em>'.
	 * @see Lista.NumberExpression
	 * @generated
	 */
	EClass getNumberExpression();

	/**
	 * Returns the meta object for the attribute '{@link Lista.NumberExpression#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Lista.NumberExpression#getNumber()
	 * @see #getNumberExpression()
	 * @generated
	 */
	EAttribute getNumberExpression_Number();

	/**
	 * Returns the meta object for class '{@link Lista.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see Lista.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the attribute list '{@link Lista.StringExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String</em>'.
	 * @see Lista.StringExpression#getString()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_String();

	/**
	 * Returns the meta object for class '{@link Lista.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see Lista.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Lista.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Lista.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link Lista.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see Lista.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link Lista.FunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see Lista.FunctionCall#getFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Lista.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link Lista.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see Lista.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link Lista.CompositeTerm <em>Composite Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Term</em>'.
	 * @see Lista.CompositeTerm
	 * @generated
	 */
	EClass getCompositeTerm();

	/**
	 * Returns the meta object for the attribute '{@link Lista.CompositeTerm#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Lista.CompositeTerm#getOperator()
	 * @see #getCompositeTerm()
	 * @generated
	 */
	EAttribute getCompositeTerm_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.CompositeTerm#getSubTerm <em>Sub Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Term</em>'.
	 * @see Lista.CompositeTerm#getSubTerm()
	 * @see #getCompositeTerm()
	 * @generated
	 */
	EReference getCompositeTerm_SubTerm();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.CompositeTerm#getSubFactor <em>Sub Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Factor</em>'.
	 * @see Lista.CompositeTerm#getSubFactor()
	 * @see #getCompositeTerm()
	 * @generated
	 */
	EReference getCompositeTerm_SubFactor();

	/**
	 * Returns the meta object for class '{@link Lista.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see Lista.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for class '{@link Lista.ParentesizedExp <em>Parentesized Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parentesized Exp</em>'.
	 * @see Lista.ParentesizedExp
	 * @generated
	 */
	EClass getParentesizedExp();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.ParentesizedExp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Lista.ParentesizedExp#getExpression()
	 * @see #getParentesizedExp()
	 * @generated
	 */
	EReference getParentesizedExp_Expression();

	/**
	 * Returns the meta object for class '{@link Lista.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see Lista.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.IfExpression#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see Lista.IfExpression#getCond()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Cond();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.IfExpression#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequent</em>'.
	 * @see Lista.IfExpression#getConsequent()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Consequent();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.IfExpression#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative</em>'.
	 * @see Lista.IfExpression#getAlternative()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Alternative();

	/**
	 * Returns the meta object for class '{@link Lista.whileExpression <em>while Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>while Expression</em>'.
	 * @see Lista.whileExpression
	 * @generated
	 */
	EClass getwhileExpression();

	/**
	 * Returns the meta object for class '{@link Lista.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see Lista.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link Lista.BooleanExpression#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Lista.BooleanExpression#isValue()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Value();

	/**
	 * Returns the meta object for class '{@link Lista.SeqExpression <em>Seq Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Expression</em>'.
	 * @see Lista.SeqExpression
	 * @generated
	 */
	EClass getSeqExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.SeqExpression#getSubExpressions <em>Sub Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
	 * @see Lista.SeqExpression#getSubExpressions()
	 * @see #getSeqExpression()
	 * @generated
	 */
	EReference getSeqExpression_SubExpressions();

	/**
	 * Returns the meta object for class '{@link Lista.InputExpression <em>Input Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Expression</em>'.
	 * @see Lista.InputExpression
	 * @generated
	 */
	EClass getInputExpression();

	/**
	 * Returns the meta object for the attribute '{@link Lista.InputExpression#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see Lista.InputExpression#getMessage()
	 * @see #getInputExpression()
	 * @generated
	 */
	EAttribute getInputExpression_Message();

	/**
	 * Returns the meta object for class '{@link Lista.OutputExpression <em>Output Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Expression</em>'.
	 * @see Lista.OutputExpression
	 * @generated
	 */
	EClass getOutputExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.OutputExpression#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see Lista.OutputExpression#getParameter()
	 * @see #getOutputExpression()
	 * @generated
	 */
	EReference getOutputExpression_Parameter();

	/**
	 * Returns the meta object for class '{@link Lista.MapExpression <em>Map Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expression</em>'.
	 * @see Lista.MapExpression
	 * @generated
	 */
	EClass getMapExpression();

	/**
	 * Returns the meta object for the attribute '{@link Lista.MapExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Lista.MapExpression#getName()
	 * @see #getMapExpression()
	 * @generated
	 */
	EAttribute getMapExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link Lista.MapExpression#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Type</em>'.
	 * @see Lista.MapExpression#getKeyType()
	 * @see #getMapExpression()
	 * @generated
	 */
	EAttribute getMapExpression_KeyType();

	/**
	 * Returns the meta object for the attribute '{@link Lista.MapExpression#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see Lista.MapExpression#getValueType()
	 * @see #getMapExpression()
	 * @generated
	 */
	EAttribute getMapExpression_ValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link Lista.MapExpression#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see Lista.MapExpression#getValues()
	 * @see #getMapExpression()
	 * @generated
	 */
	EReference getMapExpression_Values();

	/**
	 * Returns the meta object for class '{@link Lista.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see Lista.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.Pair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see Lista.Pair#getKey()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.Pair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Lista.Pair#getValue()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Value();

	/**
	 * Returns the meta object for class '{@link Lista.PutExpression <em>Put Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Put Expression</em>'.
	 * @see Lista.PutExpression
	 * @generated
	 */
	EClass getPutExpression();

	/**
	 * Returns the meta object for the reference '{@link Lista.PutExpression#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see Lista.PutExpression#getMap()
	 * @see #getPutExpression()
	 * @generated
	 */
	EReference getPutExpression_Map();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.PutExpression#getKeyExpr <em>Key Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Expr</em>'.
	 * @see Lista.PutExpression#getKeyExpr()
	 * @see #getPutExpression()
	 * @generated
	 */
	EReference getPutExpression_KeyExpr();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.PutExpression#getValExpr <em>Val Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val Expr</em>'.
	 * @see Lista.PutExpression#getValExpr()
	 * @see #getPutExpression()
	 * @generated
	 */
	EReference getPutExpression_ValExpr();

	/**
	 * Returns the meta object for class '{@link Lista.GetExpression <em>Get Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Expression</em>'.
	 * @see Lista.GetExpression
	 * @generated
	 */
	EClass getGetExpression();

	/**
	 * Returns the meta object for the reference '{@link Lista.GetExpression#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see Lista.GetExpression#getMap()
	 * @see #getGetExpression()
	 * @generated
	 */
	EReference getGetExpression_Map();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.GetExpression#getKeyExpr <em>Key Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Expr</em>'.
	 * @see Lista.GetExpression#getKeyExpr()
	 * @see #getGetExpression()
	 * @generated
	 */
	EReference getGetExpression_KeyExpr();

	/**
	 * Returns the meta object for class '{@link Lista.RemoveExpression <em>Remove Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Expression</em>'.
	 * @see Lista.RemoveExpression
	 * @generated
	 */
	EClass getRemoveExpression();

	/**
	 * Returns the meta object for the reference '{@link Lista.RemoveExpression#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see Lista.RemoveExpression#getMap()
	 * @see #getRemoveExpression()
	 * @generated
	 */
	EReference getRemoveExpression_Map();

	/**
	 * Returns the meta object for the containment reference '{@link Lista.RemoveExpression#getKeyExpr <em>Key Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Expr</em>'.
	 * @see Lista.RemoveExpression#getKeyExpr()
	 * @see #getRemoveExpression()
	 * @generated
	 */
	EReference getRemoveExpression_KeyExpr();

	/**
	 * Returns the meta object for enum '{@link Lista.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see Lista.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link Lista.TermOperator <em>Term Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Operator</em>'.
	 * @see Lista.TermOperator
	 * @generated
	 */
	EEnum getTermOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListaFactory getListaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Lista.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.ProgramImpl
		 * @see Lista.impl.ListaPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Function Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTION_DEFINITIONS = eINSTANCE.getProgram_FunctionDefinitions();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__EVALUATION = eINSTANCE.getProgram_Evaluation();

		/**
		 * The meta object literal for the '{@link Lista.impl.ProgramComponentImpl <em>Program Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.ProgramComponentImpl
		 * @see Lista.impl.ListaPackageImpl#getProgramComponent()
		 * @generated
		 */
		EClass PROGRAM_COMPONENT = eINSTANCE.getProgramComponent();

		/**
		 * The meta object literal for the '{@link Lista.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.FunctionDefinitionImpl
		 * @see Lista.impl.ListaPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__PARAMETERS = eINSTANCE.getFunctionDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__EXPRESSION = eINSTANCE.getFunctionDefinition_Expression();

		/**
		 * The meta object literal for the '{@link Lista.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.EvaluationImpl
		 * @see Lista.impl.ListaPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__EXPRESSION = eINSTANCE.getEvaluation_Expression();

		/**
		 * The meta object literal for the '{@link Lista.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.ExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link Lista.impl.NegExprImpl <em>Neg Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.NegExprImpl
		 * @see Lista.impl.ListaPackageImpl#getNegExpr()
		 * @generated
		 */
		EClass NEG_EXPR = eINSTANCE.getNegExpr();

		/**
		 * The meta object literal for the '<em><b>Sub Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEG_EXPR__SUB_EXPR = eINSTANCE.getNegExpr_SubExpr();

		/**
		 * The meta object literal for the '{@link Lista.impl.CompositeExprImpl <em>Composite Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.CompositeExprImpl
		 * @see Lista.impl.ListaPackageImpl#getCompositeExpr()
		 * @generated
		 */
		EClass COMPOSITE_EXPR = eINSTANCE.getCompositeExpr();

		/**
		 * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_EXPR__SUB_EXPRESSIONS = eINSTANCE.getCompositeExpr_SubExpressions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_EXPR__OPERATOR = eINSTANCE.getCompositeExpr_Operator();

		/**
		 * The meta object literal for the '{@link Lista.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.NumberExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getNumberExpression()
		 * @generated
		 */
		EClass NUMBER_EXPRESSION = eINSTANCE.getNumberExpression();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_EXPRESSION__NUMBER = eINSTANCE.getNumberExpression_Number();

		/**
		 * The meta object literal for the '{@link Lista.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.StringExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__STRING = eINSTANCE.getStringExpression_String();

		/**
		 * The meta object literal for the '{@link Lista.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.IdentifierImpl
		 * @see Lista.impl.ListaPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link Lista.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.FunctionCallImpl
		 * @see Lista.impl.ListaPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link Lista.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.TermImpl
		 * @see Lista.impl.ListaPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link Lista.impl.CompositeTermImpl <em>Composite Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.CompositeTermImpl
		 * @see Lista.impl.ListaPackageImpl#getCompositeTerm()
		 * @generated
		 */
		EClass COMPOSITE_TERM = eINSTANCE.getCompositeTerm();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TERM__OPERATOR = eINSTANCE.getCompositeTerm_Operator();

		/**
		 * The meta object literal for the '<em><b>Sub Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TERM__SUB_TERM = eINSTANCE.getCompositeTerm_SubTerm();

		/**
		 * The meta object literal for the '<em><b>Sub Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TERM__SUB_FACTOR = eINSTANCE.getCompositeTerm_SubFactor();

		/**
		 * The meta object literal for the '{@link Lista.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.FactorImpl
		 * @see Lista.impl.ListaPackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '{@link Lista.impl.ParentesizedExpImpl <em>Parentesized Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.ParentesizedExpImpl
		 * @see Lista.impl.ListaPackageImpl#getParentesizedExp()
		 * @generated
		 */
		EClass PARENTESIZED_EXP = eINSTANCE.getParentesizedExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTESIZED_EXP__EXPRESSION = eINSTANCE.getParentesizedExp_Expression();

		/**
		 * The meta object literal for the '{@link Lista.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.IfExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__COND = eINSTANCE.getIfExpression_Cond();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__CONSEQUENT = eINSTANCE.getIfExpression_Consequent();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ALTERNATIVE = eINSTANCE.getIfExpression_Alternative();

		/**
		 * The meta object literal for the '{@link Lista.impl.whileExpressionImpl <em>while Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.whileExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getwhileExpression()
		 * @generated
		 */
		EClass WHILE_EXPRESSION = eINSTANCE.getwhileExpression();

		/**
		 * The meta object literal for the '{@link Lista.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.BooleanExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

		/**
		 * The meta object literal for the '{@link Lista.impl.SeqExpressionImpl <em>Seq Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.SeqExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getSeqExpression()
		 * @generated
		 */
		EClass SEQ_EXPRESSION = eINSTANCE.getSeqExpression();

		/**
		 * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ_EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getSeqExpression_SubExpressions();

		/**
		 * The meta object literal for the '{@link Lista.impl.InputExpressionImpl <em>Input Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.InputExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getInputExpression()
		 * @generated
		 */
		EClass INPUT_EXPRESSION = eINSTANCE.getInputExpression();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_EXPRESSION__MESSAGE = eINSTANCE.getInputExpression_Message();

		/**
		 * The meta object literal for the '{@link Lista.impl.OutputExpressionImpl <em>Output Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.OutputExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getOutputExpression()
		 * @generated
		 */
		EClass OUTPUT_EXPRESSION = eINSTANCE.getOutputExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_EXPRESSION__PARAMETER = eINSTANCE.getOutputExpression_Parameter();

		/**
		 * The meta object literal for the '{@link Lista.impl.MapExpressionImpl <em>Map Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.MapExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getMapExpression()
		 * @generated
		 */
		EClass MAP_EXPRESSION = eINSTANCE.getMapExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_EXPRESSION__NAME = eINSTANCE.getMapExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_EXPRESSION__KEY_TYPE = eINSTANCE.getMapExpression_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_EXPRESSION__VALUE_TYPE = eINSTANCE.getMapExpression_ValueType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXPRESSION__VALUES = eINSTANCE.getMapExpression_Values();

		/**
		 * The meta object literal for the '{@link Lista.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.PairImpl
		 * @see Lista.impl.ListaPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__KEY = eINSTANCE.getPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VALUE = eINSTANCE.getPair_Value();

		/**
		 * The meta object literal for the '{@link Lista.impl.PutExpressionImpl <em>Put Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.PutExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getPutExpression()
		 * @generated
		 */
		EClass PUT_EXPRESSION = eINSTANCE.getPutExpression();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_EXPRESSION__MAP = eINSTANCE.getPutExpression_Map();

		/**
		 * The meta object literal for the '<em><b>Key Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_EXPRESSION__KEY_EXPR = eINSTANCE.getPutExpression_KeyExpr();

		/**
		 * The meta object literal for the '<em><b>Val Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUT_EXPRESSION__VAL_EXPR = eINSTANCE.getPutExpression_ValExpr();

		/**
		 * The meta object literal for the '{@link Lista.impl.GetExpressionImpl <em>Get Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.GetExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getGetExpression()
		 * @generated
		 */
		EClass GET_EXPRESSION = eINSTANCE.getGetExpression();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_EXPRESSION__MAP = eINSTANCE.getGetExpression_Map();

		/**
		 * The meta object literal for the '<em><b>Key Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_EXPRESSION__KEY_EXPR = eINSTANCE.getGetExpression_KeyExpr();

		/**
		 * The meta object literal for the '{@link Lista.impl.RemoveExpressionImpl <em>Remove Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.impl.RemoveExpressionImpl
		 * @see Lista.impl.ListaPackageImpl#getRemoveExpression()
		 * @generated
		 */
		EClass REMOVE_EXPRESSION = eINSTANCE.getRemoveExpression();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_EXPRESSION__MAP = eINSTANCE.getRemoveExpression_Map();

		/**
		 * The meta object literal for the '<em><b>Key Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_EXPRESSION__KEY_EXPR = eINSTANCE.getRemoveExpression_KeyExpr();

		/**
		 * The meta object literal for the '{@link Lista.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.Operator
		 * @see Lista.impl.ListaPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link Lista.TermOperator <em>Term Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lista.TermOperator
		 * @see Lista.impl.ListaPackageImpl#getTermOperator()
		 * @generated
		 */
		EEnum TERM_OPERATOR = eINSTANCE.getTermOperator();

	}

} //ListaPackage
