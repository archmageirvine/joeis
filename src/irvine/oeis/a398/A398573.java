package irvine.oeis.a398;

import irvine.oeis.gf.GfSequence;

/**
 * A398573 allocated for Dmytro Dmytryshyn.
 * @author Sean A. Irvine
 */
public class A398573 extends GfSequence {

  /** Construct the sequence. */
  public A398573() {
    super(0, "(1-x-x^2)^(-3/2)");
  }
}
