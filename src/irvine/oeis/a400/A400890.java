package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400890 allocated for Wolfdieter Lang.
 * @author Sean A. Irvine
 */
public class A400890 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400890() {
    super(1, 0, k -> (Functions.VALUATION.l(3 * k + 2, 2) & 1) == 1);
  }
}
