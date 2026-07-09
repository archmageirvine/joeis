package irvine.oeis.a397;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A397306 Positive numbers m such that m - 2^k is a prime for exactly one value of k &gt; 0 with 2^k &lt; m.
 * @author Sean A. Irvine
 */
public class A397306 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397306() {
    super(1, k -> {
      int cnt = 0;
      for (long t = 2; t < k; t <<= 1) {
        if (Predicates.PRIME.is(k - t) && ++cnt > 1) {
          return false;
        }
      }
      return cnt == 1;
    });
  }
}
