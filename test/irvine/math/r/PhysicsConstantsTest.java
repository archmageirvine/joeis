package irvine.math.r;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PhysicsConstantsTest extends TestCase {

  public void testMu0() {
    assertEquals(12.566370614E-7, PhysicsConstants.MAGNETIC_CONSTANT, 1E-15);
  }

  public void testEpsilon0() {
    assertEquals(8.854187817E-12, PhysicsConstants.ELECTRIC_CONSTANT, 1E-21);
  }

  public void testZ0() {
    assertEquals(376.730313461, PhysicsConstants.CHARACTERISTIC_IMPEDANCE_OF_VACUUM, 1E-9);
  }

  public void testG0() {
    assertEquals(7.7480917310E-5, PhysicsConstants.CONDUCTANCE_QUANTUM, 1E-12);
  }

  public void testFaraday() {
    assertEquals(96485.33289, PhysicsConstants.FARADAY, 1E-4);
  }

  public void testPlanckMass() {
    assertEquals(2.176470E-8, PhysicsConstants.PLANCK_MASS, 1E-6);
  }

  public void testElectron() {
    assertEquals(9.10938356E-31, PhysicsConstants.u2kg(PhysicsConstants.ELECTRON_MASS), 0.00000011E-31);
  }

  public void testProton() {
    assertEquals(1.672621898E-27, PhysicsConstants.u2kg(PhysicsConstants.PROTON_MASS), 0.00000021E-27);
  }

  public void testNeutron() {
    assertEquals(1.674927471E-27, PhysicsConstants.u2kg(PhysicsConstants.NEUTRON_MASS), 0.00000021E-27);
  }

}
