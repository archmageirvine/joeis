package irvine.oeis.a399;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399358 Primes p &gt; 3 such that the elliptic curve y^2 = x^3 + 7 over GF(p) has a prime number of points (including the point at infinity).
 * @author Sean A. Irvine
 */
public class A399358 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  private long n(final long p) {
    final long e = (p - 1) / 2;
    long sum = 1;
    for (long x = 0; x < p; ++x) {
      final long r = (LongUtils.modPow(x, 3, p) + 7) % p;
      if (r == 0) {
        ++sum;
      } else if (LongUtils.modPow(r, e, p) == 1) {
        sum += 2;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP != 7 && mPrime.isPrime(n(mP))) {
        return Z.valueOf(mP);
      }
    }
  }
}
