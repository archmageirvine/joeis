package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400703 Numbers k whose trajectory under repeated application of the map x -&gt; sigma(x) - x is not strictly decreasing.
 * @author Sean A. Irvine
 */
public class A400703 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400703() {
    super(1, k -> {
      while (true) {
        if (k == 1) {
          return false;
        }
        final long j = Functions.ALIQUOT.l(k);
        if (j >= k) {
          return true;
        }
        k = j;
      }
    });
  }
}

