package irvine.oeis.a399;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a398.A398545;

/**
 * A399300 a(n) is the least even number whose n-th smallest Goldbach prime equals A398545(n).
 * @author Sean A. Irvine
 */
public class A399300 extends A398545 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean is(final long m, final int n, final long p) {
    int cnt = 0;
    for (long q = 3; q <= p && 2 * q <= m; q = mPrime.nextPrime(q)) {
      if (mPrime.isPrime(m - q)) {
        if (++cnt > n) {
          return false;
        }
        if (cnt == n && q == p) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final long p = super.next().longValueExact();
    long m = 4;
    while (true) {
      m += 2;
      if (is(m, mN, p)) {
        return Z.valueOf(m);
      }
    }
  }
}
