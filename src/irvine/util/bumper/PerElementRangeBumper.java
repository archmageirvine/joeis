package irvine.util.bumper;

/**
 * Range bumper with individual limit on each element.
 * @author Sean A. Irvine
 */
public class PerElementRangeBumper implements Bumper {

  private final int[] mLimits;

  PerElementRangeBumper(final int[] limits) {
    mLimits = limits;
  }

  @Override
  public boolean bump(final int... a) {
    if (mLimits.length != a.length) {
      throw new IllegalArgumentException("Array length does not match limits length");
    }
    for (int k = a.length - 1; k >= 0; --k) {
      if (++a[k] <= mLimits[k]) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = a[k];
        }
        return true;
      }
      a[k] = 0;
    }
    return false;
  }
}
