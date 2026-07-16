package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397705 allocated for John W. Nicholson.
 * @author Sean A. Irvine
 */
public class A397705 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  private boolean is(final long n) {
    for (long p = 3; 3 * p <= n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime((n - p) / 2)) {
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
