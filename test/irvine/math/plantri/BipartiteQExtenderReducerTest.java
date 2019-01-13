package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BipartiteQExtenderReducerTest extends TestCase {

  public void test3ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(9, -1, -1, -1, false, false, false, false));
    assertEquals(57, plantri.count(15, -1, -1, -1, false, false, false, false));
  }
}
