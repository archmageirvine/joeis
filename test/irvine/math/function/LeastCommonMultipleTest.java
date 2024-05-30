package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LeastCommonMultipleTest extends TestCase {

  public void testLcm() {
    assertEquals(2, Functions.LCM.l(2, 2));
    assertEquals(6, Functions.LCM.l(2, 3));
    assertEquals(24, Functions.LCM.l(12, 8));
  }
}
