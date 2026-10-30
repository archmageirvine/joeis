package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A401112 Strictly non-handsome numbers in all bases from 2 to k: numbers k such that for every base b (2 &lt;= b &lt;= k), k cannot be written as the sum of its base-b digits raised to positive integer powers.
 * @author Sean A. Irvine
 */
public class A401112 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401112() {
    super(1, n -> {
      for (long b = 2; b <= n; ++b) {
        if (Predicates.HANDSOME.is(b, n)) {
          return false;
        }
      }
      return true;
    });
  }
}
