package irvine.oeis.a402;

import irvine.oeis.gf.GfSequence;

/**
 * A401839.
 * @author Sean A. Irvine
 */
public class A402063 extends GfSequence {

  /** Construct the sequence. */
  public A402063() {
    super(0, "((sqrt(1 - 14*x^3 + 161*x^6)) - 7*x^3 + 14*x^2 - 1)/(14*x^2*(1-2x-x^2))");
  }
}

