package irvine.math.group;

import junit.framework.TestCase;
import irvine.math.polynomial.CycleIndex;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DihedralGroupTest extends TestCase {

  public void test() {
    try {
      DihedralGroup.cycleIndex(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals("Z(D1) = x_1", DihedralGroup.cycleIndex(1).toString());
    assertEquals("Z(D2) = (1/2)x_2 + (1/2)x_1^2", DihedralGroup.cycleIndex(2).toString());
    assertEquals("Z(D3) = (1/3)x_3 + (1/2)x_1x_2 + (1/6)x_1^3", DihedralGroup.cycleIndex(3).toString());
    final CycleIndex c4 = DihedralGroup.cycleIndex(4);
    assertEquals("Z(D4) = (1/4)x_4 + (3/8)x_2^2 + (1/4)x_1^2x_2 + (1/8)x_1^4", c4.toString());
    assertEquals("Z(D4)", c4.getName());
    assertEquals("Z(D5) = (2/5)x_5 + (1/2)x_1x_2^2 + (1/10)x_1^5", DihedralGroup.cycleIndex(5).toString());
    assertEquals("Z(D6) = (1/6)x_6 + (1/6)x_3^2 + (1/3)x_2^3 + (1/4)x_1^2x_2^2 + (1/12)x_1^6", DihedralGroup.cycleIndex(6).toString());
  }
}
