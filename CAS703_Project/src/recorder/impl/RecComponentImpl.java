/**
 */
package recorder.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import recorder.RecComponent;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link recorder.impl.RecComponentImpl#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link recorder.impl.RecComponentImpl#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link recorder.impl.RecComponentImpl#getComp_width <em>Comp width</em>}</li>
 *   <li>{@link recorder.impl.RecComponentImpl#getComp_height <em>Comp height</em>}</li>
 *   <li>{@link recorder.impl.RecComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link recorder.impl.RecComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecComponentImpl extends MinimalEObjectImpl.Container implements RecComponent {
	/**
	 * The default value of the '{@link #getPos_x() <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_x()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos_x() <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_x()
	 * @generated
	 * @ordered
	 */
	protected int pos_x = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos_y() <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_y()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos_y() <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos_y()
	 * @generated
	 * @ordered
	 */
	protected int pos_y = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getComp_width() <em>Comp width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_width()
	 * @generated
	 * @ordered
	 */
	protected static final int COMP_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComp_width() <em>Comp width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_width()
	 * @generated
	 * @ordered
	 */
	protected int comp_width = COMP_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getComp_height() <em>Comp height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_height()
	 * @generated
	 * @ordered
	 */
	protected static final int COMP_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComp_height() <em>Comp height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp_height()
	 * @generated
	 * @ordered
	 */
	protected int comp_height = COMP_HEIGHT_EDEFAULT;

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
	protected RecComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecorderPackage.Literals.REC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos_x() {
		return pos_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos_x(int newPos_x) {
		int oldPos_x = pos_x;
		pos_x = newPos_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__POS_X, oldPos_x, pos_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPos_y() {
		return pos_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos_y(int newPos_y) {
		int oldPos_y = pos_y;
		pos_y = newPos_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__POS_Y, oldPos_y, pos_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComp_width() {
		return comp_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp_width(int newComp_width) {
		int oldComp_width = comp_width;
		comp_width = newComp_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__COMP_WIDTH, oldComp_width, comp_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComp_height() {
		return comp_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp_height(int newComp_height) {
		int oldComp_height = comp_height;
		comp_height = newComp_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__COMP_HEIGHT, oldComp_height, comp_height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecorderPackage.REC_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecorderPackage.REC_COMPONENT__POS_X:
				return getPos_x();
			case RecorderPackage.REC_COMPONENT__POS_Y:
				return getPos_y();
			case RecorderPackage.REC_COMPONENT__COMP_WIDTH:
				return getComp_width();
			case RecorderPackage.REC_COMPONENT__COMP_HEIGHT:
				return getComp_height();
			case RecorderPackage.REC_COMPONENT__ID:
				return getId();
			case RecorderPackage.REC_COMPONENT__NAME:
				return getName();
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
			case RecorderPackage.REC_COMPONENT__POS_X:
				setPos_x((Integer)newValue);
				return;
			case RecorderPackage.REC_COMPONENT__POS_Y:
				setPos_y((Integer)newValue);
				return;
			case RecorderPackage.REC_COMPONENT__COMP_WIDTH:
				setComp_width((Integer)newValue);
				return;
			case RecorderPackage.REC_COMPONENT__COMP_HEIGHT:
				setComp_height((Integer)newValue);
				return;
			case RecorderPackage.REC_COMPONENT__ID:
				setId((Integer)newValue);
				return;
			case RecorderPackage.REC_COMPONENT__NAME:
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
			case RecorderPackage.REC_COMPONENT__POS_X:
				setPos_x(POS_X_EDEFAULT);
				return;
			case RecorderPackage.REC_COMPONENT__POS_Y:
				setPos_y(POS_Y_EDEFAULT);
				return;
			case RecorderPackage.REC_COMPONENT__COMP_WIDTH:
				setComp_width(COMP_WIDTH_EDEFAULT);
				return;
			case RecorderPackage.REC_COMPONENT__COMP_HEIGHT:
				setComp_height(COMP_HEIGHT_EDEFAULT);
				return;
			case RecorderPackage.REC_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RecorderPackage.REC_COMPONENT__NAME:
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
			case RecorderPackage.REC_COMPONENT__POS_X:
				return pos_x != POS_X_EDEFAULT;
			case RecorderPackage.REC_COMPONENT__POS_Y:
				return pos_y != POS_Y_EDEFAULT;
			case RecorderPackage.REC_COMPONENT__COMP_WIDTH:
				return comp_width != COMP_WIDTH_EDEFAULT;
			case RecorderPackage.REC_COMPONENT__COMP_HEIGHT:
				return comp_height != COMP_HEIGHT_EDEFAULT;
			case RecorderPackage.REC_COMPONENT__ID:
				return id != ID_EDEFAULT;
			case RecorderPackage.REC_COMPONENT__NAME:
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
		result.append(" (pos_x: ");
		result.append(pos_x);
		result.append(", pos_y: ");
		result.append(pos_y);
		result.append(", comp_width: ");
		result.append(comp_width);
		result.append(", comp_height: ");
		result.append(comp_height);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecComponentImpl
