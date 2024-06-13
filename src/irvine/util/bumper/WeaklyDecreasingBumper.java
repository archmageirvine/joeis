package irvine.util.bumper;

import java.util.Arrays;

/**
 * Weakly decreasing bumper.
 * <code>a0 &gt;= a1 &gt;= a2 &gt; = ...</code>
 * For example, with three elements, minimum of 0:
 * <pre>
 *   000
 *   100
 *   110
 *   111
 *   200
 *   201
 *   210
 *   211
 *   220
 *   221
 *   222
 *   ...
 * </pre>
 * @author Sean A. Irvine
 */
public class WeaklyDecreasingBumper implements Bumper {

  private final int mMin;
  private final int mMax;

  WeaklyDecreasingBumper(final int min, final int max) {
    mMin = min;
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1; k > 0; --k) {
      if (++a[k] <= a[k - 1]) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = mMin;
        }
        return true;
      }
    }
    if (++a[0] > mMax) {
      return false;
    }
    Arrays.fill(a, 1, a.length, mMin);
    return true;
  }
}
