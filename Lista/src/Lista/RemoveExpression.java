/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.RemoveExpression#getMap <em>Map</em>}</li>
 *   <li>{@link Lista.RemoveExpression#getKeyExpr <em>Key Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getRemoveExpression()
 * @model
 * @generated
 */
public interface RemoveExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Expression)
	 * @see Lista.ListaPackage#getRemoveExpression_Map()
	 * @model required="true"
	 * @generated
	 */
	Expression getMap();

	/**
	 * Sets the value of the '{@link Lista.RemoveExpression#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Expression value);

	/**
	 * Returns the value of the '<em><b>Key Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Expr</em>' containment reference.
	 * @see #setKeyExpr(Expression)
	 * @see Lista.ListaPackage#getRemoveExpression_KeyExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getKeyExpr();

	/**
	 * Sets the value of the '{@link Lista.RemoveExpression#getKeyExpr <em>Key Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Expr</em>' containment reference.
	 * @see #getKeyExpr()
	 * @generated
	 */
	void setKeyExpr(Expression value);

} // RemoveExpression
