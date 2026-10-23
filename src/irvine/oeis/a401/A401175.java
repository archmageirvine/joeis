package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A401175 allocated for Adam Reichert.
 * @author Sean A. Irvine
 */
public class A401175 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A401175() {
    super(1, Polynomial.create(-1, -1, 0, 1), CR.ONE, CR.TWO, 16);
  }
}
