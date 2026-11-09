package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401614 The minimal total height of an n-building skyline such that each building of height h sees exactly h other buildings in total to its left and right.
 * @author Sean A. Irvine
 */
public class A401614 extends Sequence0 {

  // After Dmytro Inosov

  private int mN = -1;

  /**
   * Test whether a skyline exists for the given n and b.
   * @param n number of columns
   * @param b perimeter bound
   * @return true if a skyline exists
   */
  private static boolean skylineExists(final int n, final int b) {
    final int[] h = new int[n + 1];
    final int[][] d = new int[n + 2][n + 1];
    final int[][] p = new int[n + 2][n + 1];
    final int[][] q = new int[n + 2][n + 1];
    final int[] s = new int[n + 2];
    final int[] u = new int[n + 1];

    for (int i = 1; i <= n; ++i) {
      u[i] = n - 1;
    }

    int j = 1;
    int ans = 0;

    while (j > 0 && ans == 0) {
      ++h[j];

      if (h[j] > u[j]) {
        --j;
      } else {
        int c = 0;
        boolean ok = true;
        final int r = n - j;

        for (int i = 1; i < j && ok; ++i) {
          d[j + 1][i] = d[j][i];
          p[j + 1][i] = p[j][i];
          q[j + 1][i] = q[j][i];

          if (q[j][i] == 0 || (h[j] - h[i]) * q[j][i] >= (j - i) * p[j][i]) {
            ++d[j + 1][i];
            ++c;
            p[j + 1][i] = h[j] - h[i];
            q[j + 1][i] = j - i;
          }

          if (d[j + 1][i] > h[i] || d[j + 1][i] + r < h[i]) {
            ok = false;
          }
        }

        if (c + (r > 0 ? 1 : 0) > h[j] || c + r < h[j]) {
          ok = false;
        }

        if (ok) {
          s[j + 1] = s[j] + h[j];
          if (j == n) {
            ans = 1;
          } else {
            d[j + 1][j] = c;
            p[j + 1][j] = 0;
            q[j + 1][j] = 0;
            int t = 0;
            for (int i = 1; i <= j; ++i) {
              t += h[i] - d[j + 1][i];
            }
            if (s[j + 1] + t + 2 * (r - 1) <= b) {
              u[j + 1] = Math.min(n - 1, b - s[j + 1] - (r > 1 ? 2 * r - 3 : 0));
              for (int i = 1; i <= j; ++i) {
                if (d[j + 1][i] == h[i]) {
                  u[j + 1] = Math.min(u[j + 1], h[i] + (p[j + 1][i] * (j + 1 - i) - 1) / q[j + 1][i]);
                }
              }
              ++j;
              h[j] = (j == n ? Math.max(1, h[1]) : 2) - 1;
            }
          }
        }
      }
    }
    return ans != 0;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }

    int b = 2 * mN - 2;
    while (!skylineExists(mN, b)) {
      b += 2;
    }
    return Z.valueOf(b);
  }
}
