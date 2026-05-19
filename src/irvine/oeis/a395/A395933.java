package irvine.oeis.a395;

import irvine.oeis.gf.GfSequence;

/**
 * A395933 Number of fixed points of the longest-run operator with radius 2 on binary configurations of the cycle graph C_n.
 * @author Sean A. Irvine
 */
public class A395933 extends GfSequence {

  /** Construct the sequence. */
  public A395933() {
    super(1, "x*(2 - 6*x^2 + 8*x^3 - 6*x^5) / (1 - 2*x + 2*x^3 - 2*x^4 + x^6)");
  }
}
