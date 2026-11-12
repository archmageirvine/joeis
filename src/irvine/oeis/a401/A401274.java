package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005100;
import irvine.oeis.a005.A005101;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401274 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A401274 extends Sequence2 {

  private final LongDynamicLongArray mD = new LongDynamicLongArray();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final Sequence mDeficient = new A005100();
  private final Sequence mAbundant = new A005101();
  private int mN = 1;

  private long deficient(final long k) {
    while (k >= mD.length()) {
      mD.set(mD.length(), mDeficient.next().longValueExact());
    }
    return mD.get(k);
  }

  private long abundant(final long k) {
    while (k >= mA.length()) {
      mA.set(mA.length(), mAbundant.next().longValueExact());
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
    while (abundant(k) * remaining <= n) {
      if (is(n - abundant(k), remaining - 1, k + 1)) {
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
    while (!is(deficient(k), mN, 0)) {
      ++k;
    }
    return Z.valueOf(deficient(k));
  }
}
