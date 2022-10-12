/**
 */
package petrinet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import petrinet.PetriElement;
import petrinet.PetrinetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriElementTest extends TestCase {

	/**
	 * The fixture for this Petri Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PetriElementTest.class);
	}

	/**
	 * Constructs a new Petri Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Petri Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PetriElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Petri Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriElement getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetrinetFactory.eINSTANCE.createPetriElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PetriElementTest
