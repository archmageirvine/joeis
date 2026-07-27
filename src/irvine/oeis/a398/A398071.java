package irvine.oeis.a398;

import irvine.oeis.gf.EgfSequence;

/**
 * A398071 Number of n X n symmetric nonnegative integer matrices with each row sum at most 2.
 * @author Sean A. Irvine
 */
public class A398071 extends EgfSequence {

  /** Construct the sequence. */
  public A398071() {
    super(0, "exp((1/2)*(x + (1/2)*x^2 + 4*x/(1 - x) - log(1 - x)))");
  }
}
