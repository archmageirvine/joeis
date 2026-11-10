package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087331.
 * @author Sean A. Irvine
 */
public class A401624 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mLim = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim *= 10;
    while (mP < mLim) {
      if (mPrime.isPrime(2 * mP - 1)) {
        ++mCount;
      }
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mCount);
  }
}
