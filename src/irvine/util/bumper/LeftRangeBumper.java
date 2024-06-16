package irvine.util.bumper;

/**
 * Range bumper.
 * <code>ai0 &gt;= a1 &gt;= a2 &gt; = ...</code>
 * For example, with three elements, minimum of 0, maximum of 2:
 * <pre>
 *   000
 *   100
 *   200
 *   010
 *   110
 *   210
 *   020
 *   120
 *   220
 *   001
 *   ...
 * </pre>
 * @author Sean A. Irvine
 */
public class LeftRangeBumper implements Bumper {

  private final int mMin;
  private final int mMax;

  LeftRangeBumper(final int min, final int max) {
    mMin = min;
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = 0; k < a.length; ++k) {
      if (++a[k] <= mMax) {
        return true;
      }
      a[k] = mMin;
    }
    return false;
  }
}
