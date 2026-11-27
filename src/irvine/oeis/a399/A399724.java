package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014574;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399724 allocated for Mourad Belafsahi.
 * @author Sean A. Irvine
 */
public class A399724 extends Sequence1 {

  private final Sequence mA = new A014574();
  private final LongDynamicLongArray mT = new LongDynamicLongArray();
  private long mN = 0;

  private long get(final long k) {
    while (k >= mT.length()) {
      mT.set(mT.length(), mA.next().longValueExact());
    }
    return mT.get(k);
  }

  private boolean is(final long n, final int terms, final long pos) {
    if (terms == 4) {
      return n == 0;
    }
    long k = pos;
    while (get(k) <= n) {
      if (is(n - get(k), terms + 1, k)) {
        return true;
      }
      ++k;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!is(mN, 0, 0)) {
        return Z.valueOf(mN).multiply2();
      }
    }
  }
}
