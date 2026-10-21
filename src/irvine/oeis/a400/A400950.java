package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400950 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A400950 extends Sequence1 {

  // After David Cleaver

  private int mN = 0;
  private int mM = 0;
  private long[] mMinSums = {};
  private Z[] mNumWays = {};

  private static long t(final long n, final long k) {
    if (k == 0) {
      return 0;
    }
    if ((n & 1) == 0) {
      return 2 * t(n / 2, k);
    }
    if ((k & 1) == 0) {
      return 2 * t(n / 2, k / 2);
    }
    return 2 * t(n / 2, k / 2) + 1;
  }

  protected long bsum(final int i) {
    return i;
  }

  private long tsum(final long n) {
    long sum = 0;
    int i = 1;
    long v = n;
    while (v != 0) {
      if ((v & 1) != 0) {
        sum += bsum(i);
      }
      v >>>= 1;
      ++i;
    }
    return sum;
  }

  private void record(final List<Long> cover) {
    final int len = cover.size();
    long max = 0;
    for (final long v : cover) {
      max = Math.max(max, tsum(v));
    }
    if (mMinSums[len - 1] == 0 || max < mMinSums[len - 1]) {
      mMinSums[len - 1] = max;
      mNumWays[len - 1] = Z.ONE;
    } else if (max == mMinSums[len - 1]) {
      mNumWays[len - 1] = mNumWays[len - 1].add(Z.ONE);
    }
  }

  private void exactCovers(final long n, final List<Long> cover) {
    final long limit = 1L << Long.bitCount(n);
    for (long k = 1; k < limit; ++k) {
      final long v = t(n, k);
      if (v < cover.get(cover.size() - 1)) {
        continue;
      }
      final long nw = n ^ v;
      if (nw == 0) {
        final List<Long> z = new ArrayList<>(cover);
        z.add(v);
        record(z);
        return;
      }
      if (nw < v) {
        continue;
      }
      final List<Long> next = new ArrayList<>(cover);
      next.add(v);
      exactCovers(nw, next);
    }
  }

  protected Z select(final Z ways, final long min) {
    return ways;
  }

  @Override
  public Z next() {
    if (++mM >= mNumWays.length) {
      ++mN;
      mM = 0;
      mMinSums = new long[mN];
      mNumWays = new Z[mN];
      for (int i = 0; i < mN; ++i) {
        mNumWays[i] = Z.ZERO;
      }
      final long z = (1L << mN) - 1;
      mMinSums[0] = tsum(z);
      mNumWays[0] = Z.ONE;
      for (long i = 1; i < z; ++i) {
        final long v = t(z, i);
        final long nw = z ^ v;
        final List<Long> cover = new ArrayList<>();
        cover.add(v);
        exactCovers(nw, cover);
      }
    }
    return select(mNumWays[mM], mMinSums[mM]);
  }
}
