package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398611 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398611 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398611() {
    super(3, Polynomial.create(9034497, 0, 295245, 0, -17982, 0, 1), CR.valueOf(134), CR.valueOf(135));
  }
}

