package irvine.math.group;

import junit.framework.TestCase;
import irvine.math.polynomial.CycleIndex;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GeneralLinearCycleIndexTest extends TestCase {

  public void test() {
    try {
      GeneralLinearCycleIndex.cycleIndex(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final CycleIndex ci = GeneralLinearCycleIndex.cycleIndex(4);
    assertEquals("GL_4(Z_2) = (2/15)x_1x_{15} + (1/15)x_1x_5^3 + (1/12)x_1x_3x_6^2 + (1/180)x_1x_3^5 + (2/7)x_1^2x_7^2 + (1/8)x_1^2x_2x_4^3 + (1/6)x_1^2x_2x_3^2x_6 + (1/18)x_1^4x_3^4 + (1/16)x_1^4x_2^2x_4^2 + (1/96)x_1^4x_2^6 + (1/192)x_1^8x_2^4 + (1/20160)x_1^{16}", ci.toString());
    assertEquals("GL_4(Z_2)", ci.getName());
    try {
      GeneralLinearCycleIndex.cycleIndex(100000);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
