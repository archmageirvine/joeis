package irvine.oeis.a396;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005101;

/**
 * A396980 Abundant numbers whose preceding five numbers and following five numbers are nonabundant.
 * @author Sean A. Irvine
 */
public class A396980 extends FilterSequence {

  /** Construct the sequence. */
  public A396980() {
    super(1, new A005101(), n -> {
      for (long k = 1; k <= 5; ++k) {
        if (Predicates.ABUNDANT.is(n.subtract(k))) {
          return false;
        }
        if (Predicates.ABUNDANT.is(n.add(k))) {
          return false;
        }
      }
      return true;
    });
  }
}
