/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.IfExpression#getCond <em>Cond</em>}</li>
 *   <li>{@link Lista.IfExpression#getConsequent <em>Consequent</em>}</li>
 *   <li>{@link Lista.IfExpression#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expression)
	 * @see Lista.ListaPackage#getIfExpression_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCond();

	/**
	 * Sets the value of the '{@link Lista.IfExpression#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expression value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' containment reference.
	 * @see #setConsequent(Expression)
	 * @see Lista.ListaPackage#getIfExpression_Consequent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getConsequent();

	/**
	 * Sets the value of the '{@link Lista.IfExpression#getConsequent <em>Consequent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' containment reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(Expression value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference.
	 * @see #setAlternative(Expression)
	 * @see Lista.ListaPackage#getIfExpression_Alternative()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlternative();

	/**
	 * Sets the value of the '{@link Lista.IfExpression#getAlternative <em>Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' containment reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Expression value);

} // IfExpression
