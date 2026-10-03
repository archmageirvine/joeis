package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A397095 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mP = 1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      long f = 1;
      int cnt = 0;
      for (long k = 1; k < mP; ++k) {
        f *= k;
        f %= mP;
        if (f == mP - 1) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
        if (mVerbose) {
          StringUtils.message("Solution for n=" + cnt + " is " + mP);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

