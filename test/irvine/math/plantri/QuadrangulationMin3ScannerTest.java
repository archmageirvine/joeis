package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationMin3ScannerTest extends TestCase {

  public void testQuadrangulations() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(8, -1, 2, -1, false, false, true, false));
    assertEquals(64, plantri.count(16, -1, 2, -1, false, false, true, false));
    assertEquals(155, plantri.count(17, -1, 2, -1, false, false, true, false));
  }
}
