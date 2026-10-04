package irvine.oeis.a397;

import irvine.oeis.gf.EgfSequence;

/**
 * A397256.
 * @author Sean A. Irvine
 */
public class A397246 extends EgfSequence {

  /** Construct the sequence. */
  public A397246() {
    super(0, "exp(x + x^3 + x^7)");
  }
}
