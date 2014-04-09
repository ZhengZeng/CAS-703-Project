/**
 */
package recorder.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recorder.DispContainer;
import recorder.RecDisplay;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disp Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.DispContainerImpl#getDisplays <em>Displays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispContainerImpl extends MinimalEObjectImpl.Container implements DispContainer {
	/**
	 * The cached value of the '{@link #getDisplays() <em>Displays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplays()
	 * @generated
	 * @ordered
	 */
	protected EList<RecDisplay> displays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.DISP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecDisplay> getDisplays() {
		if (displays == null) {
			displays = new EObjectContainmentEList<RecDisplay>(RecDisplay.class, this, RecorderPackage.DISP_CONTAINER__DISPLAYS);
		}
		return displays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecorderPackage.DISP_CONTAINER__DISPLAYS:
				return ((InternalEList<?>)getDisplays()).basicRemove(otherEnd, msgs);
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
			case RecorderPackage.DISP_CONTAINER__DISPLAYS:
				return getDisplays();
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
			case RecorderPackage.DISP_CONTAINER__DISPLAYS:
				getDisplays().clear();
				getDisplays().addAll((Collection<? extends RecDisplay>)newValue);
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
			case RecorderPackage.DISP_CONTAINER__DISPLAYS:
				getDisplays().clear();
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
			case RecorderPackage.DISP_CONTAINER__DISPLAYS:
				return displays != null && !displays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DispContainerImpl
