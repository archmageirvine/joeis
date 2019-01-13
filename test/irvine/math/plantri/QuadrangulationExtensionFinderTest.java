package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationExtensionFinderTest extends TestCase {

  public void testQuadrangulations() {
    assertEquals(18, new Plantri().count(15, -1, -1, -1, false, false, true, false));
    assertEquals(58, new Plantri().count(16, -1, -1, -1, false, false, true, false));
    assertEquals(139, new Plantri().count(17, -1, -1, -1, false, false, true, false));
  }
}
