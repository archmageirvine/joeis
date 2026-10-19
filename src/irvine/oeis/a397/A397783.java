package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397783 allocated for Tomas Laris.
 * @author Sean A. Irvine
 */
public class A397783 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long g = Functions.GCD.l(++mN, 1);
    for (long k = 2; k < mN; ++k) {
      final long d = g;
      g = Functions.GCD.l(mN, k);
      sum = sum.add(Z.valueOf(Math.abs(mN / g - mN / d)).square());
    }
    return sum;
  }
}

