package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401694 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A401694 extends GfSequence {

  /** Construct the sequence. */
  public A401694() {
    super(1, "(2*(1+x+x^3)*(sqrt(1-4*x^2)) - x*(1+x)*(1+x+x^2)*(sqrt(1-4*x)) - (1-x)*(2+3*x-x^2+x^3+2*x^4))/(2*x^3*(1-x)^2*(1+x))");
  }
}
