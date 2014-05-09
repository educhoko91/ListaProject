/**
 */
package Lista.impl;

import Lista.Evaluation;
import Lista.FunctionDefinition;
import Lista.ListaPackage;
import Lista.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lista.impl.ProgramImpl#getFunctionDefinitions <em>Function Definitions</em>}</li>
 *   <li>{@link Lista.impl.ProgramImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getFunctionDefinitions() <em>Function Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDefinition> functionDefinitions;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListaPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDefinition> getFunctionDefinitions() {
		if (functionDefinitions == null) {
			functionDefinitions = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, ListaPackage.PROGRAM__FUNCTION_DEFINITIONS);
		}
		return functionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListaPackage.PROGRAM__EVALUATION, oldEvaluation, newEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		if (newEvaluation != evaluation) {
			NotificationChain msgs = null;
			if (evaluation != null)
				msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PROGRAM__EVALUATION, null, msgs);
			if (newEvaluation != null)
				msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListaPackage.PROGRAM__EVALUATION, null, msgs);
			msgs = basicSetEvaluation(newEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListaPackage.PROGRAM__EVALUATION, newEvaluation, newEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListaPackage.PROGRAM__FUNCTION_DEFINITIONS:
				return ((InternalEList<?>)getFunctionDefinitions()).basicRemove(otherEnd, msgs);
			case ListaPackage.PROGRAM__EVALUATION:
				return basicSetEvaluation(null, msgs);
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
			case ListaPackage.PROGRAM__FUNCTION_DEFINITIONS:
				return getFunctionDefinitions();
			case ListaPackage.PROGRAM__EVALUATION:
				return getEvaluation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ListaPackage.PROGRAM__FUNCTION_DEFINITIONS:
				getFunctionDefinitions().clear();
				getFunctionDefinitions().addAll((Collection<? extends FunctionDefinition>)newValue);
				return;
			case ListaPackage.PROGRAM__EVALUATION:
				setEvaluation((Evaluation)newValue);
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
			case ListaPackage.PROGRAM__FUNCTION_DEFINITIONS:
				getFunctionDefinitions().clear();
				return;
			case ListaPackage.PROGRAM__EVALUATION:
				setEvaluation((Evaluation)null);
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
			case ListaPackage.PROGRAM__FUNCTION_DEFINITIONS:
				return functionDefinitions != null && !functionDefinitions.isEmpty();
			case ListaPackage.PROGRAM__EVALUATION:
				return evaluation != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
