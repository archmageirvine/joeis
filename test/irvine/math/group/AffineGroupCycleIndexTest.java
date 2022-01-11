package irvine.math.group;

import irvine.math.polynomial.CycleIndex;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AffineGroupCycleIndexTest extends TestCase {

  public void test() {
    try {
      AffineGroupCycleIndex.cycleIndex(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final CycleIndex ci = AffineGroupCycleIndex.cycleIndex(4);
    assertEquals("AG(4,2) = (1/16)x_8^2 + (1/12)x_4x_{12} + (1/24)x_4^4 + (1/7)x_2x_{14} + (1/24)x_2^2x_6^2 + (1/64)x_2^4x_4^2 + (43/21504)x_2^8 + (2/15)x_1x_{15} + (1/15)x_1x_5^3 + (1/12)x_1x_3x_6^2 + (1/180)x_1x_3^5 + (1/7)x_1^2x_7^2 + (1/16)x_1^2x_2x_4^3 + (1/12)x_1^2x_2x_3^2x_6 + (1/72)x_1^4x_3^4 + (1/64)x_1^4x_2^2x_4^2 + (1/384)x_1^4x_2^6 + (1/1536)x_1^8x_2^4 + (1/322560)x_1^{16}", ci.toString());
    assertEquals("AG(4,2)", ci.getName());
    try {
      AffineGroupCycleIndex.cycleIndex(100000);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
