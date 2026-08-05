package irvine.oeis.a397;

import irvine.oeis.PrependSequence;
import irvine.oeis.a089.A089618;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A397401 Denominators of the convergents given by treating A089618 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A397401 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A397401() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A089618(), 0)));
    next();
  }
}
