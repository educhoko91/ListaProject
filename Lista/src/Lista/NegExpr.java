/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neg Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.NegExpr#getSubExpr <em>Sub Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getNegExpr()
 * @model
 * @generated
 */
public interface NegExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Sub Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expr</em>' containment reference.
	 * @see #setSubExpr(Expression)
	 * @see Lista.ListaPackage#getNegExpr_SubExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSubExpr();

	/**
	 * Sets the value of the '{@link Lista.NegExpr#getSubExpr <em>Sub Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Expr</em>' containment reference.
	 * @see #getSubExpr()
	 * @generated
	 */
	void setSubExpr(Expression value);

} // NegExpr
