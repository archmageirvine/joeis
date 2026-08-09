package irvine.oeis.a397;

import irvine.oeis.a089.A089618;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A397364 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A397364 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A397364() {
    super(0, new A089618().prepend(0));
  }
}
