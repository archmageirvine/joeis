package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398549 allocated for Keisuke Hidaka.
 * @author Sean A. Irvine
 */
public class A398549 extends Sequence1 {

  // After Keisuke Hidaka

  private int mN;
  private boolean[] mUsed;

  private Z search(final int remaining, final int sumRemaining, final int lo, final Q r) {
    if (remaining == 1) {
      for (int k = 1; k <= mN; ++k) {
        if (!mUsed[k]) {
          final Q q = new Q(k).divide(r);
          return q.isInteger() && q.signum() > 0 && q.toZ().compareTo(lo) >= 0 ? Z.ONE : Z.ZERO;
        }
      }
    }

    final long hi = sumRemaining * r.den().longValueExact() / r.num().longValueExact();

    Z cnt = Z.ZERO;
    for (int m = lo; m <= hi; ++m) {
      for (int k = 1; k <= mN; ++k) {
        if (!mUsed[k]) {
          final Q r2 = r.subtract(new Q(k, m));
          if (r2.signum() > 0) {
            mUsed[k] = true;
            cnt = cnt.add(search(remaining - 1, sumRemaining - k, m + 1, r2));
            mUsed[k] = false;
          }
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    mUsed = new boolean[mN + 1];
    return search(mN, Functions.TRIANGULAR.i(mN), 1, new Q(mN));
  }
}
