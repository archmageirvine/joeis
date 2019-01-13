package irvine.math.polynomial;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GraphCycleIndexTest extends TestCase {

  public void testH4() {
    final CycleIndex zh4 = GraphCycleIndex.cycleIndex(4);
    assertEquals("Z(H4) = x_4 + 2x_2^2 + (4/3)x_1x_3 + 4x_1^2x_2 + (8/3)x_1^4", zh4.toString());
    assertEquals(Z.valueOf(11), zh4.eval(1).toZ()); // 11 graphs of order 4
  }

  public void testH() {
    final CycleIndex zh = GraphCycleIndex.cycleIndexUpTo(4);
    assertEquals("Z(H) = 1 + x_4 + (2/3)x_3 + x_2 + 2x_2^2 + x_1 + (4/3)x_1x_3 + 2x_1x_2 + x_1^2 + 4x_1^2x_2 + (4/3)x_1^3 + (8/3)x_1^4", zh.toString());
    assertEquals(Z.valueOf(19), zh.eval(1).toZ()); // 19 graphs of order at most 4
  }

  public void testH5() {
    final CycleIndex zh = GraphCycleIndex.cycleIndexUpTo(5);
    assertEquals(Z.valueOf(53), zh.eval(1).toZ()); // 53 graphs of order at most 5
    assertEquals("Z(H) = 1 + (4/5)x_5 + x_4 + (2/3)x_3 + x_2 + (4/3)x_2x_3 + 2x_2^2 + x_1 + 2x_1x_4 + (4/3)x_1x_3 + 2x_1x_2 + 8x_1x_2^2 + x_1^2 + (8/3)x_1^2x_3 + 4x_1^2x_2 + (4/3)x_1^3 + (32/3)x_1^3x_2 + (8/3)x_1^4 + (128/15)x_1^5", zh.toString());
  }

  public void testH5D() {
    // todo one term below does not match paper -- might be error in paper
    final CycleIndex zhd = GraphCycleIndex.cycleIndexUpToDeriv(5);
    assertEquals("Z(H') = x_1 + 2x_1x_4 + (4/3)x_1x_3 + 2x_1x_2 + 8x_1x_2^2 + 2x_1^2 + (16/3)x_1^2x_3 + 8x_1^2x_2 + 4x_1^3 + 32x_1^3x_2 + (32/3)x_1^4 + (128/3)x_1^5", zhd.toString());
  }
}
