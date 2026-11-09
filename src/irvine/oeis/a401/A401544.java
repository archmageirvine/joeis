package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401544 Numbers k such that the alternating group A_k does not contain an element of order k.
 * @author Sean A. Irvine
 */
public class A401544 extends GfSequence {

  /** Construct the sequence. */
  public A401544() {
    super(1, "2*x*(2*x^3+x^2-1)/(2*x-1)");
  }
}

