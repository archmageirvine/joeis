package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397121.
 * @author Sean A. Irvine
 */
public class A399878 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      if (mN % k != 0) {
        sum = sum.add(Functions.GCD.l(mN, mN / k + 1) - Functions.GCD.l(mN, mN / k));
      }
    }
    return sum;
  }
}

