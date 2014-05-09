/**
 */
package Lista;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.FunctionCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Lista.FunctionCall#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link Lista.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see Lista.ListaPackage#getFunctionCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionDefinition)
	 * @see Lista.ListaPackage#getFunctionCall_Function()
	 * @model required="true"
	 * @generated
	 */
	FunctionDefinition getFunction();

	/**
	 * Sets the value of the '{@link Lista.FunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionDefinition value);

} // FunctionCall
