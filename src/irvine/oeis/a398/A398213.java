package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398213 Decimal expansion of the midradius of a canonical (dual-uniform) octagonal trapezohedron with unit short edge length.
 * @author Sean A. Irvine
 */
public class A398213 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398213() {
    super(1, Polynomial.create(-1, 0, 32, 0, 768, 0, -2560, 0, 512), CR.TWO, CR.THREE);
  }
}

