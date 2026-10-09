package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A086811.
 * @author Sean A. Irvine
 */
public class A399725 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399725() {
    super(1, k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        final long t = k - d.longValueExact();
        if (t != k && t != 0 && Predicates.SQUARE_FREE.is(t)) {
          return false;
        }
      }
      return true;
    });
  }
}

