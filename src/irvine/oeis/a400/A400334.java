package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400334 Decimal expansion of (3/2)*exp(-6^(1/3)).
 * @author Sean A. Irvine
 */
public class A400334 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400334() {
    super(0, CR.SIX.pow(Q.ONE_THIRD).negate().exp().multiply(new Q(3, 2)));
  }
}
