package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398214 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398214 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398214() {
    super(2, Polynomial.create(1, 0, -104, 0, 660, 0, -336, 0, 2), CR.valueOf(12), CR.valueOf(13));
  }
}
