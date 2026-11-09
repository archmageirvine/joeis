package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002144;

/**
 * A401444 Pythagorean primes p for which one Fibonacci recurrence step (v, u) -&gt; (u, u+v) on the odd leg u and even leg v of the primitive Pythagorean triangle with hypotenuse p gives another Pythagorean prime q = (u^2 + (u+v)^2)/2.
 * @author Sean A. Irvine
 */
public class A401444 extends FilterSequence {

  /** Construct the sequence. */
  public A401444() {
    super(1, new A002144(), pp -> {
      final long p = pp.longValueExact();
      for (long y = 1; y * y < p; ++y) {
        final long x2 = p - y * y;
        if (Predicates.SQUARE.is(x2)) {
          final long x = Functions.SQRT.l(x2);
          final long u = x2 - y * y;
          final long v = 2 * y * x;
          final long q = u * u + (u + v) * (u + v);
          return (q & 3) == 2 && Predicates.PRIME.is(q / 2);
        }
      }
      throw new RuntimeException();
    });
  }
}
