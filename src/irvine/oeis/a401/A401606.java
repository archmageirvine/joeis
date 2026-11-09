package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401606 Number of n-building skylines where each building has the least height h from which it sees exactly h other buildings in total to its left and right.
 * @author Sean A. Irvine
 */
public class A401606 extends Sequence0 {

  // After Dmytro Inosov

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final long[] v = new long[mN];
    int j = 1;
    Z res = Z.ZERO;
    while (j > 0) {
      ++v[j - 1];
      if (v[j - 1] >= mN) {
        v[j - 1] = 0;
        --j;
      } else {
        int ok = 1;
        int i = 1;
        while (i <= j && ok == 1) {
          final long g = v[i - 1];
          long h = g;
          int c = 0;
          while (h >= Math.max(1, g - c) && ok == 1) {
            final long need = h == g ? g + 1 : h - g + c + 1;
            int s = 0;
            for (int d = -1; d <= 1 && s < need; d += 2) {
              long dx0 = 0;
              long dy0 = 0;
              int k = 1;
              while (i + d * k >= 1 && i + d * k <= j && s < need) {
                final long dy = v[i + d * k - 1] - h;
                if (dx0 * dy >= dy0 * k) {
                  ++s;
                  dx0 = k;
                  dy0 = dy;
                }
                ++k;
              }
            }
            if (h == g) {
              c = s;
              if (c > g || c + mN - j < g || (i == j && j < mN && c == g)) {
                ok = 0;
              }
            } else if (s < need) {
              ok = 0;
            }
            --h;
          }
          ++i;
        }
        if (ok == 1) {
          if (j == mN) {
            res = res.add(Z.ONE);
          } else {
            ++j;
            v[j - 1] = j < mN ? 1 : 0;
          }
        }
      }
    }
    return res;
  }
}
