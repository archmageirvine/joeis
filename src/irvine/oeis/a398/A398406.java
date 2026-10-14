package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398406 Hexadecimal expansion of the square root of 2.
 * @author Sean A. Irvine
 */
public class A398406 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398406() {
    super(1, CR.SQRT2, 16);
  }
}
