package irvine.oeis.a402;

import irvine.oeis.gf.GfSequence;

/**
 * A402434 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A402434 extends GfSequence {

  /** Construct the sequence. */
  public A402434() {
    super(1, "(x/(1 - x))+(x*(1 + x + 2*x^2)/((1 - x^3)*(1 - x^4)))+(x^3/((1 - x^3)*(1 - x^6)))+(x^9*(1 + 2*x^3 + 3*x^6)/((1 - x^6)*(1 - x^9)*(1 - x^12)))+(x^36/((1 - x^6)*(1 - x^12)*(1 - x^18)*(1 - x^24)))");
  }
}

