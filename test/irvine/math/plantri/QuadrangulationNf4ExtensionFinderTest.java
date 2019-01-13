package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationNf4ExtensionFinderTest extends TestCase {

  public void testQuadrangulationsM3C4() {
    assertEquals(37, new Plantri().count(16, 3, 4, -1, false, false, true, false));
    assertEquals(79, new Plantri().count(17, 3, 4, -1, false, false, true, false));
    assertEquals(249, new Plantri().count(18, 3, 4, -1, false, false, true, false));
  }
}
