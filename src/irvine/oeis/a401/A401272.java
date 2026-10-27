package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005101;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401272 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A401272 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final Sequence mS = new A005101();
  private int mN = 0;

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
    long k = 0;
    while (!is(s(k), mN, 0)) {
      ++k;
    }
    return Z.valueOf(s(k));
  }
}
