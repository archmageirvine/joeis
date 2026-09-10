package irvine.oeis.a399;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;
import irvine.oeis.Sequence1;

/**
 * A399547 allocated for Benjamin Testart.
 * @author Sean A. Irvine
 */
public class A399547 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private AtomicLong[] mCounts = {};

  private static int[] lehmer(final int[] p) {
    final int[] res = new int[p.length];
    for (int k = 0; k < p.length; ++k) {
      for (int j = k + 1; j < p.length; ++j) {
        if (p[j] < p[k]) {
          ++res[k];
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      mCounts = new AtomicLong[++mN];
      for (int k = 0; k < mCounts.length; ++k) {
        mCounts[k] = new AtomicLong();
      }
      mM = 0;
      new ParallelPermutationSequence(mN) {
        @Override
        protected long count(final int[] p) {
          int[] q = p.clone();
          int cnt = 0;
          while (true) {
            final int[] r = lehmer(q);
            if (Arrays.equals(q, r)) {
              break;
            }
            q = r;
            ++cnt;
          }
          mCounts[cnt].incrementAndGet();
          return 0;
        }
      }.next();
    }
    return Z.valueOf(mCounts[mM].get());
  }
}
