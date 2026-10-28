package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A401112 allocated for Guido Avagliano.
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
