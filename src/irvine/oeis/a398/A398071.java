package irvine.oeis.a398;

import irvine.oeis.gf.EgfSequence;

/**
 * A398071 allocated for Andrew Howroyd.
 * @author Sean A. Irvine
 */
public class A398071 extends EgfSequence {

  /** Construct the sequence. */
  public A398071() {
    super(0, "exp((1/2)*(x + (1/2)*x^2 + 4*x/(1 - x) - log(1 - x)))");
  }
}
