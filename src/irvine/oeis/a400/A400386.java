package irvine.oeis.a400;

import irvine.oeis.gf.GfSequence;

/**
 * A400386 Rows sum of triangle A106580.
 * @author Sean A. Irvine
 */
public class A400386 extends GfSequence {

  /** Construct the sequence. */
  public A400386() {
    super(0, "((1 - x^2)*2/((1 - x)^2 + sqrt(1 - 6*x^2 + x^4)) - 1 - x)/x^2");
  }
}
