package irvine.math.polynomial;

import irvine.math.group.SymmetricGroup;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PairMultiplyTest extends TestCase {

  public void test() {
    final CycleIndex zn = SymmetricGroup.create(3).cycleIndex();
    final CycleIndex pair = zn.op(PairMultiply.OP, zn);
    assertEquals("Z(S3)*Z(S3) = (1/3)x_3 + (1/2)x_1x_2 + (1/6)x_1^3", pair.toString());
  }
}
