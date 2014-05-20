/**
 */
package Lista.impl;

import Lista.Expression;
import Lista.ListaPackage;
import Lista.PutExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Put Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lista.impl.PutExpressionImpl#getMap <em>Map</em>}</li>
 *   <li>{@link Lista.impl.PutExpressionImpl#getKeyExpr <em>Key Expr</em>}</li>
 *   <li>{@link Lista.impl.PutExpressionImpl#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PutExpressionImpl extends ExpressionImpl implements PutExpression {
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
	 * The cached value of the '{@link #getValExpr() <em>Val Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression valExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PutExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListaPackage.Literals.PUT_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ListaPackage.PUT_EXPRESSION__MAP, oldMap, map));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.PUT_EXPRESSION__MAP, oldMap, map));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.PUT_EXPRESSION__KEY_EXPR, oldKeyExpr, newKeyExpr);
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
				msgs = ((InternalEObject)keyExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PUT_EXPRESSION__KEY_EXPR, null, msgs);
			if (newKeyExpr != null)
				msgs = ((InternalEObject)newKeyExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PUT_EXPRESSION__KEY_EXPR, null, msgs);
			msgs = basicSetKeyExpr(newKeyExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.PUT_EXPRESSION__KEY_EXPR, newKeyExpr, newKeyExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValExpr() {
		return valExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValExpr(Expression newValExpr, NotificationChain msgs) {
		Expression oldValExpr = valExpr;
		valExpr = newValExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.PUT_EXPRESSION__VAL_EXPR, oldValExpr, newValExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValExpr(Expression newValExpr) {
		if (newValExpr != valExpr) {
			NotificationChain msgs = null;
			if (valExpr != null)
				msgs = ((InternalEObject)valExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PUT_EXPRESSION__VAL_EXPR, null, msgs);
			if (newValExpr != null)
				msgs = ((InternalEObject)newValExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PUT_EXPRESSION__VAL_EXPR, null, msgs);
			msgs = basicSetValExpr(newValExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.PUT_EXPRESSION__VAL_EXPR, newValExpr, newValExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListaPackage.PUT_EXPRESSION__KEY_EXPR:
				return basicSetKeyExpr(null, msgs);
			case ListaPackage.PUT_EXPRESSION__VAL_EXPR:
				return basicSetValExpr(null, msgs);
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
			case ListaPackage.PUT_EXPRESSION__MAP:
				if (resolve) return getMap();
				return basicGetMap();
			case ListaPackage.PUT_EXPRESSION__KEY_EXPR:
				return getKeyExpr();
			case ListaPackage.PUT_EXPRESSION__VAL_EXPR:
				return getValExpr();
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
			case ListaPackage.PUT_EXPRESSION__MAP:
				setMap((Expression)newValue);
				return;
			case ListaPackage.PUT_EXPRESSION__KEY_EXPR:
				setKeyExpr((Expression)newValue);
				return;
			case ListaPackage.PUT_EXPRESSION__VAL_EXPR:
				setValExpr((Expression)newValue);
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
			case ListaPackage.PUT_EXPRESSION__MAP:
				setMap((Expression)null);
				return;
			case ListaPackage.PUT_EXPRESSION__KEY_EXPR:
				setKeyExpr((Expression)null);
				return;
			case ListaPackage.PUT_EXPRESSION__VAL_EXPR:
				setValExpr((Expression)null);
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
			case ListaPackage.PUT_EXPRESSION__MAP:
				return map != null;
			case ListaPackage.PUT_EXPRESSION__KEY_EXPR:
				return keyExpr != null;
			case ListaPackage.PUT_EXPRESSION__VAL_EXPR:
				return valExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //PutExpressionImpl
