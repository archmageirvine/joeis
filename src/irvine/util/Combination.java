package irvine.util;

import irvine.math.IntegerUtils;

/**
 * Iterator over k-subsets of {0,...,n-1}.
 * @author Sean A. Irvine
 */
public class Combination {

  private final int mN;
  private final int mK;
  private final int[] mC;
  private boolean mHasNext = true;

  /**
   * Generate combinations of 0,...,n-1.
   * @param n total number of elements
   * @param k number of elements to select.
   */
  public Combination(final int n, final int k) {
    if (k < 0 || k > n) {
      throw new IllegalArgumentException();
    }
    mN = n;
    mK = k;
    mC = IntegerUtils.identity(new int[k]);
  }

  /**
   * Return the next combination or null if there are no more.
   * @return next combination, or null when exhausted.
   */
  public int[] next() {
    if (!mHasNext) {
      return null;
    }

    // Advance to next combination.
    int i = mK - 1;
    while (i >= 0 && mC[i] == mN - mK + i) {
      --i;
    }
    if (i < 0) {
      mHasNext = false;
    } else {
      ++mC[i];
      for (int j = i + 1; j < mK; ++j) {
        mC[j] = mC[j - 1] + 1;
      }
    }
    return mC;
  }
}
