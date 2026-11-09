package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A401446 Square roots of the central entries in a six-square 3 X 3 magic-square construction from Pythagorean primes using a Fibonacci recurrence step on the legs.
 * @author Sean A. Irvine
 */
public class A401446 extends A002144 {

  @Override
  public Z next() {
    final Z pp = super.next();
    final long p = pp.longValueExact();
    for (long y = 1; y * y < p; ++y) {
      final long x2 = p - y * y;
      if (Predicates.SQUARE.is(x2)) {
        final long x = Functions.SQRT.l(x2);
        final long u = x2 - y * y;
        final long v = 2 * y * x;
        final long q = u * u + (u + v) * (u + v);
        return pp.multiply(q / 2);
      }
    }
    throw new RuntimeException();
  }
}
