package irvine.oeis.a398;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398118 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A398118 extends Sequence1 {

  private long mN = 4;
  private final long[] mPowers = new long[15];
  {
    // All powers that fit in a long
    for (int k = 0; k < mPowers.length; ++k) {
      mPowers[k] = LongUtils.pow(k, k);
    }
  }

  private boolean is(final long n, final long b) {
    long sum = 0;
    long m = n;
    while (m != 0) {
      final long d = m % b;
      if (d >= mPowers.length) {
        return false;
      }
      final long p = mPowers[(int) d];
      if (p > n) {
        return false;
      }
      sum += p;
      if (sum > n) {
        return false;
      }
      m /= b;
    }
    return sum == n;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long b = 2; b <= mN - 2; ++b) {
        if (is(mN, b)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

