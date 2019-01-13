package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadrangulationScannerTest extends TestCase {

  public void testQuadrangulations() {
    assertEquals(3, new Plantri().count(12, -1, -1, -1, false, false, true, false));
    assertEquals(3, new Plantri().count(13, -1, -1, -1, false, false, true, false));
    assertEquals(139, new Plantri().count(17, -1, -1, -1, false, false, true, false));
    assertEquals(451, new Plantri().count(18, -1, -1, -1, false, false, true, false));
  }
}
