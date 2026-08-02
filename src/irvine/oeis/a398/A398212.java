package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398212 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398212 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398212() {
    super(1, Polynomial.create(-1, 0, 96, 0, 15040, 0, -101376, 0, 24064), CR.TWO, CR.THREE);
  }
}

