/**
 */
package Lista;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lista.CompositeTerm#getOperator <em>Operator</em>}</li>
 *   <li>{@link Lista.CompositeTerm#getSubTerm <em>Sub Term</em>}</li>
 *   <li>{@link Lista.CompositeTerm#getSubFactor <em>Sub Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lista.ListaPackage#getCompositeTerm()
 * @model
 * @generated
 */
public interface CompositeTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Lista.TermOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Lista.TermOperator
	 * @see #setOperator(TermOperator)
	 * @see Lista.ListaPackage#getCompositeTerm_Operator()
	 * @model required="true"
	 * @generated
	 */
	TermOperator getOperator();

	/**
	 * Sets the value of the '{@link Lista.CompositeTerm#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Lista.TermOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TermOperator value);

	/**
	 * Returns the value of the '<em><b>Sub Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Term</em>' containment reference.
	 * @see #setSubTerm(Term)
	 * @see Lista.ListaPackage#getCompositeTerm_SubTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getSubTerm();

	/**
	 * Sets the value of the '{@link Lista.CompositeTerm#getSubTerm <em>Sub Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Term</em>' containment reference.
	 * @see #getSubTerm()
	 * @generated
	 */
	void setSubTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Sub Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Factor</em>' containment reference.
	 * @see #setSubFactor(Factor)
	 * @see Lista.ListaPackage#getCompositeTerm_SubFactor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Factor getSubFactor();

	/**
	 * Sets the value of the '{@link Lista.CompositeTerm#getSubFactor <em>Sub Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Factor</em>' containment reference.
	 * @see #getSubFactor()
	 * @generated
	 */
	void setSubFactor(Factor value);

} // CompositeTerm
