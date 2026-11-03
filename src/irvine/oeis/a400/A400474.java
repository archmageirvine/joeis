package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A400474 allocated for Takuto Nakai.
 * @author Sean A. Irvine
 */
public class A400474 extends Sequence3 {

  // After Takuto Nakai

  private int mN = 2;

  private int cnt(final int p, final int q, final int r) {
    int t = 0;
    for (int x = p + 1; x < mN; ++x) {
      for (int y = q + 1; y < mN; ++y) {
        final int z = 2 * mN - x - y;
        if (r < z && z < mN && x != y && y != z && x != z) {
          ++t;
        }
      }
    }
    return t;
  }

  @Override
  public Z next() {
    ++mN;
    int best = 0;
    for (int s = mN - 2; s <= mN; ++s) {
      final int m = s < mN ? 0 : 1;
      for (int p = m; p < mN; ++p) {
        for (int q = m; q < mN; ++q) {
          final int r = s - p - q;
          if (r >= m) {
            best = Math.max(best, cnt(p, q, r));
          }
        }
      }
    }
    return Z.valueOf(best);
  }
}
