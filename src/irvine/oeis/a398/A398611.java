package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398611 Decimal expansion of the surface area of a canonical (dual-uniform) 9-gonal trapezohedron with unit short edge length.
 * @author Sean A. Irvine
 */
public class A398611 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398611() {
    super(3, Polynomial.create(9034497, 0, 295245, 0, -17982, 0, 1), CR.valueOf(134), CR.valueOf(135));
  }
}

