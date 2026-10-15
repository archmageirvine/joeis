package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400891 Numbers k such that the 2-adic valuation of 3*k+2 is even.
 * @author Sean A. Irvine
 */
public class A400891 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400891() {
    super(1, 0, k -> (Functions.VALUATION.l(3 * k + 2, 2) & 1) == 0);
  }
}
