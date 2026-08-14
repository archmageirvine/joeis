package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398612 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398612 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398612() {
    super(1, Polynomial.create(1, 0, 72, 0, -5808, 0, 1088), CR.TWO, CR.THREE);
  }
}

