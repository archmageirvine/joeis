package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397646 Number of factorizations of (p*q)^n into parts &gt; 1 where neither p nor q are permitted as factors, for any two distinct primes p and q.
 * @author Sean A. Irvine
 */
public class A397646 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mF = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int x, final int y) {
      if (x == 0 && y == 0) {
        return Z.ONE;
      }

      // Differentiate with respect to a nonzero coordinate.
      final int d;
      final int which;
      if (x > 0) {
        d = x;
        which = 0;
      } else {
        d = y;
        which = 1;
      }

      Z sum = Z.ZERO;
      for (int a = which == 0 ? 1 : 0; a <= x; ++a) {
        for (int b = which == 1 ? 1 : 0; b <= y; ++b) {
            final int g = Functions.GCD.i(a, b);
            // Sum of the contributions from all multiples of the primitive vector (a/g,b/g,c/g).
            long q = ((which == 0 ? a : b) / g) * Functions.SIGMA1.l(g);
            // Remove the excluded unit vector
            if ((which == 0 && b == 0) || (which == 1 && a == 0)) {
              --q;
            }
            if (q != 0) {
              sum = sum.add(mF.get(x - a, y - b).multiply(q));
            }
        }
      }
      return sum.divide(d);
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mF.get(mN, mN);
  }

}
