package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A399719 allocated for Nicolas B\u011blohoubek.
 * @author Sean A. Irvine
 */
public class A399719 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A399719() {
    super(1, Polynomial.create(8, 9, -7, -7, 1, 1), CR.TWO, CR.THREE);
  }
}

