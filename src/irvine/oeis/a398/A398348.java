package irvine.oeis.a398;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398348 allocated for Carlo Mitchener.
 * @author Sean A. Irvine
 */
public class A398348 extends Sequence1 {

  // After Carlo Mitchener

  private static final int[][] PERMS = {
    {0, 1, 2},
    {0, 2, 1},
    {1, 0, 2},
    {1, 2, 0},
    {2, 0, 1},
    {2, 1, 0}
  };
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int n2 = mN * mN;
    final int n3 = n2 * mN;

    Z total = Z.ZERO;
    final boolean[] seen = new boolean[n3];
    final int[] map = new int[n3];
    for (final int[] p : PERMS) {
      for (int mask = 0; mask < 8; ++mask) {
        final int[] eps = {
          (mask & 1) == 0 ? 1 : -1,
          (mask & 2) == 0 ? 1 : -1,
          (mask & 4) == 0 ? 1 : -1
        };
        for (int s0 = 0; s0 < mN; ++s0) {
          for (int s1 = 0; s1 < mN; ++s1) {
            for (int s2 = 0; s2 < mN; ++s2) {
              // Construct the permutation of the n^3 lattice points.
              int v = 0;
              for (int x0 = 0; x0 < mN; ++x0) {
                for (int x1 = 0; x1 < mN; ++x1) {
                  for (int x2 = 0; x2 < mN; ++x2, ++v) {
                    final int[] x = {x0, x1, x2};
                    final int y0 = (eps[0] * x[p[0]] + s0 + mN) % mN;
                    final int y1 = (eps[1] * x[p[1]] + s1 + mN) % mN;
                    final int y2 = (eps[2] * x[p[2]] + s2 + mN) % mN;
                    map[v] = y0 * n2 + y1 * mN + y2;
                  }
                }
              }
              Arrays.fill(seen, false);
              int cycles = 0;
              for (int k = 0; k < n3; ++k) {
                if (!seen[k]) {
                  ++cycles;
                  int u = k;
                  do {
                    seen[u] = true;
                    u = map[u];
                  } while (!seen[u]);
                }
              }
              total = total.add(Z.ONE.shiftLeft(cycles));
            }
          }
        }
      }
    }
    return total.divide(Z.valueOf(48L * n3));
  }
}
