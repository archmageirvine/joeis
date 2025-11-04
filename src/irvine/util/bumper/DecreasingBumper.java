package irvine.util.bumper;

/**
 * Decreasing bumper.
 * @author Sean A. Irvine
 */
public class DecreasingBumper implements Bumper {

  private final int mMin;

  DecreasingBumper(final int min) {
    mMin = min;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1, i = 0; k >= 0; --k, ++i) {
      if (--a[k] - i >= mMin) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = a[j - 1] - 1;
        }
        return true;
      }
    }
    return false;
  }
}
