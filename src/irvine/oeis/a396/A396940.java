package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396940 Lexicographically earliest Latin squares of increasing order, read by rows.
 * @author Sean A. Irvine
 */
public class A396940 extends Sequence1 {

  // After Matou&scaron; Moravec

  private int mN = 0;
  private int[][] mGrid = null;
  private int mRow = 0;
  private int mCol = 0;

  private boolean search(final int[] row, final boolean[] usedInRow, final boolean[][] colUsed, final int n, final int j) {
    if (j == n) {
      return true;
    }
    for (int v = 0; v < n; ++v) {
      if (!usedInRow[v] && !colUsed[j][v]) {
        row[j] = v;
        usedInRow[v] = true;
        if (search(row, usedInRow, colUsed, n, j + 1)) {
          return true;
        }
        usedInRow[v] = false;
      }
    }
    return false;
  }

  private int[][] build(final int n) {
    final boolean[][] colUsed = new boolean[n][n];
    final int[][] grid = new int[n][n];
    for (int r = 0; r < n; ++r) {
      final int[] row = new int[n];
      final boolean[] usedInRow = new boolean[n];
      if (!search(row, usedInRow, colUsed, n, 0)) {
        throw new RuntimeException("No row found");
      }
      grid[r] = row;
      for (int c = 0; c < n; ++c) {
        colUsed[c][row[c]] = true;
      }
    }
    return grid;
  }

  @Override
  public Z next() {
    if (mGrid == null || mRow >= mGrid.length) {
      mGrid = build(++mN);
      mRow = 0;
      mCol = 0;
    }
    final Z t = Z.valueOf(mGrid[mRow][mCol]);
    if (++mCol >= mGrid.length) {
      mCol = 0;
      ++mRow;
    }
    return t;
  }
}
