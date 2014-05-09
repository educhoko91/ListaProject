/**
 */
package Lista.impl;

import Lista.CompositeTerm;
import Lista.Factor;
import Lista.ListaPackage;
import Lista.Term;
import Lista.TermOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lista.impl.CompositeTermImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link Lista.impl.CompositeTermImpl#getSubTerm <em>Sub Term</em>}</li>
 *   <li>{@link Lista.impl.CompositeTermImpl#getSubFactor <em>Sub Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTermImpl extends TermImpl implements CompositeTerm {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TermOperator OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TermOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubTerm() <em>Sub Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTerm()
	 * @generated
	 * @ordered
	 */
	protected Term subTerm;

	/**
	 * The cached value of the '{@link #getSubFactor() <em>Sub Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFactor()
	 * @generated
	 * @ordered
	 */
	protected Factor subFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListaPackage.Literals.COMPOSITE_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TermOperator newOperator) {
		TermOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.COMPOSITE_TERM__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getSubTerm() {
		return subTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubTerm(Term newSubTerm, NotificationChain msgs) {
		Term oldSubTerm = subTerm;
		subTerm = newSubTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.COMPOSITE_TERM__SUB_TERM, oldSubTerm, newSubTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTerm(Term newSubTerm) {
		if (newSubTerm != subTerm) {
			NotificationChain msgs = null;
			if (subTerm != null)
				msgs = ((InternalEObject)subTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.COMPOSITE_TERM__SUB_TERM, null, msgs);
			if (newSubTerm != null)
				msgs = ((InternalEObject)newSubTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.COMPOSITE_TERM__SUB_TERM, null, msgs);
			msgs = basicSetSubTerm(newSubTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.COMPOSITE_TERM__SUB_TERM, newSubTerm, newSubTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getSubFactor() {
		return subFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubFactor(Factor newSubFactor, NotificationChain msgs) {
		Factor oldSubFactor = subFactor;
		subFactor = newSubFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.COMPOSITE_TERM__SUB_FACTOR, oldSubFactor, newSubFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubFactor(Factor newSubFactor) {
		if (newSubFactor != subFactor) {
			NotificationChain msgs = null;
			if (subFactor != null)
				msgs = ((InternalEObject)subFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.COMPOSITE_TERM__SUB_FACTOR, null, msgs);
			if (newSubFactor != null)
				msgs = ((InternalEObject)newSubFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.COMPOSITE_TERM__SUB_FACTOR, null, msgs);
			msgs = basicSetSubFactor(newSubFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.COMPOSITE_TERM__SUB_FACTOR, newSubFactor, newSubFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListaPackage.COMPOSITE_TERM__SUB_TERM:
				return basicSetSubTerm(null, msgs);
			case ListaPackage.COMPOSITE_TERM__SUB_FACTOR:
				return basicSetSubFactor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListaPackage.COMPOSITE_TERM__OPERATOR:
				return getOperator();
			case ListaPackage.COMPOSITE_TERM__SUB_TERM:
				return getSubTerm();
			case ListaPackage.COMPOSITE_TERM__SUB_FACTOR:
				return getSubFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ListaPackage.COMPOSITE_TERM__OPERATOR:
				setOperator((TermOperator)newValue);
				return;
			case ListaPackage.COMPOSITE_TERM__SUB_TERM:
				setSubTerm((Term)newValue);
				return;
			case ListaPackage.COMPOSITE_TERM__SUB_FACTOR:
				setSubFactor((Factor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ListaPackage.COMPOSITE_TERM__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ListaPackage.COMPOSITE_TERM__SUB_TERM:
				setSubTerm((Term)null);
				return;
			case ListaPackage.COMPOSITE_TERM__SUB_FACTOR:
				setSubFactor((Factor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ListaPackage.COMPOSITE_TERM__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ListaPackage.COMPOSITE_TERM__SUB_TERM:
				return subTerm != null;
			case ListaPackage.COMPOSITE_TERM__SUB_FACTOR:
				return subFactor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CompositeTermImpl
