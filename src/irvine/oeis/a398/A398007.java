package irvine.oeis.a398;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A398007 a(n) is the largest k such that the vertices of a k X k grid can be painted in n colors without having any 3 collinear vertices of the same color.
 * @author Sean A. Irvine
 */
public class A398007 extends Sequence1 {

  // Only good for n <= 4 and even then you might be waiting a while ...

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mK = 2;

  private boolean ok(final int[][] g, final int sx, final int sy) {
    final int c = g[sy][sx];
    for (int y = 0; y <= sy; ++y) {
      final int dy = sy - y;
      if (sy - 2 * dy >= 0) {
        for (int x = 0; x < (y == sy ? sx : g.length); ++x) {
          final int dx = sx - x;
          if (Math.abs(Functions.GCD.i(dx, dy)) == 1) {
            int cnt = 0;
            for (int tx = sx - dx, ty = sy - dy; ty >= 0 && tx >= 0 && tx < g.length; tx -= dx, ty -= dy) {
              if (g[ty][tx] == c && ++cnt >= 2) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }

  private boolean search(final int[][] g, final int colors, final int leastUnused, final int x, final int y) {
    if (y >= g.length) {
      if (mVerbose) {
        StringUtils.message("Accepting: " + g.length + " " + Arrays.deepToString(g));
      }
      return true;
    }
    if (x >= g.length) {
      return search(g, colors, leastUnused, 0, y + 1);
    }
    for (int c = 0; c <= Math.min(leastUnused, colors - 1); ++c) {
      g[y][x] = c;
      if (ok(g, x, y) && search(g, colors, Math.max(leastUnused, c + 1), x + 1, y)) {
        return true;
      }
    }
    return false;
  }

  private boolean isColorable(final int grid, final int colors) {
    if (grid > 2 * colors) {
      return false;
    }
    final int[][] g = new int[grid][grid];
    // WLOG assume g[0][0] = 0
    return search(g, colors, 1, 1, 0);
  }

  @Override
  public Z next() {
    ++mN;
    while (isColorable(mK + 1, mN)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
