package irvine.oeis.a397;

import irvine.oeis.gf.GfSequence;

/**
 * A397625 Coordination sequence of the bcs net.
 * @author Sean A. Irvine
 */
public class A397625 extends GfSequence {

  /** Construct the sequence. */
  public A397625() {
    super(0, "(x + 1)*(2*x^4 - 6*x^3 + 7*x^2 + 2*x + 1)/(1 - x)^3");
  }
}
