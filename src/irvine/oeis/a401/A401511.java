package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401511 Value of m - (2k + 3), where m is the prime index of the n-th prime that is the sum of three consecutive primes (A034962), and k is the prime index of the first of those three consecutive primes (A073681).
 * @author Sean A. Irvine
 */
public class A401511 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;
  private long mSumP = 1;
  private long mSumN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mP);
      final long r = mPrime.nextPrime(q);
      final long s = mP + q + r;
      if (mPrime.isPrime(s)) {
        while (mSumP != s) {
          ++mSumN;
          mSumP = mPrime.nextPrime(mSumP);
        }
        return Z.valueOf(mSumN - (2 * mN + 3));
      }
    }
  }
}
