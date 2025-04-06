package irvine.util.bumper;

import java.util.Arrays;

/**
 * Weakly increasing number bumper.
 * Useful to step through integers with weakly increasing digits, but without leading 0's
 * For example, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 111, 112, ..., 200, 202, ...
 * @author Sean A. Irvine
 */
public class WeaklyIncreasingNumberBumper implements Bumper {

  private final int mMax;

  WeaklyIncreasingNumberBumper(final int max) {
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1, i = 0; k >= 1; --k, ++i) {
      if (++a[k] <= mMax) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = Math.max(a[0], a[j - 1]);
        }
        return true;
      }
    }
    if (++a[0] <= mMax) {
      Arrays.fill(a, 1, a.length, 0);
      return true;
    }
    return false;
  }
}
