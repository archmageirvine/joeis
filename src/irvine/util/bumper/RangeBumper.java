package irvine.util.bumper;

/**
 * Range bumper.
 * <code>ai0 &gt;= a1 &gt;= a2 &gt; = ...</code>
 * For example, with three elements, minimum of 0, maximum of 2:
 * <pre>
 *   000
 *   001
 *   002
 *   010
 *   011
 *   012
 *   020
 *   021
 *   022
 *   100
 *   ...
 * </pre>
 * @author Sean A. Irvine
 */
public class RangeBumper implements Bumper {

  private final int mMin;
  private final int mMax;

  RangeBumper(final int min, final int max) {
    mMin = min;
    mMax = max;
  }

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1; k >= 0; --k) {
      if (++a[k] <= mMax) {
        return true;
      }
      a[k] = mMin;
    }
    return false;
  }
}
