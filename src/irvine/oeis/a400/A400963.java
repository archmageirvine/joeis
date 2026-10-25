package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400963 Decimal expansion of the real solution to x^5 - 5*x^4 - 10*x^3 - 10*x^2 - 5*x - 1 = 0.
 * @author Sean A. Irvine
 */
public class A400963 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400963() {
    super(1, CR.TWO.pow(new Q(1, 5)).subtract(1).inverse());
  }
}

