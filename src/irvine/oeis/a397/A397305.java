package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397305 Positive numbers m such that m - 2^k is composite for all k &gt; 0 with 2^k &lt; m.
 * @author Sean A. Irvine
 */
public class A397305 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  private boolean is(final long n) {
    for (long k = 2; k < n; k <<= 1) {
      if (mPrime.isPrime(n - k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
