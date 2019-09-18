package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationDispatcherTest extends TestCase {

  public void testQuadrangulations() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(8, -1, -1, -1, false, false, true, false));
    assertEquals(0, plantri.count(9, -1, -1, -1, false, false, true, false));
    assertEquals(18, plantri.count(15, -1, -1, -1, false, false, true, false));
    assertEquals(58, plantri.count(16, -1, -1, -1, false, false, true, false));
    plantri.setResMod(1, 2);
    assertEquals(19, plantri.count(16, -1, -1, -1, false, false, true, false));
    plantri.setResMod(1, 200);
    assertEquals(2649, plantri.count(24, -1, -1, -1, false, false, true, false));
  }

  public void testQuadrangulationsOP() {
    assertEquals(92, new Plantri().count(16, -1, -1, -1, true, false, true, false));
    assertEquals(92, new Plantri().count(16, 5, 3, -1, true, false, true, false));
  }

  // Unconfirmed numbers in this test
  public void testQuadrangulationsM2C2() {
    final Plantri plantri = new Plantri();
    assertEquals(4, plantri.count(7, 2, 2, -1, false, false, true, false));
    assertEquals(20, plantri.count(8, 2, 2, -1, false, false, true, false));
    assertEquals(1, plantri.count(8, 3, 1, -1, false, false, true, false));
  }
}
