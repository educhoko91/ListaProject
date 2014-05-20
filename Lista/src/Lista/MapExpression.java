/**
 */
package Lista;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.MapExpression#getName <em>Name</em>}</li>
 *   <li>{@link Lista.MapExpression#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link Lista.MapExpression#getValueType <em>Value Type</em>}</li>
 *   <li>{@link Lista.MapExpression#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getMapExpression()
 * @model
 * @generated
 */
public interface MapExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Lista.ListaPackage#getMapExpression_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Lista.MapExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' attribute.
	 * @see #setKeyType(String)
	 * @see Lista.ListaPackage#getMapExpression_KeyType()
	 * @model required="true"
	 * @generated
	 */
	String getKeyType();

	/**
	 * Sets the value of the '{@link Lista.MapExpression#getKeyType <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' attribute.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see Lista.ListaPackage#getMapExpression_ValueType()
	 * @model required="true"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link Lista.MapExpression#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link Lista.PairExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see Lista.ListaPackage#getMapExpression_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<PairExpr> getValues();

} // MapExpression
