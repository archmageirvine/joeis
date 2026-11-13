
package irvine.oeis.a399;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399557 a(n) is the smallest prime p such that p and p+2n are both terms of A179502, or 0 if no such p exists.
 * @author Sean A. Irvine
 */
public class A399557 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    if (!mPrime.isPrime(n)) {
      return false;
    }
    final Z k2 = Z.valueOf(n).square();
    return mPrime.isPrime(n)
      && mPrime.isPrime(k2.add(1).divide2())
      && mPrime.isPrime(k2.add(2).divide(3));
  }

  @Override
  public Z next() {
    ++mN;
    if (mN % 5 == 2 || mN % 5 == 3) {
      return Z.ZERO;
    }
    final long m = 2 * mN;
    long p = 3;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p) && is(p + m)) {
        return Z.valueOf(p);
      }
    }
  }
}
