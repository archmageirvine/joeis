package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Min5CScannerTest extends TestCase {

  public void testPlanarC5() {
    assertEquals(3, new Plantri().count(16, -1, 5, -1, false, false, false, false));
    assertEquals(71, new Plantri().count(20, -1, 5, -1, false, false, false, false));
    assertEquals(627, new Plantri().count(22, -1, 5, -1, false, false, false, false));
  }
}
