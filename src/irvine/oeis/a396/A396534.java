package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A396534 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x + 79^2)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A396534 extends Sequence1 {

  private final Z[] mA = ZUtils.toZ(0, 1580, 3636, 8319, 12719, 18723, 26939, 38199, 64736, 90060);
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    final Z t = mA[5].multiply(6).subtract(mA[0]).add(12482);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = t;
    return t;
  }
}
