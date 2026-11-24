package irvine.oeis.a401;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401818 Side lengths of squares formed by constructing three right triangles corresponding to distinct Pythagorean triples on the sides of a triangle excluding configurations that are integer multiples of previously obtained configurations.
 * @author Sean A. Irvine
 */
public class A401818 extends FilterNumberSequence {

  private static final HashSet<Long> SEEN_P = new HashSet<>();

  private static boolean ok(final long p) {
    for (final long v : SEEN_P) {
      if (p % v == 0) {
        return false;
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A401818() {
    super(1, 360, 2, p -> {
      if (ok(p)) {
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
                    SEEN_P.add(p);
                    return true;
                  }
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

