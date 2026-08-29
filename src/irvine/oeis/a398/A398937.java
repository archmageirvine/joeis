package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A398937 Nonnegative integers k satisfying cos(k) &lt; cos(k+1) &lt; cos(k+2) &lt; cos(k+3) &lt; cos(k+4) &gt; cos(k+5).
 * @author Sean A. Irvine
 */
public class A398937 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398937() {
    super(1, 1, k -> {
      final CR k1 = CR.valueOf(k + 1).cos();
      if (CR.valueOf(k).cos().compareTo(k1) < 0) {
        final CR k2 = CR.valueOf(k + 2).cos();
        if (k1.compareTo(k2) < 0) {
          final CR k3 = CR.valueOf(k + 3).cos();
          if (k2.compareTo(k3) < 0) {
            final CR k4 = CR.valueOf(k + 4).cos();
            if (k3.compareTo(k4) < 0) {
              return k4.compareTo(CR.valueOf(k + 5).cos()) > 0;
            }
          }
        }
      }
      return false;
    });
  }
}
