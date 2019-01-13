package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SimpleScannerTest extends TestCase {

  public void test3ConnectedPlanarSimpleOP() {
    final Plantri plantri = new Plantri();
    assertEquals(2, plantri.count(5, -1, -1, -1, true, true, false, false));
    assertEquals(8, plantri.count(6, -1, -1, -1, true, true, false, false));
    assertEquals(45, plantri.count(7, -1, -1, -1, true, true, false, false));
  }

  public void test3ConnectedPolygons() {
    final Plantri plantri = new Plantri();
    assertEquals(27, plantri.count(7, -1, -1, 0, false, false, false, false));
    assertEquals(132, plantri.count(8, -1, -1, 0, false, false, false, false));
  }
}
