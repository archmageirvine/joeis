package irvine.oeis.a398;

import irvine.oeis.gf.GfSequence;

/**
 * A398672 Number of domino tilings (perfect matchings) of the 4 X 2n grid graph embedded on the Klein bottle.
 * @author Georg Fischer
 */
public class A398672 extends GfSequence {

  /** Construct the sequence. */
  public A398672() {
    super(0, "(1 + x - 29*x^2 + 3*x^3) / ((1 - x)*(1 - 14*x + x^2))");
  }
}
