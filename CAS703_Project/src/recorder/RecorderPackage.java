/**
 */
package recorder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see recorder.RecorderFactory
 * @model kind="package"
 * @generated
 */
public interface RecorderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recorder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.mcm.cas703.project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.mcm.cas703.project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecorderPackage eINSTANCE = recorder.impl.RecorderPackageImpl.init();

	/**
	 * The meta object id for the '{@link recorder.impl.RecComponentImpl <em>Rec Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecComponentImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecComponent()
	 * @generated
	 */
	int REC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__POS_X = 0;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__POS_Y = 1;

	/**
	 * The feature id for the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__COMP_WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__COMP_HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT__NAME = 5;

	/**
	 * The number of structural features of the '<em>Rec Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rec Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.RecDisplayImpl <em>Rec Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecDisplayImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecDisplay()
	 * @generated
	 */
	int REC_DISPLAY = 1;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__POS_X = REC_COMPONENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__POS_Y = REC_COMPONENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__COMP_WIDTH = REC_COMPONENT__COMP_WIDTH;

	/**
	 * The feature id for the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__COMP_HEIGHT = REC_COMPONENT__COMP_HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__ID = REC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__NAME = REC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Disp Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY__DISP_COLOR = REC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rec Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY_FEATURE_COUNT = REC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rec Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_DISPLAY_OPERATION_COUNT = REC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link recorder.impl.RecButtonImpl <em>Rec Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecButtonImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecButton()
	 * @generated
	 */
	int REC_BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__POS_X = REC_COMPONENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__POS_Y = REC_COMPONENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__COMP_WIDTH = REC_COMPONENT__COMP_WIDTH;

	/**
	 * The feature id for the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__COMP_HEIGHT = REC_COMPONENT__COMP_HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__ID = REC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__NAME = REC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Cmd Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON__CMD_NAME = REC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rec Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON_FEATURE_COUNT = REC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rec Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_BUTTON_OPERATION_COUNT = REC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link recorder.impl.RecFileImpl <em>Rec File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecFileImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecFile()
	 * @generated
	 */
	int REC_FILE = 3;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_FILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_FILE__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Rec File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rec File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.RecMemImpl <em>Rec Mem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecMemImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecMem()
	 * @generated
	 */
	int REC_MEM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM__FILES = 1;

	/**
	 * The feature id for the '<em><b>Cur File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM__CUR_FILE = 2;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM__MEM_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM__NAME = 4;

	/**
	 * The number of structural features of the '<em>Rec Mem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rec Mem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REC_MEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.RecorderModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.RecorderModelImpl
	 * @see recorder.impl.RecorderPackageImpl#getRecorderModel()
	 * @generated
	 */
	int RECORDER_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Btn Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__BTN_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Disp Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__DISP_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Mem Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__MEM_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Recorder Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__RECORDER_NM = 3;

	/**
	 * The feature id for the '<em><b>Cur Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__CUR_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Cur Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL__CUR_FUNCTION = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.NormalBtnImpl <em>Normal Btn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.NormalBtnImpl
	 * @see recorder.impl.RecorderPackageImpl#getNormalBtn()
	 * @generated
	 */
	int NORMAL_BTN = 6;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__POS_X = REC_BUTTON__POS_X;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__POS_Y = REC_BUTTON__POS_Y;

	/**
	 * The feature id for the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__COMP_WIDTH = REC_BUTTON__COMP_WIDTH;

	/**
	 * The feature id for the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__COMP_HEIGHT = REC_BUTTON__COMP_HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__ID = REC_BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__NAME = REC_BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Cmd Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN__CMD_NAME = REC_BUTTON__CMD_NAME;

	/**
	 * The number of structural features of the '<em>Normal Btn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN_FEATURE_COUNT = REC_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Btn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_BTN_OPERATION_COUNT = REC_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link recorder.impl.DispLCDImpl <em>Disp LCD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.DispLCDImpl
	 * @see recorder.impl.RecorderPackageImpl#getDispLCD()
	 * @generated
	 */
	int DISP_LCD = 7;

	/**
	 * The feature id for the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__POS_X = REC_DISPLAY__POS_X;

	/**
	 * The feature id for the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__POS_Y = REC_DISPLAY__POS_Y;

	/**
	 * The feature id for the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__COMP_WIDTH = REC_DISPLAY__COMP_WIDTH;

	/**
	 * The feature id for the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__COMP_HEIGHT = REC_DISPLAY__COMP_HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__ID = REC_DISPLAY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__NAME = REC_DISPLAY__NAME;

	/**
	 * The feature id for the '<em><b>Disp Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD__DISP_COLOR = REC_DISPLAY__DISP_COLOR;

	/**
	 * The number of structural features of the '<em>Disp LCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD_FEATURE_COUNT = REC_DISPLAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disp LCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_LCD_OPERATION_COUNT = REC_DISPLAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link recorder.impl.ButtonContainerImpl <em>Button Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.ButtonContainerImpl
	 * @see recorder.impl.RecorderPackageImpl#getButtonContainer()
	 * @generated
	 */
	int BUTTON_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER__BUTTONS = 0;

	/**
	 * The number of structural features of the '<em>Button Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Button Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.DispContainerImpl <em>Disp Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.DispContainerImpl
	 * @see recorder.impl.RecorderPackageImpl#getDispContainer()
	 * @generated
	 */
	int DISP_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_CONTAINER__DISPLAYS = 0;

	/**
	 * The number of structural features of the '<em>Disp Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Disp Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISP_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.impl.MemoryContainerImpl <em>Memory Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.impl.MemoryContainerImpl
	 * @see recorder.impl.RecorderPackageImpl#getMemoryContainer()
	 * @generated
	 */
	int MEMORY_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINER__MEMORIES = 0;

	/**
	 * The number of structural features of the '<em>Memory Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Memory Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link recorder.RecColor <em>Rec Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.RecColor
	 * @see recorder.impl.RecorderPackageImpl#getRecColor()
	 * @generated
	 */
	int REC_COLOR = 11;

	/**
	 * The meta object id for the '{@link recorder.CommandType <em>Command Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.CommandType
	 * @see recorder.impl.RecorderPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 12;

	/**
	 * The meta object id for the '{@link recorder.RecFunctions <em>Rec Functions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.RecFunctions
	 * @see recorder.impl.RecorderPackageImpl#getRecFunctions()
	 * @generated
	 */
	int REC_FUNCTIONS = 13;

	/**
	 * The meta object id for the '{@link recorder.RecStatus <em>Rec Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see recorder.RecStatus
	 * @see recorder.impl.RecorderPackageImpl#getRecStatus()
	 * @generated
	 */
	int REC_STATUS = 14;


	/**
	 * Returns the meta object for class '{@link recorder.RecComponent <em>Rec Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rec Component</em>'.
	 * @see recorder.RecComponent
	 * @generated
	 */
	EClass getRecComponent();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getPos_x <em>Pos x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos x</em>'.
	 * @see recorder.RecComponent#getPos_x()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Pos_x();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getPos_y <em>Pos y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos y</em>'.
	 * @see recorder.RecComponent#getPos_y()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Pos_y();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getComp_width <em>Comp width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp width</em>'.
	 * @see recorder.RecComponent#getComp_width()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Comp_width();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getComp_height <em>Comp height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp height</em>'.
	 * @see recorder.RecComponent#getComp_height()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Comp_height();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see recorder.RecComponent#getId()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recorder.RecComponent#getName()
	 * @see #getRecComponent()
	 * @generated
	 */
	EAttribute getRecComponent_Name();

	/**
	 * Returns the meta object for class '{@link recorder.RecDisplay <em>Rec Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rec Display</em>'.
	 * @see recorder.RecDisplay
	 * @generated
	 */
	EClass getRecDisplay();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecDisplay#getDispColor <em>Disp Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disp Color</em>'.
	 * @see recorder.RecDisplay#getDispColor()
	 * @see #getRecDisplay()
	 * @generated
	 */
	EAttribute getRecDisplay_DispColor();

	/**
	 * Returns the meta object for class '{@link recorder.RecButton <em>Rec Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rec Button</em>'.
	 * @see recorder.RecButton
	 * @generated
	 */
	EClass getRecButton();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecButton#getCmdName <em>Cmd Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Name</em>'.
	 * @see recorder.RecButton#getCmdName()
	 * @see #getRecButton()
	 * @generated
	 */
	EAttribute getRecButton_CmdName();

	/**
	 * Returns the meta object for class '{@link recorder.RecFile <em>Rec File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rec File</em>'.
	 * @see recorder.RecFile
	 * @generated
	 */
	EClass getRecFile();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see recorder.RecFile#getFileName()
	 * @see #getRecFile()
	 * @generated
	 */
	EAttribute getRecFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see recorder.RecFile#getSize()
	 * @see #getRecFile()
	 * @generated
	 */
	EAttribute getRecFile_Size();

	/**
	 * Returns the meta object for class '{@link recorder.RecMem <em>Rec Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rec Mem</em>'.
	 * @see recorder.RecMem
	 * @generated
	 */
	EClass getRecMem();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecMem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see recorder.RecMem#getId()
	 * @see #getRecMem()
	 * @generated
	 */
	EAttribute getRecMem_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link recorder.RecMem#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see recorder.RecMem#getFiles()
	 * @see #getRecMem()
	 * @generated
	 */
	EReference getRecMem_Files();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecMem#getCurFile <em>Cur File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cur File</em>'.
	 * @see recorder.RecMem#getCurFile()
	 * @see #getRecMem()
	 * @generated
	 */
	EAttribute getRecMem_CurFile();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecMem#getMemSize <em>Mem Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Size</em>'.
	 * @see recorder.RecMem#getMemSize()
	 * @see #getRecMem()
	 * @generated
	 */
	EAttribute getRecMem_MemSize();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecMem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see recorder.RecMem#getName()
	 * @see #getRecMem()
	 * @generated
	 */
	EAttribute getRecMem_Name();

	/**
	 * Returns the meta object for class '{@link recorder.RecorderModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see recorder.RecorderModel
	 * @generated
	 */
	EClass getRecorderModel();

	/**
	 * Returns the meta object for the containment reference list '{@link recorder.RecorderModel#getBtnContainer <em>Btn Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Btn Container</em>'.
	 * @see recorder.RecorderModel#getBtnContainer()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EReference getRecorderModel_BtnContainer();

	/**
	 * Returns the meta object for the containment reference '{@link recorder.RecorderModel#getDispContainer <em>Disp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disp Container</em>'.
	 * @see recorder.RecorderModel#getDispContainer()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EReference getRecorderModel_DispContainer();

	/**
	 * Returns the meta object for the containment reference '{@link recorder.RecorderModel#getMemContainer <em>Mem Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mem Container</em>'.
	 * @see recorder.RecorderModel#getMemContainer()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EReference getRecorderModel_MemContainer();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecorderModel#getRecorderNm <em>Recorder Nm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorder Nm</em>'.
	 * @see recorder.RecorderModel#getRecorderNm()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EAttribute getRecorderModel_RecorderNm();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecorderModel#getCurStatus <em>Cur Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cur Status</em>'.
	 * @see recorder.RecorderModel#getCurStatus()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EAttribute getRecorderModel_CurStatus();

	/**
	 * Returns the meta object for the attribute '{@link recorder.RecorderModel#getCurFunction <em>Cur Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cur Function</em>'.
	 * @see recorder.RecorderModel#getCurFunction()
	 * @see #getRecorderModel()
	 * @generated
	 */
	EAttribute getRecorderModel_CurFunction();

	/**
	 * Returns the meta object for class '{@link recorder.NormalBtn <em>Normal Btn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Btn</em>'.
	 * @see recorder.NormalBtn
	 * @generated
	 */
	EClass getNormalBtn();

	/**
	 * Returns the meta object for class '{@link recorder.DispLCD <em>Disp LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disp LCD</em>'.
	 * @see recorder.DispLCD
	 * @generated
	 */
	EClass getDispLCD();

	/**
	 * Returns the meta object for class '{@link recorder.ButtonContainer <em>Button Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Container</em>'.
	 * @see recorder.ButtonContainer
	 * @generated
	 */
	EClass getButtonContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link recorder.ButtonContainer#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see recorder.ButtonContainer#getButtons()
	 * @see #getButtonContainer()
	 * @generated
	 */
	EReference getButtonContainer_Buttons();

	/**
	 * Returns the meta object for class '{@link recorder.DispContainer <em>Disp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disp Container</em>'.
	 * @see recorder.DispContainer
	 * @generated
	 */
	EClass getDispContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link recorder.DispContainer#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see recorder.DispContainer#getDisplays()
	 * @see #getDispContainer()
	 * @generated
	 */
	EReference getDispContainer_Displays();

	/**
	 * Returns the meta object for class '{@link recorder.MemoryContainer <em>Memory Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Container</em>'.
	 * @see recorder.MemoryContainer
	 * @generated
	 */
	EClass getMemoryContainer();

	/**
	 * Returns the meta object for the containment reference '{@link recorder.MemoryContainer#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memories</em>'.
	 * @see recorder.MemoryContainer#getMemories()
	 * @see #getMemoryContainer()
	 * @generated
	 */
	EReference getMemoryContainer_Memories();

	/**
	 * Returns the meta object for enum '{@link recorder.RecColor <em>Rec Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rec Color</em>'.
	 * @see recorder.RecColor
	 * @generated
	 */
	EEnum getRecColor();

	/**
	 * Returns the meta object for enum '{@link recorder.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Type</em>'.
	 * @see recorder.CommandType
	 * @generated
	 */
	EEnum getCommandType();

	/**
	 * Returns the meta object for enum '{@link recorder.RecFunctions <em>Rec Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rec Functions</em>'.
	 * @see recorder.RecFunctions
	 * @generated
	 */
	EEnum getRecFunctions();

	/**
	 * Returns the meta object for enum '{@link recorder.RecStatus <em>Rec Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rec Status</em>'.
	 * @see recorder.RecStatus
	 * @generated
	 */
	EEnum getRecStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecorderFactory getRecorderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link recorder.impl.RecComponentImpl <em>Rec Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecComponentImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecComponent()
		 * @generated
		 */
		EClass REC_COMPONENT = eINSTANCE.getRecComponent();

		/**
		 * The meta object literal for the '<em><b>Pos x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__POS_X = eINSTANCE.getRecComponent_Pos_x();

		/**
		 * The meta object literal for the '<em><b>Pos y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__POS_Y = eINSTANCE.getRecComponent_Pos_y();

		/**
		 * The meta object literal for the '<em><b>Comp width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__COMP_WIDTH = eINSTANCE.getRecComponent_Comp_width();

		/**
		 * The meta object literal for the '<em><b>Comp height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__COMP_HEIGHT = eINSTANCE.getRecComponent_Comp_height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__ID = eINSTANCE.getRecComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_COMPONENT__NAME = eINSTANCE.getRecComponent_Name();

		/**
		 * The meta object literal for the '{@link recorder.impl.RecDisplayImpl <em>Rec Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecDisplayImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecDisplay()
		 * @generated
		 */
		EClass REC_DISPLAY = eINSTANCE.getRecDisplay();

		/**
		 * The meta object literal for the '<em><b>Disp Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_DISPLAY__DISP_COLOR = eINSTANCE.getRecDisplay_DispColor();

		/**
		 * The meta object literal for the '{@link recorder.impl.RecButtonImpl <em>Rec Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecButtonImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecButton()
		 * @generated
		 */
		EClass REC_BUTTON = eINSTANCE.getRecButton();

		/**
		 * The meta object literal for the '<em><b>Cmd Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_BUTTON__CMD_NAME = eINSTANCE.getRecButton_CmdName();

		/**
		 * The meta object literal for the '{@link recorder.impl.RecFileImpl <em>Rec File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecFileImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecFile()
		 * @generated
		 */
		EClass REC_FILE = eINSTANCE.getRecFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_FILE__FILE_NAME = eINSTANCE.getRecFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_FILE__SIZE = eINSTANCE.getRecFile_Size();

		/**
		 * The meta object literal for the '{@link recorder.impl.RecMemImpl <em>Rec Mem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecMemImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecMem()
		 * @generated
		 */
		EClass REC_MEM = eINSTANCE.getRecMem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_MEM__ID = eINSTANCE.getRecMem_Id();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REC_MEM__FILES = eINSTANCE.getRecMem_Files();

		/**
		 * The meta object literal for the '<em><b>Cur File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_MEM__CUR_FILE = eINSTANCE.getRecMem_CurFile();

		/**
		 * The meta object literal for the '<em><b>Mem Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_MEM__MEM_SIZE = eINSTANCE.getRecMem_MemSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REC_MEM__NAME = eINSTANCE.getRecMem_Name();

		/**
		 * The meta object literal for the '{@link recorder.impl.RecorderModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.RecorderModelImpl
		 * @see recorder.impl.RecorderPackageImpl#getRecorderModel()
		 * @generated
		 */
		EClass RECORDER_MODEL = eINSTANCE.getRecorderModel();

		/**
		 * The meta object literal for the '<em><b>Btn Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDER_MODEL__BTN_CONTAINER = eINSTANCE.getRecorderModel_BtnContainer();

		/**
		 * The meta object literal for the '<em><b>Disp Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDER_MODEL__DISP_CONTAINER = eINSTANCE.getRecorderModel_DispContainer();

		/**
		 * The meta object literal for the '<em><b>Mem Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDER_MODEL__MEM_CONTAINER = eINSTANCE.getRecorderModel_MemContainer();

		/**
		 * The meta object literal for the '<em><b>Recorder Nm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDER_MODEL__RECORDER_NM = eINSTANCE.getRecorderModel_RecorderNm();

		/**
		 * The meta object literal for the '<em><b>Cur Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDER_MODEL__CUR_STATUS = eINSTANCE.getRecorderModel_CurStatus();

		/**
		 * The meta object literal for the '<em><b>Cur Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDER_MODEL__CUR_FUNCTION = eINSTANCE.getRecorderModel_CurFunction();

		/**
		 * The meta object literal for the '{@link recorder.impl.NormalBtnImpl <em>Normal Btn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.NormalBtnImpl
		 * @see recorder.impl.RecorderPackageImpl#getNormalBtn()
		 * @generated
		 */
		EClass NORMAL_BTN = eINSTANCE.getNormalBtn();

		/**
		 * The meta object literal for the '{@link recorder.impl.DispLCDImpl <em>Disp LCD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.DispLCDImpl
		 * @see recorder.impl.RecorderPackageImpl#getDispLCD()
		 * @generated
		 */
		EClass DISP_LCD = eINSTANCE.getDispLCD();

		/**
		 * The meta object literal for the '{@link recorder.impl.ButtonContainerImpl <em>Button Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.ButtonContainerImpl
		 * @see recorder.impl.RecorderPackageImpl#getButtonContainer()
		 * @generated
		 */
		EClass BUTTON_CONTAINER = eINSTANCE.getButtonContainer();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_CONTAINER__BUTTONS = eINSTANCE.getButtonContainer_Buttons();

		/**
		 * The meta object literal for the '{@link recorder.impl.DispContainerImpl <em>Disp Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.DispContainerImpl
		 * @see recorder.impl.RecorderPackageImpl#getDispContainer()
		 * @generated
		 */
		EClass DISP_CONTAINER = eINSTANCE.getDispContainer();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISP_CONTAINER__DISPLAYS = eINSTANCE.getDispContainer_Displays();

		/**
		 * The meta object literal for the '{@link recorder.impl.MemoryContainerImpl <em>Memory Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.impl.MemoryContainerImpl
		 * @see recorder.impl.RecorderPackageImpl#getMemoryContainer()
		 * @generated
		 */
		EClass MEMORY_CONTAINER = eINSTANCE.getMemoryContainer();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_CONTAINER__MEMORIES = eINSTANCE.getMemoryContainer_Memories();

		/**
		 * The meta object literal for the '{@link recorder.RecColor <em>Rec Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.RecColor
		 * @see recorder.impl.RecorderPackageImpl#getRecColor()
		 * @generated
		 */
		EEnum REC_COLOR = eINSTANCE.getRecColor();

		/**
		 * The meta object literal for the '{@link recorder.CommandType <em>Command Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.CommandType
		 * @see recorder.impl.RecorderPackageImpl#getCommandType()
		 * @generated
		 */
		EEnum COMMAND_TYPE = eINSTANCE.getCommandType();

		/**
		 * The meta object literal for the '{@link recorder.RecFunctions <em>Rec Functions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.RecFunctions
		 * @see recorder.impl.RecorderPackageImpl#getRecFunctions()
		 * @generated
		 */
		EEnum REC_FUNCTIONS = eINSTANCE.getRecFunctions();

		/**
		 * The meta object literal for the '{@link recorder.RecStatus <em>Rec Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see recorder.RecStatus
		 * @see recorder.impl.RecorderPackageImpl#getRecStatus()
		 * @generated
		 */
		EEnum REC_STATUS = eINSTANCE.getRecStatus();

	}

} //RecorderPackage
