package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class TestCanonicalizationTest extends TestCase {

  public void test3ConnectedPlanarTriangulationsResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(11, -1, -1, -1, false, false, false, false);
      }
      assertEquals(1249, sum);
    }
  }

}
