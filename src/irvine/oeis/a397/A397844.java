package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.oeis.a060.A060006;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A397844 Decimal expansion of log(r)/log(phi), where r is the plastic number and phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A397844 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A397844() {
    super(0, new A060006().getCR().log().divide(CR.PHI.log()));
  }
}
