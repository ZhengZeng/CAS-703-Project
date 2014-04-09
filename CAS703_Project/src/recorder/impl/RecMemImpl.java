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

import recorder.RecFile;
import recorder.RecMem;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Mem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.RecMemImpl#getId <em>Id</em>}</li>
 *   <li>{@link recorder.impl.RecMemImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link recorder.impl.RecMemImpl#getCurFile <em>Cur File</em>}</li>
 *   <li>{@link recorder.impl.RecMemImpl#getMemSize <em>Mem Size</em>}</li>
 *   <li>{@link recorder.impl.RecMemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecMemImpl extends MinimalEObjectImpl.Container implements RecMem {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<RecFile> files;

	/**
	 * The default value of the '{@link #getCurFile() <em>Cur File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurFile()
	 * @generated
	 * @ordered
	 */
	protected static final int CUR_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurFile() <em>Cur File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurFile()
	 * @generated
	 * @ordered
	 */
	protected int curFile = CUR_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemSize() <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemSize() <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemSize()
	 * @generated
	 * @ordered
	 */
	protected int memSize = MEM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecMemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.REC_MEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_MEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<RecFile>(RecFile.class, this, RecorderPackage.REC_MEM__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurFile() {
		return curFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurFile(int newCurFile) {
		int oldCurFile = curFile;
		curFile = newCurFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_MEM__CUR_FILE, oldCurFile, curFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemSize() {
		return memSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemSize(int newMemSize) {
		int oldMemSize = memSize;
		memSize = newMemSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_MEM__MEM_SIZE, oldMemSize, memSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_MEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecorderPackage.REC_MEM__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case RecorderPackage.REC_MEM__ID:
				return getId();
			case RecorderPackage.REC_MEM__FILES:
				return getFiles();
			case RecorderPackage.REC_MEM__CUR_FILE:
				return getCurFile();
			case RecorderPackage.REC_MEM__MEM_SIZE:
				return getMemSize();
			case RecorderPackage.REC_MEM__NAME:
				return getName();
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
			case RecorderPackage.REC_MEM__ID:
				setId((Integer)newValue);
				return;
			case RecorderPackage.REC_MEM__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends RecFile>)newValue);
				return;
			case RecorderPackage.REC_MEM__CUR_FILE:
				setCurFile((Integer)newValue);
				return;
			case RecorderPackage.REC_MEM__MEM_SIZE:
				setMemSize((Integer)newValue);
				return;
			case RecorderPackage.REC_MEM__NAME:
				setName((String)newValue);
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
			case RecorderPackage.REC_MEM__ID:
				setId(ID_EDEFAULT);
				return;
			case RecorderPackage.REC_MEM__FILES:
				getFiles().clear();
				return;
			case RecorderPackage.REC_MEM__CUR_FILE:
				setCurFile(CUR_FILE_EDEFAULT);
				return;
			case RecorderPackage.REC_MEM__MEM_SIZE:
				setMemSize(MEM_SIZE_EDEFAULT);
				return;
			case RecorderPackage.REC_MEM__NAME:
				setName(NAME_EDEFAULT);
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
			case RecorderPackage.REC_MEM__ID:
				return id != ID_EDEFAULT;
			case RecorderPackage.REC_MEM__FILES:
				return files != null && !files.isEmpty();
			case RecorderPackage.REC_MEM__CUR_FILE:
				return curFile != CUR_FILE_EDEFAULT;
			case RecorderPackage.REC_MEM__MEM_SIZE:
				return memSize != MEM_SIZE_EDEFAULT;
			case RecorderPackage.REC_MEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", curFile: ");
		result.append(curFile);
		result.append(", memSize: ");
		result.append(memSize);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecMemImpl
