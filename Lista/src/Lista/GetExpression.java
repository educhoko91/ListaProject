/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.GetExpression#getMap <em>Map</em>}</li>
 *   <li>{@link Lista.GetExpression#getKeyExpr <em>Key Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getGetExpression()
 * @model
 * @generated
 */
public interface GetExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(MapExpression)
	 * @see Lista.ListaPackage#getGetExpression_Map()
	 * @model required="true"
	 * @generated
	 */
	MapExpression getMap();

	/**
	 * Sets the value of the '{@link Lista.GetExpression#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(MapExpression value);

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
	 * @see Lista.ListaPackage#getGetExpression_KeyExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getKeyExpr();

	/**
	 * Sets the value of the '{@link Lista.GetExpression#getKeyExpr <em>Key Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Expr</em>' containment reference.
	 * @see #getKeyExpr()
	 * @generated
	 */
	void setKeyExpr(Expression value);

} // GetExpression
