/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.OutputExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getOutputExpression()
 * @model
 * @generated
 */
public interface OutputExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Expression)
	 * @see Lista.ListaPackage#getOutputExpression_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getParameter();

	/**
	 * Sets the value of the '{@link Lista.OutputExpression#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Expression value);

} // OutputExpression
