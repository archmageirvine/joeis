package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A401445 Half the sum of the squares after one Fibonacci recurrence step (v, u) -&gt; (u, u+v): a(n) = (u^2 + (u+v)^2)/2, where u and v are the odd and even legs of the primitive Pythagorean triangle with hypotenuse A002144(n).
 * @author Sean A. Irvine
 */
public class A401445 extends A002144 {

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
        return Z.valueOf(q / 2);
      }
    }
    throw new RuntimeException();
  }
}
