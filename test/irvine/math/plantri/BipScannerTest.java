package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BipScannerTest extends TestCase {

  public void test12() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(5, plantri.count(12, -1, -1, -1, false, true, false, false));
  }

  public void test13() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(5, plantri.count(13, -1, -1, -1, false, true, false, false));
  }

  public void test14() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(21, plantri.count(14, -1, -1, -1, false, true, false, false));
  }

  public void test15() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(40, plantri.count(15, -1, -1, -1, false, true, false, false));
  }

  public void test16() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(176, plantri.count(16, -1, -1, -1, false, true, false, false));
  }

}
