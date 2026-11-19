package irvine.oeis.a400;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;
import irvine.util.array.DynamicLongArray;

/**
 * A400297 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A400297 extends Sequence1 {

  private final Fast mPrimes = new Fast();
  private final DynamicLongArray mSums = new DynamicLongArray();
  private final DynamicLongArray mLast = new DynamicLongArray();
  private final DynamicIntArray mTerms = new DynamicIntArray();
  private long mP = 1;
  private long mT = 0;
  private long mQ = 1;

  @Override
  public Z next() {
    while (true) {
      mQ = mPrimes.nextPrime(mQ);
      int k = -1;
      long v = 1;
      while ((mT + 1) * v <= mQ) {
        v = mPrimes.nextPrime(v);
        ++k;
        if (mLast.get(k) == 0) {
          mP = mPrimes.nextPrime(mP);
          mLast.set(k, mP);
          mSums.set(k, mP);
          mTerms.set(k, 1);
        }
        while (mSums.get(k) < mQ) {
          final long r = mPrimes.nextPrime(mLast.get(k));
          mLast.set(k, r);
          mSums.add(k, r);
          mTerms.increment(k);
        }
        if (mSums.get(k) == mQ && mTerms.get(k) > mT) {
          mT = mTerms.get(k);
          return Z.valueOf(mT);
        }
      }
    }
  }
}
