package irvine.oeis.a399;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002760;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399854 Smallest prime that is the sum of n distinct elements from the union of squares and cubes.
 * @author Sean A. Irvine
 */
public class A399854 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final Sequence mS = new A002760().skip();
  private int mN = 1;

  private long s(final long k) {
    while (k >= mA.length()) {
      mA.set(mA.length(), mS.next().longValueExact());
    }
    return mA.get(k);
  }

  private boolean is(final long n, final int remaining, final long pos) {
    if (remaining == 0) {
      return n == 0;
    }
    if (n <= 0) {
      return false;
    }
    long k = pos;
    while (s(k) * remaining <= n) {
      if (is(n - s(k), remaining - 1, k + 1)) {
        return true;
      }
      ++k;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (!is(p, mN, 0)) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
