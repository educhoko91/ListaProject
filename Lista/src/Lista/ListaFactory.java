/**
 */
package Lista;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Lista.ListaPackage
 * @generated
 */
public interface ListaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListaFactory eINSTANCE = Lista.impl.ListaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Definition</em>'.
	 * @generated
	 */
	FunctionDefinition createFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>Neg Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neg Expr</em>'.
	 * @generated
	 */
	NegExpr createNegExpr();

	/**
	 * Returns a new object of class '<em>Composite Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Expr</em>'.
	 * @generated
	 */
	CompositeExpr createCompositeExpr();

	/**
	 * Returns a new object of class '<em>Number Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Expression</em>'.
	 * @generated
	 */
	NumberExpression createNumberExpression();

	/**
	 * Returns a new object of class '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Expression</em>'.
	 * @generated
	 */
	StringExpression createStringExpression();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Composite Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Term</em>'.
	 * @generated
	 */
	CompositeTerm createCompositeTerm();

	/**
	 * Returns a new object of class '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factor</em>'.
	 * @generated
	 */
	Factor createFactor();

	/**
	 * Returns a new object of class '<em>Parentesized Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parentesized Exp</em>'.
	 * @generated
	 */
	ParentesizedExp createParentesizedExp();

	/**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
	IfExpression createIfExpression();

	/**
	 * Returns a new object of class '<em>while Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>while Expression</em>'.
	 * @generated
	 */
	whileExpression createwhileExpression();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Seq Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Expression</em>'.
	 * @generated
	 */
	SeqExpression createSeqExpression();

	/**
	 * Returns a new object of class '<em>Input Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Expression</em>'.
	 * @generated
	 */
	InputExpression createInputExpression();

	/**
	 * Returns a new object of class '<em>Output Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Expression</em>'.
	 * @generated
	 */
	OutputExpression createOutputExpression();

	/**
	 * Returns a new object of class '<em>Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Expression</em>'.
	 * @generated
	 */
	MapExpression createMapExpression();

	/**
	 * Returns a new object of class '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair</em>'.
	 * @generated
	 */
	Pair createPair();

	/**
	 * Returns a new object of class '<em>Put Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Put Expression</em>'.
	 * @generated
	 */
	PutExpression createPutExpression();

	/**
	 * Returns a new object of class '<em>Get Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Expression</em>'.
	 * @generated
	 */
	GetExpression createGetExpression();

	/**
	 * Returns a new object of class '<em>Remove Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Expression</em>'.
	 * @generated
	 */
	RemoveExpression createRemoveExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ListaPackage getListaPackage();

} //ListaFactory
