package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398617 Decimal expansion of the large face angle, in radians, of a canonical (dual-uniform) 9-gonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398617() {
    super(1, ComputableReals.SINGLETON.acos(new PolynomialRootExpansionSequence(0, Polynomial.create(3, 0, -12, 8), CR.HALF.negate(), CR.ZERO).getCR()));
  }
}

