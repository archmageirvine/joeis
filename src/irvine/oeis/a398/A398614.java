package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398614 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398614 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A398614() {
    super(2, Polynomial.create(-3, 0, 90, 0, -267, 0, 1), CR.valueOf(16), CR.valueOf(17));
  }
}

