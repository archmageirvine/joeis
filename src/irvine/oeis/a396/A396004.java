package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396004 Decimal expansion of Sum_{n&gt;=2} (zeta(2*n + 1) - 1)*n^2/(n + 1).
 * @author Sean A. Irvine
 */
public class A396004 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396004() {
    super(0, CR.LOG2.add(new Q(9, 16)).subtract(CR.GAMMA).subtract(Zeta.zeta(3).divide(2)));
  }
}
