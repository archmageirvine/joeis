package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402392 Triangle read by rows: T(n,k) is the number of positive integers that reach 1 in exactly n steps of the '3x+1' problem, k of them being tripling steps.
 * @author Sean A. Irvine
 */
public class A402392 extends Sequence0 {

  // Current row, represented by pairs (m, k).
  private Z[] mM = {Z.ONE};
  private int[] mK = {0};
  private int mSize = 1;

  // Histogram of the current row.
  private long[] mCounts = null;
  private int mIndex = 0;

  @Override
  public Z next() {
    if (mCounts == null || mIndex >= mCounts.length) {
      makeCounts();
    }
    final Z result = Z.valueOf(mCounts[mIndex++]);
    if (mIndex >= mCounts.length) {
      makeNextRow();
      mCounts = null;
    }
    return result;
  }

  /**
   * Compute the histogram of k-values in the current row.
   */
  private void makeCounts() {
    int maxK = 0;
    for (int i = 0; i < mSize; ++i) {
      maxK = Math.max(maxK, mK[i]);
    }
    mCounts = new long[maxK + 1];
    for (int i = 0; i < mSize; ++i) {
      ++mCounts[mK[i]];
    }
    mIndex = 0;
  }

  /**
   * Generate the next row.
   */
  private void makeNextRow() {
    // First count the required array size.
    int nextSize = mSize;
    for (int i = 0; i < mSize; ++i) {
      if (mM[i].mod(6) == 4 && mM[i].compareTo(Z.FOUR) > 0) {
        ++nextSize;
      }
    }
    final Z[] nextM = new Z[nextSize];
    final int[] nextK = new int[nextSize];
    int pos = 0;
    for (int i = 0; i < mSize; ++i) {
      nextM[pos] = mM[i].multiply2();
      nextK[pos++] = mK[i];
      if (mM[i].mod(6) == 4 && mM[i].compareTo(Z.FOUR) > 0) {
        nextM[pos] = mM[i].subtract(1).divide(3);
        nextK[pos++] = mK[i] + 1;
      }
    }
    mM = nextM;
    mK = nextK;
    mSize = nextSize;
  }
}
