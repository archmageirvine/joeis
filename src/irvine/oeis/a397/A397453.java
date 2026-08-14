package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A397453 allocated for Cameron Rampell.
 * @author Sean A. Irvine
 */
public class A397453 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397453() {
    super(1, k -> {
      final long m = Functions.SQRT.l(k);
      return Predicates.SQUARE.is(k - m * m) && Predicates.SQUARE.is(k + m * m);
    });
  }
}
