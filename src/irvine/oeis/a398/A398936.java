package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A398936 Nonnegative integers k satisfying sin(k) &gt; sin(k+1) &gt; sin(k+2) &gt; sin(k+3) &gt; sin(k+4) &lt; sin(k+5).
 * @author Sean A. Irvine
 */
public class A398936 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398936() {
    super(1, k -> {
      final CR sin0 = CR.valueOf(k).sin();
      final CR sin1 = CR.valueOf(k + 1).sin();
      if (sin0.compareTo(sin1) > 0) {
        final CR sin2 = CR.valueOf(k + 2).sin();
        if (sin1.compareTo(sin2) > 0) {
          final CR sin3 = CR.valueOf(k + 3).sin();
          if (sin2.compareTo(sin3) > 0) {
            final CR sin4 = CR.valueOf(k + 4).sin();
            if (sin3.compareTo(sin4) > 0) {
              final CR sin5 = CR.valueOf(k + 5).sin();
              return sin4.compareTo(sin5) < 0;
            }
          }
        }
      }
      return false;
    });
  }
}
