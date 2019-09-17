package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadrangulationDispatcherTest extends TestCase {

  public void testQuadrangulations() {
    assertEquals(1, new Plantri().count(8, -1, -1, -1, false, false, true, false));
    assertEquals(0, new Plantri().count(9, -1, -1, -1, false, false, true, false));
    assertEquals(18, new Plantri().count(15, -1, -1, -1, false, false, true, false));
    assertEquals(58, new Plantri().count(16, -1, -1, -1, false, false, true, false));
  }

  public void testQuadrangulationsOP() {
    assertEquals(92, new Plantri().count(16, -1, -1, -1, true, false, true, false));
  }

  // Unconfirmed numbers in this test
  public void testQuadrangulationsM2C2() {
    assertEquals(4, new Plantri().count(7, 2, 2, -1, false, false, true, false));
    assertEquals(20, new Plantri().count(8, 2, 2, -1, false, false, true, false));
  }
}
