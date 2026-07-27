package irvine.oeis.a398;

import irvine.oeis.gf.EgfSequence;

/**
 * A398066 Number of n X n symmetric nonnegative integer matrices with each row sum nonzero and at most 2.
 * @author Sean A. Irvine
 */
public class A398066 extends EgfSequence {

  /** Construct the sequence. */
  public A398066() {
    super(0, "exp((2*x/(1 - x)) + (((-x) + (1/2)*x^2) -log(1 - x))/2))");
  }
}
