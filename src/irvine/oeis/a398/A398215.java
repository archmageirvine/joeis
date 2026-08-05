package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398215 Decimal expansion of the long/short edge length ratio of a canonical (dual-uniform) octagonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398215 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398215() {
    super(1, Polynomial.create(1, -8, 20, -16, 2), CR.SIX, CR.SEVEN);
  }
}

