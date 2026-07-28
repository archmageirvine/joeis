package irvine.oeis.a397;

import irvine.oeis.gf.EgfSequence;

/**
 * A397264 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A397264 extends EgfSequence {

  /** Construct the sequence. */
  public A397264() {
    super(0, "x*(1-x-sqrt(1-2*x))/(1-2*x)^(3/2)");
  }
}

