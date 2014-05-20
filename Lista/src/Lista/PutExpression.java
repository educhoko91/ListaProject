/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Put Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.PutExpression#getMap <em>Map</em>}</li>
 *   <li>{@link Lista.PutExpression#getKeyExpr <em>Key Expr</em>}</li>
 *   <li>{@link Lista.PutExpression#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getPutExpression()
 * @model
 * @generated
 */
public interface PutExpression extends Expression {
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
	 * @see Lista.ListaPackage#getPutExpression_Map()
	 * @model required="true"
	 * @generated
	 */
	Expression getMap();

	/**
	 * Sets the value of the '{@link Lista.PutExpression#getMap <em>Map</em>}' reference.
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
	 * @see Lista.ListaPackage#getPutExpression_KeyExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getKeyExpr();

	/**
	 * Sets the value of the '{@link Lista.PutExpression#getKeyExpr <em>Key Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Expr</em>' containment reference.
	 * @see #getKeyExpr()
	 * @generated
	 */
	void setKeyExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Val Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Expr</em>' containment reference.
	 * @see #setValExpr(Expression)
	 * @see Lista.ListaPackage#getPutExpression_ValExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValExpr();

	/**
	 * Sets the value of the '{@link Lista.PutExpression#getValExpr <em>Val Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Expr</em>' containment reference.
	 * @see #getValExpr()
	 * @generated
	 */
	void setValExpr(Expression value);

} // PutExpression
