package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BipartitePExtenderReducerTest extends TestCase {

  public void test3ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(8, plantri.count(12, -1, -1, -1, false, false, false, false));
    assertEquals(8, plantri.count(13, -1, -1, -1, false, false, false, false));
    assertEquals(32, plantri.count(14, -1, -1, -1, false, false, false, false));
    assertEquals(57, plantri.count(15, -1, -1, -1, false, false, false, false));
    assertEquals(185, plantri.count(16, -1, -1, -1, false, false, false, false));
  }
}
