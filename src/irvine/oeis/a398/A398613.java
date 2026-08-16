package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398613 Decimal expansion of the midradius of a canonical (dual-uniform) 9-gonal trapezohedron with unit short edge length.
 * @author Sean A. Irvine
 */
public class A398613 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398613() {
    super(1, Polynomial.create(1, 0, 12, 0, -384, 0, 64), CR.TWO, CR.THREE);
  }
}

