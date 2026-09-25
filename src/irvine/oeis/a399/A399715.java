package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399715 T(n,k) is the k-th term obtained by greedily selecting the smallest number in {1..n} whose sorted distances to previously selected terms are lexicographically maximal, triangle read by rows.
 * @author Sean A. Irvine
 */
public class A399715 extends Sequence1 {

  private int mM = 0;
  private long[] mRow = {};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = LongUtils.identity(new long[mRow.length + 1]);
      for (int k = 0; k < mRow.length; ++k) {
        long[] best = new long[k];
        int bestj = 0;
        for (int j = k; j < mRow.length; ++j) {
          final long y = mRow[j];
          final long[] delta = new long[k];
          for (int i = 0; i < k; ++i) {
            delta[i] = Math.abs(mRow[i] - y);
          }
          Arrays.sort(delta);
          if (LongUtils.lt(best, delta) || (Arrays.equals(delta, best) && mRow[j] < mRow[bestj])) {
            best = delta;
            bestj = j;
          }
        }
        final long t = mRow[k];
        mRow[k] = mRow[bestj];
        mRow[bestj] = t;
      }
    }
    return Z.valueOf(mRow[mM] + 1);
  }
}
