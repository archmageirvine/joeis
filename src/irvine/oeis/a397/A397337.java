package irvine.oeis.a397;

import irvine.oeis.PrependSequence;
import irvine.oeis.a089.A089618;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A397337 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A397337 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A397337() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A089618(), 0)));
    next();
  }
}
