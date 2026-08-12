package irvine.oeis.a397;

import irvine.oeis.a089.A089618;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A397364 Decimal expansion of the number whose continued fraction coefficients are given in A089618.
 * @author Sean A. Irvine
 */
public class A397364 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A397364() {
    super(0, new A089618().prepend(0));
  }
}
