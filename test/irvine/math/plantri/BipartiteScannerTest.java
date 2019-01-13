package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BipartiteScannerTest extends TestCase {

  public void test3ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(2, plantri.count(10, -1, -1, -1, false, false, false, false));
    assertEquals(2, plantri.count(11, -1, -1, -1, false, false, false, false));
    assertEquals(8, plantri.count(13, -1, -1, -1, false, false, false, false));
    assertEquals(466, plantri.count(17, -1, -1, -1, false, false, false, false));
  }
}
