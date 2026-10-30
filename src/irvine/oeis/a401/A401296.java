package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401296 Smallest even k &gt; 0 such that k == +1 or -1 (mod p) for each of the first n odd primes p.
 * @author Sean A. Irvine
 */
public class A401296 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0, p = 3; k < mN; ++k, p = mPrime.nextPrime(p)) {
      prod = prod.multiply(p);
    }
    Z best = null;
    for (long s = 0; s < 1L << mN; ++s) {
      Z r = Z.ZERO;
      Z m = Z.ONE;
      Z p = Z.THREE;
      for (long k = 0, t = s; k < mN; ++k, t >>>= 1, p = mPrime.nextPrime(p)) {
        final long sign = 1 - 2 * (t & 1);
        final Z a = m.modInverse(p).modMultiply(Z.valueOf(sign).subtract(r), p);
        r = r.add(a.multiply(m));
        m = m.multiply(p);
      }
      final Z k = r.isEven() ? r : r.add(prod);
      if (best == null || k.compareTo(best) < 0) {
        best = k;
      }
    }
    return best;
  }
}
