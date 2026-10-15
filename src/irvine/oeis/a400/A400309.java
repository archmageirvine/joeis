package irvine.oeis.a400;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;
import irvine.oeis.Sequence0;

/**
 * A400309 Triangle read by rows: T(n,k) is the number of involutions p of {1,...,n} such that inv(p) + rlmin(p) - n = k, where inv is the number of inversions and rlmin the number of right-to-left minima.
 * @author Sean A. Irvine
 */
public class A400309 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Map<Integer, Long> mCounts = new ConcurrentHashMap<>();
  private int mMax = 0;

  @Override
  public Z next() {
    if (++mM > mMax) {
      mCounts = new ConcurrentHashMap<>();
      mM = 0;
      new ParallelPermutationSequence(++mN) {
        @Override
        protected long count(final int[] p) {
          int inv = 0;
          for (int k = 0; k < p.length; ++k) {
            for (int j = k + 1; j < p.length; ++j) {
              if (p[k] > p[j]) {
                ++inv;
              }
            }
          }
          int m = p.length;
          int r = 0;
          for (int k = p.length - 1; k >= 0; --k) {
            final int v = p[k];
            if (v < m) {
              m = v;
              ++r;
            }
          }
          mCounts.merge(inv + r - p.length, 1L, Long::sum);
          return 0;
        }

        @Override
        protected boolean accept(final int[] p, final int sum, final int pos) {
          // incremental involution check
          if (pos <= 1) {
            return true;
          }
          final int t = p[pos - 1];
          return t >= pos || p[t] == pos - 1;
        }
      }.next();
      mMax = IntegerUtils.max(mCounts.keySet());
    }
    return Z.valueOf(mCounts.getOrDefault(mM, 0L));
  }
}
