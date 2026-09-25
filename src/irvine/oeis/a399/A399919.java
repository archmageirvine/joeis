package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A399919 Decimal expansion of the least positive root of the equation 2025*x^8 - 11970*x^6 + 17009*x^4 - 9000x^2 + 2000.
 * @author Sean A. Irvine
 */
public class A399919 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A399919() {
    super(1, Polynomial.create(2000, 0, -9000, 0, 17009, 0, -11970, 0, 2025), CR.ONE, CR.TWO);
  }
}

