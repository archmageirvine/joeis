package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DoubleScannerTest extends TestCase {

  public void test2ConnectedPlanarTriangulations() {
    assertEquals(3, new Plantri().count(6, -1, 2, -1, false, false, false, false));
    assertEquals(32, new Plantri().count(8, -1, 2, -1, false, false, false, false));
    assertEquals(131, new Plantri().count(9, -1, 2, -1, false, false, false, false));
  }
}
