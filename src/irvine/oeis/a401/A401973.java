package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A401973 allocated for Hitesh Singh Anottra.
 * @author Sean A. Irvine
 */
public class A401973 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A401973() {
    super(0, Polynomial.create(-64, 816, 4345, 3848, 4834, -64, -689, -1600, -1188, 96, -9, 120, 66, -16, 1), CR.valueOf(0.05), CR.valueOf(0.06));
  }
}
