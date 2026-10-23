package irvine.oeis.a400;

import irvine.oeis.gf.GfSequence;

/**
 * A400664 Expansion of g.f. ((3 - z)/(z^2 - 6*z + 1)^(3/2) - 1/(z - 1)^2) / 2.
 * @author Sean A. Irvine
 */
public class A400664 extends GfSequence {

  /** Construct the sequence. */
  public A400664() {
    super(0, "((3 - x)/(x^2 - 6*x + 1)^(3/2) - 1/(x - 1)^2) / 2");
  }
}
