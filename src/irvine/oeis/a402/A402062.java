package irvine.oeis.a402;

import irvine.oeis.gf.GfSequence;

/**
 * A401839.
 * @author Sean A. Irvine
 */
public class A402062 extends GfSequence {

  /** Construct the sequence. */
  public A402062() {
    super(0, "(1 + x)*(1 + x^2)/((1 - x)*(1 - 2*x^2))");
  }
}

