package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A402160 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402160 extends Sequence3 {

  // After Alper Ferudun

  private int mN = 2;

  // A diagonal is represented by its two endpoints.
  private int[][] mDiagonals;
  private final List<int[]> mTriangulations = new ArrayList<>();
  private int mTarget;
  private int[] mChosen;
  private long mCount;

  /**
   * Test whether two diagonals cross.
   * @param a first endpoint of first diagonal
   * @param b second endpoint of first diagonal
   * @param c first endpoint of second diagonal
   * @param d second endpoint of second diagonal
   * @return true if they cross
   */
  private boolean crosses(final int a, final int b, final int c, final int d) {
    return a < c && c < b && b < d || c < a && a < d && d < b;
  }

  /**
   * Generate all triangulations.
   * @param start next diagonal index to consider
   * @param depth number of diagonals currently selected
   */
  private void generate(final int start, final int depth) {
    if (depth == mTarget) {
      final int[] adj = new int[mN];
      // Polygon boundary.
      for (int i = 0; i < mN - 1; ++i) {
        adj[i] |= 1 << (i + 1);
        adj[i + 1] |= 1 << i;
      }
      adj[0] |= 1 << (mN - 1);
      adj[mN - 1] |= 1;
      // Selected diagonals.
      for (int i = 0; i < mTarget; ++i) {
        final int a = mDiagonals[mChosen[i]][0];
        final int b = mDiagonals[mChosen[i]][1];
        adj[a] |= 1 << b;
        adj[b] |= 1 << a;
      }
      mTriangulations.add(adj);
      return;
    }

    for (int i = start; i <= mDiagonals.length - (mTarget - depth); ++i) {
      final int a = mDiagonals[i][0];
      final int b = mDiagonals[i][1];
      boolean ok = true;
      for (int j = 0; j < depth; ++j) {
        final int c = mDiagonals[mChosen[j]][0];
        final int d = mDiagonals[mChosen[j]][1];
        if (crosses(a, b, c, d)) {
          ok = false;
          break;
        }
      }

      if (ok) {
        mChosen[depth] = i;
        generate(i + 1, depth + 1);
      }
    }
  }

  /**
   * Test 4-colorability using backtracking.
   * @param adj adjacency masks
   * @param colors assigned colors
   * @param v next vertex
   * @param used number of colors used so far
   * @return true if colorable
   */
  private boolean colorable(final int[] adj, final int[] colors, final int v, final int used) {
    if (v == mN) {
      return true;
    }
    final boolean[] forbidden = new boolean[4];
    for (int u = 0; u < v; ++u) {
      if ((adj[v] & (1 << u)) != 0) {
        forbidden[colors[u]] = true;
      }
    }
    for (int c = 0; c < Math.min(4, used + 1); ++c) {
      if (!forbidden[c]) {
        colors[v] = c;
        if (colorable(adj, colors, v + 1, Math.max(used, c + 1))) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Test whether a graph is 4-colorable.
   * @param adj adjacency masks
   * @return true if colorable
   */
  private boolean fourColorable(final int[] adj) {
    return colorable(adj, new int[mN], 0, 0);
  }

  /**
   * Count triples whose union is not 4-colorable.
   */
  private void countTriples() {
    mCount = 0;
    final int t = mTriangulations.size();
    for (int i = 0; i < t - 2; ++i) {
      final int[] a = mTriangulations.get(i);
      for (int j = i + 1; j < t - 1; ++j) {
        final int[] b = mTriangulations.get(j);
        for (int k = j + 1; k < t; ++k) {
          final int[] c = mTriangulations.get(k);
          final int[] adj = new int[mN];
          for (int v = 0; v < mN; ++v) {
            adj[v] = a[v] | b[v] | c[v];
          }
          if (!fourColorable(adj)) {
            ++mCount;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.ZERO;
    }
    mTriangulations.clear();
    // All diagonals of the polygon.
    final List<int[]> diagonals = new ArrayList<>();
    for (int i = 0; i < mN; ++i) {
      for (int j = i + 1; j < mN; ++j) {
        if (j != i + 1 && !(i == 0 && j == mN - 1)) {
          diagonals.add(new int[] {i, j});
        }
      }
    }
    mDiagonals = diagonals.toArray(new int[0][]);
    mTarget = mN - 3;
    mChosen = new int[mTarget];
    generate(0, 0);
    countTriples();
    return Z.valueOf(mCount);
  }
}
