package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401455 allocated for Yonatan Haver.
 * @author Sean A. Irvine
 */
public class A401455 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;
  private int[] mParts = null;

  private boolean isOk(final int k, final int pos) {
    for (int j = 0; j < pos; ++j) {
      if (!Predicates.SQUARE_FREE.is(k + mParts[j])) {
        return false;
      }
    }
    return true;
  }

  private void search(final int remaining, final int pos) {
    if (remaining == 0) {
      ++mCount;
      return;
    }
    int k = pos == 0 ? remaining + 1 : Math.min(mParts[pos - 1], remaining + 1);
    while (Functions.TRIANGULAR.i(--k) >= remaining) {
      if (isOk(k, pos)) {
        mParts[pos] = k;
        search(remaining - k, pos + 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mParts = new int[mN];
    mCount = 0;
    search(mN, 0);
    return Z.valueOf(mCount);
  }
}
