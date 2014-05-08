/**
 */
package Lista;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.CompositeExpr#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link Lista.CompositeExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getCompositeExpr()
 * @model
 * @generated
 */
public interface CompositeExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link Lista.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expressions</em>' containment reference list.
	 * @see Lista.ListaPackage#getCompositeExpr_SubExpressions()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getSubExpressions();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Lista.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Lista.Operator
	 * @see #setOperator(Operator)
	 * @see Lista.ListaPackage#getCompositeExpr_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link Lista.CompositeExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Lista.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // CompositeExpr
