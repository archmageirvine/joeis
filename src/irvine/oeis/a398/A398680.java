package irvine.oeis.a398;

import irvine.oeis.gf.GfSequence;

/**
 * A398680 allocated for Ariadne Weber-Madison.
 * @author Sean A. Irvine
 */
public class A398680 extends GfSequence {

  /** Construct the sequence. */
  public A398680() {
    super(1, "x*(1 - 12*x - 17*x^2 + 647*x^3 - 2104*x^4 - 3777*x^5 + 29040*x^6 - 35295*x^7 - 35423*x^8 + 94304*x^9 - 35415*x^10 - 34995*x^11 + 28620*x^12 - 3888*x^13 - 1701*x^14 + 486*x^15 - 27*x^16)/((1 - 3*x + x^2)*(1 - 15*x + 32*x^2 - 15*x^3 + x^4)*(1 - 15*x^2 + 32*x^4 - 15*x^6 + x^8))");
  }
}
