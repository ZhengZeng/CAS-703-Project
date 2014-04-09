/**
 */
package recorder.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import recorder.MemoryContainer;
import recorder.RecMem;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.MemoryContainerImpl#getMemories <em>Memories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryContainerImpl extends MinimalEObjectImpl.Container implements MemoryContainer {
	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected RecMem memories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.MEMORY_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecMem getMemories() {
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemories(RecMem newMemories, NotificationChain msgs) {
		RecMem oldMemories = memories;
		memories = newMemories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecorderPackage.MEMORY_CONTAINER__MEMORIES, oldMemories, newMemories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemories(RecMem newMemories) {
		if (newMemories != memories) {
			NotificationChain msgs = null;
			if (memories != null)
				msgs = ((InternalEObject)memories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.MEMORY_CONTAINER__MEMORIES, null, msgs);
			if (newMemories != null)
				msgs = ((InternalEObject)newMemories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecorderPackage.MEMORY_CONTAINER__MEMORIES, null, msgs);
			msgs = basicSetMemories(newMemories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.MEMORY_CONTAINER__MEMORIES, newMemories, newMemories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecorderPackage.MEMORY_CONTAINER__MEMORIES:
				return basicSetMemories(null, msgs);
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
			case RecorderPackage.MEMORY_CONTAINER__MEMORIES:
				return getMemories();
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
			case RecorderPackage.MEMORY_CONTAINER__MEMORIES:
				setMemories((RecMem)newValue);
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
			case RecorderPackage.MEMORY_CONTAINER__MEMORIES:
				setMemories((RecMem)null);
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
			case RecorderPackage.MEMORY_CONTAINER__MEMORIES:
				return memories != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryContainerImpl
