package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadrangulationNf4ScannerTest extends TestCase {

  public void testQuadrangulationsM3C4() {
    assertEquals(1, new Plantri().count(11, 3, 4, -1, false, false, true, false));
    assertEquals(2, new Plantri().count(13, 3, 4, -1, false, false, true, false));
    assertEquals(671, new Plantri().count(19, 3, 4, -1, false, false, true, false));
  }

}
