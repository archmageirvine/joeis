package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002144;

/**
 * A401002 Pythagorean primes p = x^2 + y^2 with integers x &gt; y &gt; 0 for which one Pell-type recurrence step (x, y) -&gt; (2*x + y, x) gives another Pythagorean prime q = (2*x + y)^2 + x^2.
 * @author Sean A. Irvine
 */
public class A401002 extends FilterSequence {

  /** Construct the sequence. */
  public A401002() {
    super(1, new A002144(), p -> {
      final long q = p.longValueExact();
      for (long y = 1; 2 * y * y < q; ++y) {
        final long x2 = q - y * y;
        final long x = Functions.SQRT.l(x2);
        if (x * x == x2) {
          final long z = 2 * x + y;
          final long s = z * z + x * x;
          if ((s & 3) == 1 && Predicates.PRIME.is(s)) {
            return true;
          }
        }
      }
      return false;
    });
  }
}
