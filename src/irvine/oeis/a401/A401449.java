package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A401449 Non-repdigit positive integers whose proper decimal prefixes and proper decimal suffixes have equal sums.
 * @author Sean A. Irvine
 */
public class A401449 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401449() {
    super(1, 2170, n -> {
      long s = 0;
      long m = 1;
      long k = n;
      long j = 0;
      while (k >= 10) {
        j += (k % 10) * m;
        s += j;
        k /= 10;
        s -= k;
        m *= 10;
      }
      return s == 0 && !Predicates.REPDIGIT.is(n);
    });
  }
}
