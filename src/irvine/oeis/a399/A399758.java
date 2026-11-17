package irvine.oeis.a399;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A399758 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A399758 extends FilterNumberSequence {

  private static boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final String s = String.valueOf(n);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final int j = s.charAt(k) - '0';
      if (cnts[j] > 0) {
        sb.append(cnts[j]).append(j);
        cnts[j] = 0; // so we don't report again
        if (!s.startsWith(sb.toString())) {
          return false;
        }
      }
    }
    return s.equals(sb.toString());
  }

  /** Construct the sequence. */
  public A399758() {
    super(1, A399758::is);
  }
}
