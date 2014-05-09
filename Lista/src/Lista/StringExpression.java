/**
 */
package Lista;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.StringExpression#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute list.
	 * @see Lista.ListaPackage#getStringExpression_String()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getString();

} // StringExpression
