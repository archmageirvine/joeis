package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398615 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398615 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398615() {
    super(1, Polynomial.create(-1, 6, -9, 1), CR.EIGHT, CR.NINE);
  }
}
