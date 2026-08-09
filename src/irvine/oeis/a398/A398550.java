package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398550 Largest value occurring in any n-tuple (x_1, ..., x_n) of distinct positive integers with 1/x_1 + 2/x_2 + ... + n/x_n = n.
 * @author Sean A. Irvine
 */
public class A398550 extends Sequence1 {

  // After Keisuke Hidaka

  private int mN;
  private boolean[] mUsed;
  private Z mMax = null;

  private void search(final int remaining, final int sumRemaining, final int lo, final Q r) {
    if (remaining == 1) {
      for (int k = 1; k <= mN; ++k) {
        if (!mUsed[k]) {
          final Q q = new Q(k).divide(r);
          if (q.isInteger() && q.signum() > 0 && q.toZ().compareTo(lo) >= 0) {
            mMax = mMax.max(q.toZ());
          }
          return;
        }
      }
    }

    final long hi = sumRemaining * r.den().longValueExact() / r.num().longValueExact();
    for (int m = lo; m <= hi; ++m) {
      for (int k = 1; k <= mN; ++k) {
        if (!mUsed[k]) {
          final Q r2 = r.subtract(new Q(k, m));
          if (r2.signum() > 0) {
            mUsed[k] = true;
            search(remaining - 1, sumRemaining - k, m + 1, r2);
            mUsed[k] = false;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mUsed = new boolean[mN + 1];
    mMax = Z.ZERO;
    search(mN, Functions.TRIANGULAR.i(mN), 1, new Q(mN));
    return mMax;
  }
}
