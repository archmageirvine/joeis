package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395853 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A395853 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395853() {
    super(1, 0, k -> {
      for (long j = 0, s; (s = k - Functions.FIBONACCI.l(j) * Functions.FIBONACCI.l(j)) >= 0; ++j) {
        if (Predicates.FIBONACCI.is(s)) {
          return true;
        }
      }
      return false;
    });
  }
}
