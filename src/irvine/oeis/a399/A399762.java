package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A399762 allocated for David Niedbala Giraudin.
 * @author Sean A. Irvine
 */
public class A399762 extends Sequence1 {

  // After David Niedbala Giraudin

  private static final int[][] B = {
    {2, 1},
    {3, 1},
    {4, 2},
    {5, 2},
    {6, 2},
    {7, 2}
  };

  private int mN = 0;
  private final List<int[][]> mLv = new ArrayList<>();
  {
    mLv.add(new int[][] {{1, 0}});
  }

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    // Construct lv[mN] from previously constructed levels.
    final DynamicIntArray currentX = new DynamicIntArray();
    final DynamicIntArray currentY = new DynamicIntArray();
    int j = 0;
    for (final int[] bk : B) {
      final int b = bk[0];
      final int k = bk[1];
      if (k > mN) {
        continue;
      }
      for (final int[] pq : mLv.get(mN - k)) {
        final int p = pq[0];
        final int q = pq[1];
        final int r = (((b >> 2) & 1) * (p << 2))
          ^ (((b >> 1) & 1) * (p << 1))
          ^ ((b & 1) * p)
          ^ q;
        currentX.set(j, r);
        currentY.set(j++, p);
      }
    }
    final int[][] next = new int[j][2];
    for (int v = 0; v < j; ++v) {
      next[v][0] = currentX.get(v);
      next[v][1] = currentY.get(v);
    }

    mLv.add(next);
    final int size = 1 << mN;
    final int[] c = new int[size];
    for (final int[] pq : next) {
      ++c[pq[0] ^ size];
    }
    int min = Integer.MAX_VALUE;
    for (final int x : c) {
      min = Math.min(min, x);
    }
    return Z.valueOf(min);
  }
}
