package irvine.oeis.a401;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401132 Decimal expansion of Gamma(1/4)/Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A401132 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401132() {
    super(1, CrFunctions.GAMMA.cr(Q.ONE_QUARTER).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
