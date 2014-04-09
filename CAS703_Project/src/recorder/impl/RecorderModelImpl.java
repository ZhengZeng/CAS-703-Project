/**
 */
package recorder.impl;

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

import recorder.ButtonContainer;
import recorder.DispContainer;
import recorder.MemoryContainer;
import recorder.RecFunctions;
import recorder.RecStatus;
import recorder.RecorderModel;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.RecorderModelImpl#getBtnContainer <em>Btn Container</em>}</li>
 *   <li>{@link recorder.impl.RecorderModelImpl#getDispContainer <em>Disp Container</em>}</li>
 *   <li>{@link recorder.impl.RecorderModelImpl#getMemContainer <em>Mem Container</em>}</li>
 *   <li>{@link recorder.impl.RecorderModelImpl#getRecorderNm <em>Recorder Nm</em>}</li>
 *   <li>{@link recorder.impl.RecorderModelImpl#getCurStatus <em>Cur Status</em>}</li>
 *   <li>{@link recorder.impl.RecorderModelImpl#getCurFunction <em>Cur Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecorderModelImpl extends MinimalEObjectImpl.Container implements RecorderModel {
	/**
	 * The cached value of the '{@link #getBtnContainer() <em>Btn Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtnContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ButtonContainer> btnContainer;

	/**
	 * The cached value of the '{@link #getDispContainer() <em>Disp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispContainer()
	 * @generated
	 * @ordered
	 */
	protected DispContainer dispContainer;

	/**
	 * The cached value of the '{@link #getMemContainer() <em>Mem Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemContainer()
	 * @generated
	 * @ordered
	 */
	protected MemoryContainer memContainer;

	/**
	 * The default value of the '{@link #getRecorderNm() <em>Recorder Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorderNm()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORDER_NM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecorderNm() <em>Recorder Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorderNm()
	 * @generated
	 * @ordered
	 */
	protected String recorderNm = RECORDER_NM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurStatus() <em>Cur Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RecStatus CUR_STATUS_EDEFAULT = RecStatus.WORKING;

	/**
	 * The cached value of the '{@link #getCurStatus() <em>Cur Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurStatus()
	 * @generated
	 * @ordered
	 */
	protected RecStatus curStatus = CUR_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurFunction() <em>Cur Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurFunction()
	 * @generated
	 * @ordered
	 */
	protected static final RecFunctions CUR_FUNCTION_EDEFAULT = RecFunctions.SOUND_RECORD;

	/**
	 * The cached value of the '{@link #getCurFunction() <em>Cur Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurFunction()
	 * @generated
	 * @ordered
	 */
	protected RecFunctions curFunction = CUR_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecorderModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.RECORDER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonContainer> getBtnContainer() {
		if (btnContainer == null) {
			btnContainer = new EObjectContainmentEList<ButtonContainer>(ButtonContainer.class, this, RecorderPackage.RECORDER_MODEL__BTN_CONTAINER);
		}
		return btnContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispContainer getDispContainer() {
		return dispContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispContainer(DispContainer newDispContainer, NotificationChain msgs) {
		DispContainer oldDispContainer = dispContainer;
		dispContainer = newDispContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__DISP_CONTAINER, oldDispContainer, newDispContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispContainer(DispContainer newDispContainer) {
		if (newDispContainer != dispContainer) {
			NotificationChain msgs = null;
			if (dispContainer != null)
				msgs = ((InternalEObject)dispContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.RECORDER_MODEL__DISP_CONTAINER, null, msgs);
			if (newDispContainer != null)
				msgs = ((InternalEObject)newDispContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.RECORDER_MODEL__DISP_CONTAINER, null, msgs);
			msgs = basicSetDispContainer(newDispContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__DISP_CONTAINER, newDispContainer, newDispContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryContainer getMemContainer() {
		return memContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemContainer(MemoryContainer newMemContainer, NotificationChain msgs) {
		MemoryContainer oldMemContainer = memContainer;
		memContainer = newMemContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__MEM_CONTAINER, oldMemContainer, newMemContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemContainer(MemoryContainer newMemContainer) {
		if (newMemContainer != memContainer) {
			NotificationChain msgs = null;
			if (memContainer != null)
				msgs = ((InternalEObject)memContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.RECORDER_MODEL__MEM_CONTAINER, null, msgs);
			if (newMemContainer != null)
				msgs = ((InternalEObject)newMemContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.RECORDER_MODEL__MEM_CONTAINER, null, msgs);
			msgs = basicSetMemContainer(newMemContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__MEM_CONTAINER, newMemContainer, newMemContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecorderNm() {
		return recorderNm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorderNm(String newRecorderNm) {
		String oldRecorderNm = recorderNm;
		recorderNm = newRecorderNm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__RECORDER_NM, oldRecorderNm, recorderNm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecStatus getCurStatus() {
		return curStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurStatus(RecStatus newCurStatus) {
		RecStatus oldCurStatus = curStatus;
		curStatus = newCurStatus == null ? CUR_STATUS_EDEFAULT : newCurStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__CUR_STATUS, oldCurStatus, curStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecFunctions getCurFunction() {
		return curFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurFunction(RecFunctions newCurFunction) {
		RecFunctions oldCurFunction = curFunction;
		curFunction = newCurFunction == null ? CUR_FUNCTION_EDEFAULT : newCurFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.RECORDER_MODEL__CUR_FUNCTION, oldCurFunction, curFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecorderPackage.RECORDER_MODEL__BTN_CONTAINER:
				return ((InternalEList<?>)getBtnContainer()).basicRemove(otherEnd, msgs);
			case RecorderPackage.RECORDER_MODEL__DISP_CONTAINER:
				return basicSetDispContainer(null, msgs);
			case RecorderPackage.RECORDER_MODEL__MEM_CONTAINER:
				return basicSetMemContainer(null, msgs);
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
			case RecorderPackage.RECORDER_MODEL__BTN_CONTAINER:
				return getBtnContainer();
			case RecorderPackage.RECORDER_MODEL__DISP_CONTAINER:
				return getDispContainer();
			case RecorderPackage.RECORDER_MODEL__MEM_CONTAINER:
				return getMemContainer();
			case RecorderPackage.RECORDER_MODEL__RECORDER_NM:
				return getRecorderNm();
			case RecorderPackage.RECORDER_MODEL__CUR_STATUS:
				return getCurStatus();
			case RecorderPackage.RECORDER_MODEL__CUR_FUNCTION:
				return getCurFunction();
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
			case RecorderPackage.RECORDER_MODEL__BTN_CONTAINER:
				getBtnContainer().clear();
				getBtnContainer().addAll((Collection<? extends ButtonContainer>)newValue);
				return;
			case RecorderPackage.RECORDER_MODEL__DISP_CONTAINER:
				setDispContainer((DispContainer)newValue);
				return;
			case RecorderPackage.RECORDER_MODEL__MEM_CONTAINER:
				setMemContainer((MemoryContainer)newValue);
				return;
			case RecorderPackage.RECORDER_MODEL__RECORDER_NM:
				setRecorderNm((String)newValue);
				return;
			case RecorderPackage.RECORDER_MODEL__CUR_STATUS:
				setCurStatus((RecStatus)newValue);
				return;
			case RecorderPackage.RECORDER_MODEL__CUR_FUNCTION:
				setCurFunction((RecFunctions)newValue);
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
			case RecorderPackage.RECORDER_MODEL__BTN_CONTAINER:
				getBtnContainer().clear();
				return;
			case RecorderPackage.RECORDER_MODEL__DISP_CONTAINER:
				setDispContainer((DispContainer)null);
				return;
			case RecorderPackage.RECORDER_MODEL__MEM_CONTAINER:
				setMemContainer((MemoryContainer)null);
				return;
			case RecorderPackage.RECORDER_MODEL__RECORDER_NM:
				setRecorderNm(RECORDER_NM_EDEFAULT);
				return;
			case RecorderPackage.RECORDER_MODEL__CUR_STATUS:
				setCurStatus(CUR_STATUS_EDEFAULT);
				return;
			case RecorderPackage.RECORDER_MODEL__CUR_FUNCTION:
				setCurFunction(CUR_FUNCTION_EDEFAULT);
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
			case RecorderPackage.RECORDER_MODEL__BTN_CONTAINER:
				return btnContainer != null && !btnContainer.isEmpty();
			case RecorderPackage.RECORDER_MODEL__DISP_CONTAINER:
				return dispContainer != null;
			case RecorderPackage.RECORDER_MODEL__MEM_CONTAINER:
				return memContainer != null;
			case RecorderPackage.RECORDER_MODEL__RECORDER_NM:
				return RECORDER_NM_EDEFAULT == null ? recorderNm != null : !RECORDER_NM_EDEFAULT.equals(recorderNm);
			case RecorderPackage.RECORDER_MODEL__CUR_STATUS:
				return curStatus != CUR_STATUS_EDEFAULT;
			case RecorderPackage.RECORDER_MODEL__CUR_FUNCTION:
				return curFunction != CUR_FUNCTION_EDEFAULT;
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
		result.append(" (recorderNm: ");
		result.append(recorderNm);
		result.append(", curStatus: ");
		result.append(curStatus);
		result.append(", curFunction: ");
		result.append(curFunction);
		result.append(')');
		return result.toString();
	}

} //RecorderModelImpl
