/**
 */
package recorder.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import recorder.CommandType;
import recorder.RecButton;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.RecButtonImpl#getCmdName <em>Cmd Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecButtonImpl extends RecComponentImpl implements RecButton {
	/**
	 * The default value of the '{@link #getCmdName() <em>Cmd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdName()
	 * @generated
	 * @ordered
	 */
	protected static final CommandType CMD_NAME_EDEFAULT = CommandType.START;

	/**
	 * The cached value of the '{@link #getCmdName() <em>Cmd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdName()
	 * @generated
	 * @ordered
	 */
	protected CommandType cmdName = CMD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.REC_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType getCmdName() {
		return cmdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdName(CommandType newCmdName) {
		CommandType oldCmdName = cmdName;
		cmdName = newCmdName == null ? CMD_NAME_EDEFAULT : newCmdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_BUTTON__CMD_NAME, oldCmdName, cmdName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecorderPackage.REC_BUTTON__CMD_NAME:
				return getCmdName();
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
			case RecorderPackage.REC_BUTTON__CMD_NAME:
				setCmdName((CommandType)newValue);
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
			case RecorderPackage.REC_BUTTON__CMD_NAME:
				setCmdName(CMD_NAME_EDEFAULT);
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
			case RecorderPackage.REC_BUTTON__CMD_NAME:
				return cmdName != CMD_NAME_EDEFAULT;
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
		result.append(" (cmdName: ");
		result.append(cmdName);
		result.append(')');
		return result.toString();
	}

} //RecButtonImpl
