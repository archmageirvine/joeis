package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A401003 Sum of two squares obtained from the n-th Pythagorean prime by one Pell-type recurrence step: a(n) = (2*x + y)^2 + x^2, where x &gt; y &gt; 0 are integers and x^2 + y^2 = A002144(n).
 * @author Sean A. Irvine
 */
public class A401003 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long q = p.longValueExact();
    for (long y = 1; 2 * y * y < q; ++y) {
      final long x2 = q - y * y;
      final long x = Functions.SQRT.l(x2);
      if (x * x == x2) {
        final long z = 2 * x + y;
        final long s = z * z + x * x;
        return Z.valueOf(s);
      }
    }
    throw new RuntimeException();
  }
}
