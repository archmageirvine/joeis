package irvine.oeis.a396;

import irvine.oeis.gf.GfSequence;

/**
 * A396883 allocated for Vjeran Crnjak.
 * @author Sean A. Irvine
 */
public class A396883 extends GfSequence {

  /** Construct the sequence. */
  public A396883() {
    super(0, "((2*x^4 + 2*x^3 + x^2 + 1) - sqrt(1 - 2*x^2 - 3*x^4))/(x*((x^2 + 2*x - 1) + sqrt(1 - 2*x^2 - 3*x^4)))");
  }
}
