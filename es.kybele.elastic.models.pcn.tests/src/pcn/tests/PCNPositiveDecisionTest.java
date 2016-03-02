/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNPositiveDecision;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Positive Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNPositiveDecisionTest extends PCNProcessStepDecisionDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNPositiveDecisionTest.class);
	}

	/**
	 * Constructs a new PCN Positive Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNPositiveDecisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Positive Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNPositiveDecision getFixture() {
		return (PCNPositiveDecision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNPositiveDecision());
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

} //PCNPositiveDecisionTest
