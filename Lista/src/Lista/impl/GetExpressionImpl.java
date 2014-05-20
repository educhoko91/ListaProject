/**
 */
package Lista.impl;

import Lista.Expression;
import Lista.GetExpression;
import Lista.ListaPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lista.impl.GetExpressionImpl#getMap <em>Map</em>}</li>
 *   <li>{@link Lista.impl.GetExpressionImpl#getKeyExpr <em>Key Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetExpressionImpl extends ExpressionImpl implements GetExpression {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Expression map;

	/**
	 * The cached value of the '{@link #getKeyExpr() <em>Key Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression keyExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListaPackage.Literals.GET_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject)map;
			map = (Expression)eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ListaPackage.GET_EXPRESSION__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Expression newMap) {
		Expression oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.GET_EXPRESSION__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getKeyExpr() {
		return keyExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyExpr(Expression newKeyExpr, NotificationChain msgs) {
		Expression oldKeyExpr = keyExpr;
		keyExpr = newKeyExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.GET_EXPRESSION__KEY_EXPR, oldKeyExpr, newKeyExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyExpr(Expression newKeyExpr) {
		if (newKeyExpr != keyExpr) {
			NotificationChain msgs = null;
			if (keyExpr != null)
				msgs = ((InternalEObject)keyExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.GET_EXPRESSION__KEY_EXPR, null, msgs);
			if (newKeyExpr != null)
				msgs = ((InternalEObject)newKeyExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.GET_EXPRESSION__KEY_EXPR, null, msgs);
			msgs = basicSetKeyExpr(newKeyExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.GET_EXPRESSION__KEY_EXPR, newKeyExpr, newKeyExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListaPackage.GET_EXPRESSION__KEY_EXPR:
				return basicSetKeyExpr(null, msgs);
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
			case ListaPackage.GET_EXPRESSION__MAP:
				if (resolve) return getMap();
				return basicGetMap();
			case ListaPackage.GET_EXPRESSION__KEY_EXPR:
				return getKeyExpr();
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
			case ListaPackage.GET_EXPRESSION__MAP:
				setMap((Expression)newValue);
				return;
			case ListaPackage.GET_EXPRESSION__KEY_EXPR:
				setKeyExpr((Expression)newValue);
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
			case ListaPackage.GET_EXPRESSION__MAP:
				setMap((Expression)null);
				return;
			case ListaPackage.GET_EXPRESSION__KEY_EXPR:
				setKeyExpr((Expression)null);
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
			case ListaPackage.GET_EXPRESSION__MAP:
				return map != null;
			case ListaPackage.GET_EXPRESSION__KEY_EXPR:
				return keyExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //GetExpressionImpl
