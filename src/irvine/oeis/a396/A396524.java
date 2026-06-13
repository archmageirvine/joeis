package irvine.oeis.a396;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396524 Decimal expansion of the volume of the supersphere |x|^5 + |y|^5 + |z|^5 = 1.
 * @author Sean A. Irvine
 */
public class A396524 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396524() {
    super(1, CrFunctions.GAMMA.cr(new Q(6, 5)).pow(3).multiply(8).divide(CrFunctions.GAMMA.cr(new Q(8, 5))));
  }
}
