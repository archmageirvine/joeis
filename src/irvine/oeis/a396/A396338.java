package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396338 Decimal expansion of phi*G, where phi = (1+sqrt(5))/2 is the golden ratio and G is Catalan's constant.
 * @author Sean A. Irvine
 */
public class A396338 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396338() {
    super(1, new A006752().getCR().multiply(CR.PHI));
  }
}
