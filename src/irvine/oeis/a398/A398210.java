package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398210 Decimal expansion of the volume of a canonical (dual-uniform) octagonal trapezohedron with unit short edge length.
 * @author Sean A. Irvine
 */
public class A398210 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398210() {
    super(2, Polynomial.create(8192, 0, -2138112, 0, 79646976, 0, -26827200, 0, 6561), CR.valueOf(63), CR.valueOf(64));
  }
}

