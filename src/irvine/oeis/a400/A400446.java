package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400446 Number of 0-cells captured, Othello-style in all 8 directions, when the binary expansion of n is written in row n, right-justified beneath rows 1..n-1.
 * @author Sean A. Irvine
 */
public class A400446 extends Sequence1 {

  // After Dimas Saputra

  private long mN = 0;

  // Rows are represented by their integer values.
  private final ArrayList<Long> mRows = new ArrayList<>();

  private static final int[] DELTA_Y = {-1, -1, -1, 0, 0, 1, 1, 1};
  private static final int[] DELTA_X = {-1, 0, 1, -1, 1, -1, 0, 1};

  /*
   * Return the bit in row r at column c, where columns are numbered
   * 1..width and the binary representation is right-aligned.
   * @return -1 for E, otherwise 0 or 1
   */
  private static int cell(final long row, final int c, final int width) {
    final int bits = 64 - Long.numberOfLeadingZeros(row);
    final int first = width - bits + 1;
    if (c < first) {
      return -1; // E
    }
    final int bit = width - c;
    return (int) ((row >>> bit) & 1L);
  }

  @Override
  public Z next() {
    ++mN;
    final int width = 64 - Long.numberOfLeadingZeros(mN);
    // Row numbers are indexed by their actual row number, so add a
    // dummy element at index 0 on the first call.
    if (mRows.isEmpty()) {
      mRows.add(0L);
    }
    mRows.add(mN);
    final Set<Long> captured = new HashSet<>();
    // Examine every 1 in the new row.
    for (int c = 1; c <= width; ++c) {
      if (cell(mN, c, width) != 1) {
        continue;
      }
      for (int d = 0; d < DELTA_Y.length; ++d) {
        int r = (int) mN + DELTA_Y[d];
        int cc = c + DELTA_X[d];
        final ArrayList<Long> run = new ArrayList<>();
        while (r >= 1 && r <= mN && cc >= 1 && cc <= width) {
          final int x = cell(mRows.get(r), cc, width);
          if (x == 0) {
            run.add((((long) r) << 32) | (cc & 0xffffffffL));
            r += DELTA_Y[d];
            cc += DELTA_X[d];
          } else if (x == 1) {
            captured.addAll(run);
            break;
          } else {
            // E
            break;
          }
        }
      }
    }
    return Z.valueOf(captured.size());
  }
}
