package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398389 Even positive numbers m such that m - 2^k is composite for all k &gt; 0 with 2^k &lt; m.
 * @author Sean A. Irvine
 */
public class A398389 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 6;

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
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
