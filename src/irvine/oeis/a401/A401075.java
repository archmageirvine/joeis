package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401075 Decimal expansion of the generalized continued fraction 1/(3+5/(7+9/(11+13/(15+...)))), using every odd integer.
 * @author Sean A. Irvine
 */
public class A401075 extends DecimalExpansionSequence {

  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);

  /** Construct the sequence. */
  public A401075() {
    super(0, ComputableReals.SINGLETON.hypergeometric(CR.valueOf(new Q(5, 4)), CR.TWO, ONE_QUARTER)
      .divide(ComputableReals.SINGLETON.hypergeometric(ONE_QUARTER, CR.ONE, ONE_QUARTER))
      .divide(4));
  }
}
