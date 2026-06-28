package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396786 Smallest prime p such that p^(q^3) = +-1 mod q^5 is true when q is any of the first n primes.
 * @author Sean A. Irvine
 */
public class A396786 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mQ = Z.TWO;

  private boolean is(final Z p, final Z q) {
    for (Z r = Z.TWO; r.compareTo(p) <= 0; r = mPrime.nextPrime(r)) {
      final Z r2 = r.pow(3);
      final Z r5 = r.pow(5);
      final Z t = q.modPow(r2, r5);
      if (!t.isOne() && !t.equals(r5.subtract(1))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!is(mP, mQ)) {
      mQ = mPrime.nextPrime(mQ);
    }
    return mQ;
  }
}
