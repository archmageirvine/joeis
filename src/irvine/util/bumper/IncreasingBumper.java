package irvine.util.bumper;

/**
 * Increasing bumper.
 * @author Sean A. Irvine
 */
public class IncreasingBumper implements Bumper {

  private final int mMax;

  IncreasingBumper(final int max) {
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1, i = 0; k >= 0; --k, ++i) {
      if (++a[k] + i < mMax) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = a[j - 1] + 1;
        }
        return true;
      }
    }
    return false;
  }
}
