package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Bipartite4CScannerTest extends TestCase {

  public void test4ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(0, plantri.count(9, -1, 4, -1, false, false, false, false));
    assertEquals(2, plantri.count(10, -1, 4, -1, false, false, false, false));
    assertEquals(134, plantri.count(17, -1, 4, -1, false, false, false, false));
  }
}
