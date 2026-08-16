package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398616 Decimal expansion of the small face angle, in radians, of a canonical (dual-uniform) 9-gonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398616 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398616() {
    super(0, ComputableReals.SINGLETON.acos(new PolynomialRootExpansionSequence(0, Polynomial.create(27, 0, -36, 8), CR.HALF, CR.ONE).getCR()));
  }
}
