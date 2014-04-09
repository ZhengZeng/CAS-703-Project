/**
 */
package recorder.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import recorder.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecorderFactoryImpl extends EFactoryImpl implements RecorderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecorderFactory init() {
		try {
			RecorderFactory theRecorderFactory = (RecorderFactory)EPackage.Registry.INSTANCE.getEFactory(RecorderPackage.eNS_URI);
			if (theRecorderFactory != null) {
				return theRecorderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecorderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecorderPackage.REC_FILE: return createRecFile();
			case RecorderPackage.REC_MEM: return createRecMem();
			case RecorderPackage.RECORDER_MODEL: return createRecorderModel();
			case RecorderPackage.NORMAL_BTN: return createNormalBtn();
			case RecorderPackage.DISP_LCD: return createDispLCD();
			case RecorderPackage.BUTTON_CONTAINER: return createButtonContainer();
			case RecorderPackage.DISP_CONTAINER: return createDispContainer();
			case RecorderPackage.MEMORY_CONTAINER: return createMemoryContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RecorderPackage.REC_COLOR:
				return createRecColorFromString(eDataType, initialValue);
			case RecorderPackage.COMMAND_TYPE:
				return createCommandTypeFromString(eDataType, initialValue);
			case RecorderPackage.REC_FUNCTIONS:
				return createRecFunctionsFromString(eDataType, initialValue);
			case RecorderPackage.REC_STATUS:
				return createRecStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RecorderPackage.REC_COLOR:
				return convertRecColorToString(eDataType, instanceValue);
			case RecorderPackage.COMMAND_TYPE:
				return convertCommandTypeToString(eDataType, instanceValue);
			case RecorderPackage.REC_FUNCTIONS:
				return convertRecFunctionsToString(eDataType, instanceValue);
			case RecorderPackage.REC_STATUS:
				return convertRecStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecFile createRecFile() {
		RecFileImpl recFile = new RecFileImpl();
		return recFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecMem createRecMem() {
		RecMemImpl recMem = new RecMemImpl();
		return recMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderModel createRecorderModel() {
		RecorderModelImpl recorderModel = new RecorderModelImpl();
		return recorderModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalBtn createNormalBtn() {
		NormalBtnImpl normalBtn = new NormalBtnImpl();
		return normalBtn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispLCD createDispLCD() {
		DispLCDImpl dispLCD = new DispLCDImpl();
		return dispLCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonContainer createButtonContainer() {
		ButtonContainerImpl buttonContainer = new ButtonContainerImpl();
		return buttonContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispContainer createDispContainer() {
		DispContainerImpl dispContainer = new DispContainerImpl();
		return dispContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryContainer createMemoryContainer() {
		MemoryContainerImpl memoryContainer = new MemoryContainerImpl();
		return memoryContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecColor createRecColorFromString(EDataType eDataType, String initialValue) {
		RecColor result = RecColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandTypeFromString(EDataType eDataType, String initialValue) {
		CommandType result = CommandType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecFunctions createRecFunctionsFromString(EDataType eDataType, String initialValue) {
		RecFunctions result = RecFunctions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecFunctionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecStatus createRecStatusFromString(EDataType eDataType, String initialValue) {
		RecStatus result = RecStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderPackage getRecorderPackage() {
		return (RecorderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecorderPackage getPackage() {
		return RecorderPackage.eINSTANCE;
	}

} //RecorderFactoryImpl
