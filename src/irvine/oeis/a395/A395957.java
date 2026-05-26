package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395957 T(n,k) is a triangular array of the number of king's move self-avoiding walks of any length on an n X k grid.
 * @author Sean A. Irvine
 */
public class A395957 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private static final class Board {

    private static final int[] DELTA_ROW = {-1, -1, -1, 0, 0, 1,  1, 1};
    private static final int[] DELTA_COL = {-1, 0, 1, -1, 1, -1, 0, 1 };

    private final int mRows;
    private final int mCols;
    private final int mCells;

    Board(final int rows, final int cols) {
      mRows = rows;
      mCols = cols;
      mCells = rows * cols;
      if (mCols >= Long.SIZE) {
        throw new UnsupportedOperationException();
      }
    }

    private static long bit(final int cell) {
      return 1L << cell;
    }

    private static int cell(final int r, final int c, final int cols) {
      return r * cols + c;
    }

    private void search(final long used, final int r, final int c, final int len, final long add, final long[] counts) {
      counts[len] += add;
      for (int k = 0; k < DELTA_ROW.length; ++k) {
        final int nr = r + DELTA_ROW[k];
        final int nc = c + DELTA_COL[k];
        if (nr < 0 || nr >= mRows || nc < 0 || nc >= mCols) {
          continue;
        }
        final int next = cell(nr, nc, mCols);
        final long b = bit(next);
        if ((used & b) == 0) {
          search(used | b, nr, nc, len + 1, add, counts);
        }
      }
    }

    private long[] compute() {
      // Use symmetry to consider only one quadrant of starting points
      final long[] counts = new long[mCells + 1];
      for (int r = 0; 2 * r < mRows; ++r) {
        final long mr = (mRows & 1) == 0 || 2 * r != mRows - 1 ? 2 : 1;
        for (int c = 0; 2 * c < mCols; ++c) {
          final long m = mr * ((mCols & 1) == 0 || 2 * c != mCols - 1 ? 2 : 1);
          search(bit(cell(r, c, mCols)), r, c, 1, m, counts);
        }
      }
      return counts;
    }

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Board g = new Board(mN, mM);
    return Functions.SUM.z(g.compute());
  }
}
