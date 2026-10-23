package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401025 Maximum absolute difference between consecutive terms of n/gcd(n,k), k = 1..n-1.
 * @author Sean A. Irvine
 */
public class A401025 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    long g = Functions.GCD.l(++mN, 1);
    for (long k = 2; k < mN; ++k) {
      final long d = g;
      g = Functions.GCD.l(mN, k);
      max = max.max(Math.abs(mN / g - mN / d));
    }
    return max;
  }
}

