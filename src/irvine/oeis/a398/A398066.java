package irvine.oeis.a398;

import irvine.oeis.gf.EgfSequence;

/**
 * A398066 allocated for Andrew Howroyd.
 * @author Sean A. Irvine
 */
public class A398066 extends EgfSequence {

  /** Construct the sequence. */
  public A398066() {
    super(0, "exp((2*x/(1 - x)) + (((-x) + (1/2)*x^2) -log(1 - x))/2))");
  }
}
