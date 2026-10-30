package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400178 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A400178 extends FilterNumberSequence {

  // After Andrew Howroyd

  /** Construct the sequence. */
  public A400178() {
    super(1, 360, 2, p -> {
      for (final Z dd : Jaguar.factor(p * p).divisors()) {
        final long d = dd.longValue();
        final long x2 = d - p * p / d;
        if (x2 > 0 && (x2 & 1) == 0) {
          final long x = x2 / 2;
          if (x < p) {
            final long q = p - x;
            for (final Z ee : Jaguar.factor(q * q).divisors()) {
              final long e = ee.longValue();
              final long y2 = e - q * q / e;
              if (y2 > 0 && (y2 & 1) == 0) {
                final long y = y2 / 2;
                if (y < p && x <= p - y && Predicates.SQUARE.is((p - y) * (p - y) + p * p)) {
                  return true;
                }
              }
            }
          }
        }
      }
      return false;
    });
  }
}

