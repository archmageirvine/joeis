package irvine.oeis.a396;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396522 Decimal expansion of the volume of the supersphere |x|^3 + |y|^3 + |z|^3 = 1.
 * @author Sean A. Irvine
 */
public class A396522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396522() {
    super(1, CrFunctions.GAMMA.cr(new Q(4, 3)).pow(3).multiply(8));
  }
}
