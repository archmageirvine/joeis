package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396338 allocated for Rudra Jadhav.
 * @author Sean A. Irvine
 */
public class A396338 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396338() {
    super(1, new A006752().getCR().multiply(CR.PHI));
  }
}
