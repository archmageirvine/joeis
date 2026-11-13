package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398777 Number of ways to tile an n X n board having a black border with the 1 X 1 tiles bbbb, bbww, wbbw, bwwb, wwbb (colors read clockwise around each tile), up to rotations and reflections of the board.
 * @author Sean A. Irvine
 */
public class A398777 extends Sequence1 {

  private int mN = 0;
  private int[] mRows;
  private int[] mBoard;
  private final Set<String> mSeen = new HashSet<>();
  private Z mCount;

  /**
   * Rotate a matrix 90 degrees clockwise.
   * @param g matrix encoded as a string
   * @param n matrix dimension
   * @return rotated matrix
   */
  private String rotate(final String g, final int n) {
    final char[] t = new char[n * n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        t[i * n + j] = g.charAt((n - 1 - j) * n + i);
      }
    }
    return new String(t);
  }

  /**
   * Reflect a matrix horizontally.
   * @param g matrix encoded as a string
   * @param n matrix dimension
   * @return reflected matrix
   */
  private String reflect(final String g, final int n) {
    final char[] t = new char[n * n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        t[i * n + j] = g.charAt(i * n + n - 1 - j);
      }
    }
    return new String(t);
  }

  /**
   * Encode a board and find its canonical representative
   * under rotations and reflections.
   * @return canonical representative
   */
  private String canonical() {
    final StringBuilder sb = new StringBuilder(mN * mN);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        sb.append((mBoard[i] >>> j) & 1);
      }
    }

    String g = sb.toString();
    String best = g;

    for (int k = 0; k < 4; ++k) {
      if (g.compareTo(best) < 0) {
        best = g;
      }
      final String h = reflect(g, mN);
      if (h.compareTo(best) < 0) {
        best = h;
      }
      g = rotate(g, mN);
    }
    return best;
  }

  /**
   * Generate all valid boards.
   * @param depth current row
   * @param s columns with odd vertical runs
   */
  private void search(final int depth, final int s) {
    if (depth == mN) {
      if (s == 0 && mSeen.add(canonical())) {
        mCount = mCount.add(1);
      }
      return;
    }

    for (final int r : mRows) {
      if ((r & s) == s) {
        mBoard[depth] = r;
        search(depth + 1, r ^ s);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;

    // Generate all possible horizontal domino configurations.
    final List<Integer> rows = new ArrayList<>();
    final int limit = 1 << (mN - 1);
    for (int x = 0; x < limit; ++x) {
      if ((x & (x << 1)) == 0) {
        rows.add(x | (x << 1));
      }
    }

    mRows = new int[rows.size()];
    for (int k = 0; k < rows.size(); ++k) {
      mRows[k] = rows.get(k);
    }

    mBoard = new int[mN];
    mSeen.clear();
    mCount = Z.ZERO;

    search(0, 0);

    return mCount;
  }
}
