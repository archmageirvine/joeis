package irvine.oeis.a398;

import java.util.Collections;
import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398772 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A398772 extends Sequence1 {

  private Q mRecordLow = Q.TWO;
  private long mK = 1;
  private List<Z> mCf = Collections.singletonList(Z.ZERO);
  private int mM = -1;

  private void updateRecordLow() {
    while (true) {
      final Z start = Z.valueOf(++mK);
      Z x = start;
      do {
        x = x.isEven() ? x.divide2() : x.multiply(3).add(1).divide2();
      } while (x.compareTo(start) >= 0);
      final Q g = new Q(start.subtract(x), start);
      if (g.compareTo(mRecordLow) < 0) {
        mRecordLow = g;
        return;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mCf.size()) {
      updateRecordLow();
      mCf = ContinuedFractionUtils.continuedFraction(mRecordLow);
      mM = 0;
    }
    return mCf.get(mM);
  }
}
