package irvine.oeis.a402;

import irvine.oeis.gf.GfSequence;

/**
 * A401839.
 * @author Sean A. Irvine
 */
public class A402064 extends GfSequence {

  /** Construct the sequence. */
  public A402064() {
    super(0, "(1 - 6*x^2 - x^3 - sqrt(1 - 16*x^2 + 2*x^3 + 64*x^4 - 16*x^5 - 15*x^6))/(2*x^2*(1 - 2x - x^2))");
  }
}

