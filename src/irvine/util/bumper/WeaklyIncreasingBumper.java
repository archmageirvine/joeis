package irvine.util.bumper;

/**
 * Weakly increasing bumper.
 * @author Sean A. Irvine
 */
public class WeaklyIncreasingBumper implements Bumper {

  private final int mMax;

  WeaklyIncreasingBumper(final int max) {
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1, i = 0; k >= 0; --k, ++i) {
      if (++a[k] <= mMax) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = a[j - 1];
        }
        return true;
      }
    }
    return false;
  }
}
