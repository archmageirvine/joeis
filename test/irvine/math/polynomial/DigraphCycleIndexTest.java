package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DigraphCycleIndexTest extends TestCase {

  public void test() {
    assertEquals("Z(S_{4}^{[2]}) = (1/4)x_4^3 + (1/3)x_3^4 + (1/8)x_2^6 + (1/4)x_1^2x_2^5 + (1/24)x_1^{12}", DigraphCycleIndex.cycleIndex(4).toString());
  }
}
