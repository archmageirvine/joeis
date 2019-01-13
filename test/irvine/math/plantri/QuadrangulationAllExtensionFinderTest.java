package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadrangulationAllExtensionFinderTest extends TestCase {

  public void testQuadrangulationsM2C2() {
    assertEquals(118, new Plantri().count(9, 2, 2, -1, false, false, true, false));
    assertEquals(9844, new Plantri().count(11, 2, 2, -1, false, false, true, false));
  }
}
