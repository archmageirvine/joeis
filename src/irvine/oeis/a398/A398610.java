package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398610 Decimal expansion of the volume of a canonical (dual-uniform) 9-gonal trapezohedron with unit short edge length.
 * @author Sean A. Irvine
 */
public class A398610 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398610() {
    super(3, Polynomial.create(-27, 324, -828, 8), CR.valueOf(103), CR.valueOf(104));
  }
}

