/**
 */
package recorder.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import recorder.ButtonContainer;
import recorder.CommandType;
import recorder.DispContainer;
import recorder.DispLCD;
import recorder.MemoryContainer;
import recorder.NormalBtn;
import recorder.RecButton;
import recorder.RecColor;
import recorder.RecComponent;
import recorder.RecDisplay;
import recorder.RecFile;
import recorder.RecFunctions;
import recorder.RecMem;
import recorder.RecStatus;
import recorder.RecorderFactory;
import recorder.RecorderModel;
import recorder.RecorderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecorderPackageImpl extends EPackageImpl implements RecorderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recMemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recorderModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalBtnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispLCDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recFunctionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see recorder.RecorderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecorderPackageImpl() {
		super(eNS_URI, RecorderFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RecorderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecorderPackage init() {
		if (isInited) return (RecorderPackage)EPackage.Registry.INSTANCE.getEPackage(RecorderPackage.eNS_URI);

		// Obtain or create and register package
		RecorderPackageImpl theRecorderPackage = (RecorderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecorderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecorderPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRecorderPackage.createPackageContents();

		// Initialize created meta-data
		theRecorderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRecorderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecorderPackage.eNS_URI, theRecorderPackage);
		return theRecorderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecComponent() {
		return recComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Pos_x() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Pos_y() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Comp_width() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Comp_height() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Id() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecComponent_Name() {
		return (EAttribute)recComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecDisplay() {
		return recDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecDisplay_DispColor() {
		return (EAttribute)recDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecButton() {
		return recButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecButton_CmdName() {
		return (EAttribute)recButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecFile() {
		return recFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecFile_FileName() {
		return (EAttribute)recFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecFile_Size() {
		return (EAttribute)recFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecMem() {
		return recMemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecMem_Id() {
		return (EAttribute)recMemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecMem_Files() {
		return (EReference)recMemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecMem_CurFile() {
		return (EAttribute)recMemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecMem_MemSize() {
		return (EAttribute)recMemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecMem_Name() {
		return (EAttribute)recMemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecorderModel() {
		return recorderModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecorderModel_BtnContainer() {
		return (EReference)recorderModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecorderModel_DispContainer() {
		return (EReference)recorderModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecorderModel_MemContainer() {
		return (EReference)recorderModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecorderModel_RecorderNm() {
		return (EAttribute)recorderModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecorderModel_CurStatus() {
		return (EAttribute)recorderModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecorderModel_CurFunction() {
		return (EAttribute)recorderModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalBtn() {
		return normalBtnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispLCD() {
		return dispLCDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonContainer() {
		return buttonContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonContainer_Buttons() {
		return (EReference)buttonContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispContainer() {
		return dispContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispContainer_Displays() {
		return (EReference)dispContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryContainer() {
		return memoryContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryContainer_Memories() {
		return (EReference)memoryContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecColor() {
		return recColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandType() {
		return commandTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecFunctions() {
		return recFunctionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecStatus() {
		return recStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderFactory getRecorderFactory() {
		return (RecorderFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recComponentEClass = createEClass(REC_COMPONENT);
		createEAttribute(recComponentEClass, REC_COMPONENT__POS_X);
		createEAttribute(recComponentEClass, REC_COMPONENT__POS_Y);
		createEAttribute(recComponentEClass, REC_COMPONENT__COMP_WIDTH);
		createEAttribute(recComponentEClass, REC_COMPONENT__COMP_HEIGHT);
		createEAttribute(recComponentEClass, REC_COMPONENT__ID);
		createEAttribute(recComponentEClass, REC_COMPONENT__NAME);

		recDisplayEClass = createEClass(REC_DISPLAY);
		createEAttribute(recDisplayEClass, REC_DISPLAY__DISP_COLOR);

		recButtonEClass = createEClass(REC_BUTTON);
		createEAttribute(recButtonEClass, REC_BUTTON__CMD_NAME);

		recFileEClass = createEClass(REC_FILE);
		createEAttribute(recFileEClass, REC_FILE__FILE_NAME);
		createEAttribute(recFileEClass, REC_FILE__SIZE);

		recMemEClass = createEClass(REC_MEM);
		createEAttribute(recMemEClass, REC_MEM__ID);
		createEReference(recMemEClass, REC_MEM__FILES);
		createEAttribute(recMemEClass, REC_MEM__CUR_FILE);
		createEAttribute(recMemEClass, REC_MEM__MEM_SIZE);
		createEAttribute(recMemEClass, REC_MEM__NAME);

		recorderModelEClass = createEClass(RECORDER_MODEL);
		createEReference(recorderModelEClass, RECORDER_MODEL__BTN_CONTAINER);
		createEReference(recorderModelEClass, RECORDER_MODEL__DISP_CONTAINER);
		createEReference(recorderModelEClass, RECORDER_MODEL__MEM_CONTAINER);
		createEAttribute(recorderModelEClass, RECORDER_MODEL__RECORDER_NM);
		createEAttribute(recorderModelEClass, RECORDER_MODEL__CUR_STATUS);
		createEAttribute(recorderModelEClass, RECORDER_MODEL__CUR_FUNCTION);

		normalBtnEClass = createEClass(NORMAL_BTN);

		dispLCDEClass = createEClass(DISP_LCD);

		buttonContainerEClass = createEClass(BUTTON_CONTAINER);
		createEReference(buttonContainerEClass, BUTTON_CONTAINER__BUTTONS);

		dispContainerEClass = createEClass(DISP_CONTAINER);
		createEReference(dispContainerEClass, DISP_CONTAINER__DISPLAYS);

		memoryContainerEClass = createEClass(MEMORY_CONTAINER);
		createEReference(memoryContainerEClass, MEMORY_CONTAINER__MEMORIES);

		// Create enums
		recColorEEnum = createEEnum(REC_COLOR);
		commandTypeEEnum = createEEnum(COMMAND_TYPE);
		recFunctionsEEnum = createEEnum(REC_FUNCTIONS);
		recStatusEEnum = createEEnum(REC_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recDisplayEClass.getESuperTypes().add(this.getRecComponent());
		recButtonEClass.getESuperTypes().add(this.getRecComponent());
		normalBtnEClass.getESuperTypes().add(this.getRecButton());
		dispLCDEClass.getESuperTypes().add(this.getRecDisplay());

		// Initialize classes, features, and operations; add parameters
		initEClass(recComponentEClass, RecComponent.class, "RecComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecComponent_Pos_x(), ecorePackage.getEInt(), "pos_x", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecComponent_Pos_y(), ecorePackage.getEInt(), "pos_y", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecComponent_Comp_width(), ecorePackage.getEInt(), "comp_width", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecComponent_Comp_height(), ecorePackage.getEInt(), "comp_height", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecComponent_Id(), ecorePackage.getEInt(), "id", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, RecComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recDisplayEClass, RecDisplay.class, "RecDisplay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecDisplay_DispColor(), this.getRecColor(), "dispColor", null, 0, 1, RecDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recButtonEClass, RecButton.class, "RecButton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecButton_CmdName(), this.getCommandType(), "cmdName", null, 0, 1, RecButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recFileEClass, RecFile.class, "RecFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecFile_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, RecFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecFile_Size(), ecorePackage.getEInt(), "size", null, 0, 1, RecFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recMemEClass, RecMem.class, "RecMem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecMem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, RecMem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecMem_Files(), this.getRecFile(), null, "files", null, 0, 100, RecMem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecMem_CurFile(), ecorePackage.getEInt(), "curFile", null, 0, 1, RecMem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecMem_MemSize(), ecorePackage.getEInt(), "memSize", null, 1, 1, RecMem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecMem_Name(), ecorePackage.getEString(), "name", null, 0, 1, RecMem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recorderModelEClass, RecorderModel.class, "RecorderModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecorderModel_BtnContainer(), this.getButtonContainer(), null, "btnContainer", null, 1, 2, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecorderModel_DispContainer(), this.getDispContainer(), null, "dispContainer", null, 1, 1, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecorderModel_MemContainer(), this.getMemoryContainer(), null, "memContainer", null, 1, 1, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecorderModel_RecorderNm(), ecorePackage.getEString(), "recorderNm", null, 0, 1, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecorderModel_CurStatus(), this.getRecStatus(), "curStatus", null, 0, 1, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecorderModel_CurFunction(), this.getRecFunctions(), "curFunction", null, 0, 1, RecorderModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalBtnEClass, NormalBtn.class, "NormalBtn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dispLCDEClass, DispLCD.class, "DispLCD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonContainerEClass, ButtonContainer.class, "ButtonContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonContainer_Buttons(), this.getRecButton(), null, "buttons", null, 2, 10, ButtonContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispContainerEClass, DispContainer.class, "DispContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDispContainer_Displays(), this.getRecDisplay(), null, "displays", null, 1, 2, DispContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryContainerEClass, MemoryContainer.class, "MemoryContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryContainer_Memories(), this.getRecMem(), null, "memories", null, 1, 1, MemoryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recColorEEnum, RecColor.class, "RecColor");
		addEEnumLiteral(recColorEEnum, RecColor.RED);
		addEEnumLiteral(recColorEEnum, RecColor.GREEN);
		addEEnumLiteral(recColorEEnum, RecColor.GRAY);
		addEEnumLiteral(recColorEEnum, RecColor.BLUE);

		initEEnum(commandTypeEEnum, CommandType.class, "CommandType");
		addEEnumLiteral(commandTypeEEnum, CommandType.START);
		addEEnumLiteral(commandTypeEEnum, CommandType.STOP);
		addEEnumLiteral(commandTypeEEnum, CommandType.DELETE);
		addEEnumLiteral(commandTypeEEnum, CommandType.MEM);
		addEEnumLiteral(commandTypeEEnum, CommandType.UP);
		addEEnumLiteral(commandTypeEEnum, CommandType.DOWN);
		addEEnumLiteral(commandTypeEEnum, CommandType.CHANGE_MODE);

		initEEnum(recFunctionsEEnum, RecFunctions.class, "RecFunctions");
		addEEnumLiteral(recFunctionsEEnum, RecFunctions.SOUND_RECORD);
		addEEnumLiteral(recFunctionsEEnum, RecFunctions.SOUND_PLAY);
		addEEnumLiteral(recFunctionsEEnum, RecFunctions.CHECK_MEM);

		initEEnum(recStatusEEnum, RecStatus.class, "RecStatus");
		addEEnumLiteral(recStatusEEnum, RecStatus.WORKING);
		addEEnumLiteral(recStatusEEnum, RecStatus.STOPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //RecorderPackageImpl
