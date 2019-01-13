package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Min4ScannerTest extends TestCase {

  public void test8() {
    assertEquals(2, new Plantri().count(8, 4, -1, -1, false, false, false, false));
  }

  public void test9() {
    assertEquals(5, new Plantri().count(9, 4, -1, -1, false, false, false, false));
  }

  public void test10() {
    assertEquals(12, new Plantri().count(10, 4, -1, -1, false, false, false, false));
  }

  public void test9o() {
    assertEquals(5, new Plantri().count(9, 4, -1, -1, true, false, false, false));
  }

  public void test10o() {
    assertEquals(14, new Plantri().count(10, 4, -1, -1, true, false, false, false));
  }

  public void test11o() {
    assertEquals(45, new Plantri().count(11, 4, -1, -1, true, false, false, false));
  }

  public void test8c() {
    assertEquals(2, new Plantri().count(8, -1, 4, -1, false, false, false, false));
  }

  public void test9c() {
    assertEquals(4, new Plantri().count(9, -1, 4, -1, false, false, false, false));
  }

  public void test10c() {
    assertEquals(10, new Plantri().count(10, -1, 4, -1, false, false, false, false));
  }

  public void test9co() {
    assertEquals(4, new Plantri().count(9, -1, 4, -1, true, false, false, false));
  }

  public void test10co() {
    assertEquals(12, new Plantri().count(10, -1, 4, -1, true, false, false, false));
  }

  public void test11co() {
    assertEquals(32, new Plantri().count(11, -1, 4, -1, true, false, false, false));
  }

  public void test3ConnectedPlanarTriangulationsMinDeg4ResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(13, 4, -1, -1, false, false, false, false);
      }
      assertEquals(525, sum);
    }
  }

}
