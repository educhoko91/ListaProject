/**
 */
package Lista.impl;

import Lista.Expression;
import Lista.ListaPackage;
import Lista.NegExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neg Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lista.impl.NegExprImpl#getSubExpr <em>Sub Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegExprImpl extends ExpressionImpl implements NegExpr {
	/**
	 * The cached value of the '{@link #getSubExpr() <em>Sub Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression subExpr;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListaPackage.Literals.NEG_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSubExpr() {
		return subExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubExpr(Expression newSubExpr, NotificationChain msgs) {
		Expression oldSubExpr = subExpr;
		subExpr = newSubExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.NEG_EXPR__SUB_EXPR, oldSubExpr, newSubExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubExpr(Expression newSubExpr) {
		if (newSubExpr != subExpr) {
			NotificationChain msgs = null;
			if (subExpr != null)
				msgs = ((InternalEObject)subExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.NEG_EXPR__SUB_EXPR, null, msgs);
			if (newSubExpr != null)
				msgs = ((InternalEObject)newSubExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.NEG_EXPR__SUB_EXPR, null, msgs);
			msgs = basicSetSubExpr(newSubExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.NEG_EXPR__SUB_EXPR, newSubExpr, newSubExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListaPackage.NEG_EXPR__SUB_EXPR:
				return basicSetSubExpr(null, msgs);
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
			case ListaPackage.NEG_EXPR__SUB_EXPR:
				return getSubExpr();
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
			case ListaPackage.NEG_EXPR__SUB_EXPR:
				setSubExpr((Expression)newValue);
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
			case ListaPackage.NEG_EXPR__SUB_EXPR:
				setSubExpr((Expression)null);
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
			case ListaPackage.NEG_EXPR__SUB_EXPR:
				return subExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //NegExprImpl
