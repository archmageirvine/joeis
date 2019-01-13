package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PolytopeC3ScannerTest extends TestCase {

  public void test5() {
    assertEquals(2, new Plantri().count(5, -1, -1, -1, false, true, false, false));
  }

  public void test6() {
    assertEquals(7, new Plantri().count(6, -1, -1, -1, false, true, false, false));
  }

  public void test7() {
    assertEquals(34, new Plantri().count(7, -1, -1, -1, false, true, false, false));
  }

  public void test8() {
    assertEquals(257, new Plantri().count(8, -1, -1, -1, false, true, false, false));
  }

  public void test9() {
    assertEquals(2606, new Plantri().count(9, -1, -1, -1, false, true, false, false));
  }

  public void test5o() {
    assertEquals(2, new Plantri().count(5, -1, -1, -1, true, true, false, false));
  }

  public void test6o() {
    assertEquals(8, new Plantri().count(6, -1, -1, -1, true, true, false, false));
  }

  public void test7o() {
    assertEquals(45, new Plantri().count(7, -1, -1, -1, true, true, false, false));
  }

}
