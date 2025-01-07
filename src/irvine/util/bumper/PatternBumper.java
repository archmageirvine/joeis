package irvine.util.bumper;

/**
 * Pattern bumper.
 * Weakly increasing, maximum difference 1.
 * For example, with three elements.
 * <pre>
 *   000
 *   001
 *   011
 *   012
 * </pre>
 * @author Sean A. Irvine
 */
public class PatternBumper implements Bumper {

  @Override
  public boolean bump(final int... a) {
    for (int k = a.length - 1; k > 0; --k) {
      if (a[k] == a[k - 1]) {
        ++a[k];
        return true;
      }
    }
    return false;
  }
}
