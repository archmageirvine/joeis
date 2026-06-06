package irvine.oeis.a396;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A396579 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A396579 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396579() {
    super(1, 0, k -> {
      final long r = k % 10;
      if (r <= 1 || r == 4 || r == 9) {
        return true;
      }
      if (Predicates.SQUARE.is(k)) {
        return true;
      }
      final String s = Long.toString(k);
      for (int j = s.length() - 2; j > 0; --j) {
        if (Predicates.SQUARE.is(Long.parseLong(s.substring(j)))) {
          return true;
        }
      }
      return false;
    });
  }
}
