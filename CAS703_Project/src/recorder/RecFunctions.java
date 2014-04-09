/**
 */
package recorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rec Functions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see recorder.RecorderPackage#getRecFunctions()
 * @model
 * @generated
 */
public enum RecFunctions implements Enumerator {
	/**
	 * The '<em><b>Sound Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_RECORD(100, "Sound_Record", "Sound_Record"),

	/**
	 * The '<em><b>Sound Play</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_PLAY(200, "Sound_Play", "Sound_Play"),

	/**
	 * The '<em><b>Check Mem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_MEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_MEM(300, "Check_Mem", "Check_Mem");

	/**
	 * The '<em><b>Sound Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_RECORD
	 * @model name="Sound_Record"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_RECORD_VALUE = 100;

	/**
	 * The '<em><b>Sound Play</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sound Play</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_PLAY
	 * @model name="Sound_Play"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_PLAY_VALUE = 200;

	/**
	 * The '<em><b>Check Mem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check Mem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK_MEM
	 * @model name="Check_Mem"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_MEM_VALUE = 300;

	/**
	 * An array of all the '<em><b>Rec Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecFunctions[] VALUES_ARRAY =
		new RecFunctions[] {
			SOUND_RECORD,
			SOUND_PLAY,
			CHECK_MEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Rec Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecFunctions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rec Functions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecFunctions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecFunctions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rec Functions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecFunctions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecFunctions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rec Functions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecFunctions get(int value) {
		switch (value) {
			case SOUND_RECORD_VALUE: return SOUND_RECORD;
			case SOUND_PLAY_VALUE: return SOUND_PLAY;
			case CHECK_MEM_VALUE: return CHECK_MEM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RecFunctions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RecFunctions
