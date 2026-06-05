package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A396526 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x + 71^2)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A396526 extends Sequence1 {

  private final Z[] mA = ZUtils.toZ(0, 923, 2040, 8379, 11360, 15123, 19880, 25899, 61820, 79023);
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    final Z t = mA[5].multiply(6).subtract(mA[0]).add(10082);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = t;
    return t;
  }
}
