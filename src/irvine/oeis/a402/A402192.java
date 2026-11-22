package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402192
 * @author Sean A. Irvine
 */
public class A402192 extends Sequence1 {

  private int mN;
  private int mCells;
  private int[][] mMembers;
  private int[] mCapacity;
  private int[] mCount;

  /**
   * Count valid selections.
   *
   * @param start first cell eligible for selection
   * @param left number of cells still to select
   * @return number of valid completions
   */
  private Z search(final int start, final int left) {
    if (left == 0) {
      return Z.ONE;
    }
    if (mCells - start < left) {
      return Z.ZERO;
    }
    Z total = Z.ZERO;
    // Choose the next selected cell.
    for (int t = start; t <= mCells - left; ++t) {
      final int[] members = mMembers[t];
      boolean valid = true;
      for (final int s : members) {
        if (mCount[s] >= mCapacity[s]) {
          valid = false;
          break;
        }
      }
      if (valid) {
        for (final int s : members) {
          ++mCount[s];
        }
        total = total.add(search(t + 1, left - 1));
        for (final int s : members) {
          --mCount[s];
        }
      }
    }
    return total;
  }

  @Override
  public Z next() {
    ++mN;
    // Cells (i,j), where 0 <= j <= i < n.
    mCells = mN * (mN + 1) / 2;
    // Proper subtriangles (k,i,j), with 1 <= k < n.
    int subCount = 0;
    for (int k = 1; k < mN; ++k) {
      subCount += (mN - k + 1) * (mN - k + 2) / 2;
    }
    mCapacity = new int[subCount];
    int s = 0;
    for (int k = 1; k < mN; ++k) {
      for (int i = 0; i <= mN - k; ++i) {
        for (int j = 0; j <= i; ++j) {
          mCapacity[s++] = k;
        }
      }
    }
    mMembers = new int[mCells][];
    int t = 0;
    for (int x = 0; x < mN; ++x) {
      for (int y = 0; y <= x; ++y) {
        // Subtriangles containing cell (x,y)
        final int[] tmp = new int[subCount];
        int size = 0;
        s = 0;
        for (int k = 1; k < mN; ++k) {
          for (int i = 0; i <= mN - k; ++i) {
            for (int j = 0; j <= i; ++j) {
              if (0 <= y - j && y - j <= x - i && x - i < k) {
                tmp[size++] = s;
              }
              ++s;
            }
          }
        }
        mMembers[t++] = new int[size];
        System.arraycopy(tmp, 0, mMembers[t - 1], 0, size);
      }
    }
    mCount = new int[subCount];
    return search(0, mN);
  }
}
