package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401544 allocated for Spandan Bandyopadhyay.
 * @author Sean A. Irvine
 */
public class A401544 extends GfSequence {

  /** Construct the sequence. */
  public A401544() {
    super(1, "2*x*(2*x^3+x^2-1)/(2*x-1)");
  }
}

