package irvine.math.plantri;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PolytopeScannerTest extends TestCase {

  public void test5() {
    assertEquals(2, new Plantri().count(5, -1, -1, -1, false, true, false, false));
  }

  public void test6() {
    assertEquals(7, new Plantri().count(6, -1, 3, -1, false, true, false, false));
  }

  public void test8() {
    assertEquals(257, new Plantri().count(8, -1, 3, -1, false, true, false, false));
  }

  public void test10m3() {
    assertEquals(67, new Plantri().count(10, 4, 3, -1, false, true, false, false));
  }

  public void testPlanarM2C2() {
    final Plantri plantri = new Plantri();
    assertEquals(2, plantri.count(5, 2, 2, -1, false, true, false, false));
    assertEquals(61, plantri.count(6, 2, 2, -1, false, true, false, false));
    assertEquals(559, plantri.count(7, 2, 2, -1, false, true, false, false));
    assertEquals(7559, plantri.count(8, 2, 2, -1, false, true, false, false));
    assertEquals("[0, 36]", Arrays.toString(plantri.mEdgeBound));
  }
}
