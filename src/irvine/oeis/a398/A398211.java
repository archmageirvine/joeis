package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398211 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398211 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398211() {
    super(2, Polynomial.create(-197132288, 0, 16777216, 0, 1404928, 0, -9216, 0, 1), CR.valueOf(95), CR.valueOf(96));
  }
}
