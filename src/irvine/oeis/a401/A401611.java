package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401611 Number of distinct (up to reflection) n-building skylines of minimal total height such that each building of height h sees exactly h other buildings in total to its left and right.
 * @author Sean A. Irvine
 */
public class A401611 extends Sequence0 {

  // After Dmytro Inosov

  private int mN = -1;

  /**
   * Count skylines of size n with the given bound.
   * @param n size
   * @param b bound
   * @return number of skylines
   */
  private Z skylineCount(final int n, final int b) {
    final int[] h = new int[n];
    final int[][] d = new int[n + 1][n];
    final int[][] p = new int[n + 1][n];
    final int[][] q = new int[n + 1][n];
    final int[] s = new int[n + 1];
    final int[] u = new int[n];
    for (int i = 0; i < n; ++i) {
      u[i] = n - 1;
    }
    int j = 1;
    Z res = Z.ZERO;
    while (j > 0) {
      ++h[j - 1];
      if (h[j - 1] > u[j - 1]) {
        --j;
      } else {
        int c = 0;
        int ok = 1;
        final int r = n - j;

        for (int i = 1; i < j && ok == 1; ++i) {
          d[j][i - 1] = d[j - 1][i - 1];
          p[j][i - 1] = p[j - 1][i - 1];
          q[j][i - 1] = q[j - 1][i - 1];
          if (q[j - 1][i - 1] == 0 || (h[j - 1] - h[i - 1]) * q[j - 1][i - 1] >= (j - i) * p[j - 1][i - 1]) {
            ++d[j][i - 1];
            ++c;
            p[j][i - 1] = h[j - 1] - h[i - 1];
            q[j][i - 1] = j - i;
          }
          if (d[j][i - 1] > h[i - 1] || d[j][i - 1] + r < h[i - 1]) {
            ok = 0;
          }
        }

        if (c + (r > 0 ? 1 : 0) > h[j - 1] || c + r < h[j - 1]) {
          ok = 0;
        }

        if (ok == 1) {
          s[j] = s[j - 1] + h[j - 1];
          if (j == n) {
            int i = 0;
            while (i < n - 1 && h[i] == h[n - 1 - i]) {
              ++i;
            }
            if (h[i] <= h[n - 1 - i]) {
              res = res.add(Z.ONE);
            }
          } else {
            d[j][j - 1] = c;
            p[j][j - 1] = 0;
            q[j][j - 1] = 0;
            int t = 0;
            for (int i = 1; i <= j; ++i) {
              t += h[i - 1] - d[j][i - 1];
            }
            if (s[j] + t + 2 * (r - 1) <= b) {
              u[j] = Math.min(n - 1, b - s[j] - (r > 1 ? 2 * r - 3 : 0));
              for (int i = 1; i <= j; ++i) {
                if (d[j][i - 1] == h[i - 1]
                  && q[j][i - 1] != 0) {
                  final int bound = h[i - 1] + (p[j][i - 1] * (j + 1 - i) - 1) / q[j][i - 1];
                  u[j] = Math.min(u[j], bound);
                }
              }
              ++j;
              h[j - 1] = (j == n ? Math.max(1, h[0]) : 2) - 1;
            }
          }
        }
      }
    }

    return res;
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    int b = 2 * mN - 2;
    Z c = Z.ZERO;
    while (c.isZero()) {
      c = skylineCount(mN, b);
      if (c.isZero()) {
        b += 2;
      }
    }
    return c;
  }
}
