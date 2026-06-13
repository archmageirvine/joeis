package irvine.oeis.a396;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396523 Decimal expansion of the volume of the supersphere |x|^4 + |y|^4 + |z|^4 = 1.
 * @author Sean A. Irvine
 */
public class A396523 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396523() {
    super(1, CrFunctions.GAMMA.cr(new Q(5, 4)).pow(3).multiply(8).divide(CrFunctions.GAMMA.cr(new Q(7, 4))));
  }
}
