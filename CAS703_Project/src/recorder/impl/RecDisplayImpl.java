/**
 */
package recorder.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import recorder.RecColor;
import recorder.RecDisplay;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.RecDisplayImpl#getDispColor <em>Disp Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecDisplayImpl extends RecComponentImpl implements RecDisplay {
	/**
	 * The default value of the '{@link #getDispColor() <em>Disp Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispColor()
	 * @generated
	 * @ordered
	 */
	protected static final RecColor DISP_COLOR_EDEFAULT = RecColor.RED;

	/**
	 * The cached value of the '{@link #getDispColor() <em>Disp Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispColor()
	 * @generated
	 * @ordered
	 */
	protected RecColor dispColor = DISP_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecDisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.REC_DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecColor getDispColor() {
		return dispColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispColor(RecColor newDispColor) {
		RecColor oldDispColor = dispColor;
		dispColor = newDispColor == null ? DISP_COLOR_EDEFAULT : newDispColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_DISPLAY__DISP_COLOR, oldDispColor, dispColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecorderPackage.REC_DISPLAY__DISP_COLOR:
				return getDispColor();
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
			case RecorderPackage.REC_DISPLAY__DISP_COLOR:
				setDispColor((RecColor)newValue);
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
			case RecorderPackage.REC_DISPLAY__DISP_COLOR:
				setDispColor(DISP_COLOR_EDEFAULT);
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
			case RecorderPackage.REC_DISPLAY__DISP_COLOR:
				return dispColor != DISP_COLOR_EDEFAULT;
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
		result.append(" (dispColor: ");
		result.append(dispColor);
		result.append(')');
		return result.toString();
	}

} //RecDisplayImpl
