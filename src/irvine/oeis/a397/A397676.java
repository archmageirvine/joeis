package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397676 Sum of absolute differences of consecutive terms of n/gcd(n,k), k = 1..n-1.
 * @author Sean A. Irvine
 */
public class A397676 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long g = Functions.GCD.l(++mN, 1);
    for (long k = 2; k < mN; ++k) {
      final long d = g;
      g = Functions.GCD.l(mN, k);
      sum = sum.add(Math.abs(mN / g - mN / d));
    }
    return sum;
  }
}

