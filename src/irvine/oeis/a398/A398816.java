package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398816 Number of factorizations of (p*q*r*s)^n into parts &gt; 1 where none of p, q, r, or s are permitted as factors, for any four distinct primes p, q, r, and s.
 * @author Sean A. Irvine
 */
public class A398816 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt4<Z> mF = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int w, final int x, final int y, final int z) {
      if (w == 0 && x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }

      // Differentiate with respect to a nonzero coordinate.
      final int t;
      final int which;
      if (w > 0) {
        t = w;
        which = 0;
      } else if (x > 0) {
        t = x;
        which = 1;
      } else if (y > 0) {
        t = y;
        which = 2;
      } else {
        t = z;
        which = 3;
      }

      Z sum = Z.ZERO;
      for (int a = which == 0 ? 1 : 0; a <= w; ++a) {
        for (int b = which == 1 ? 1 : 0; b <= x; ++b) {
          for (int c = which == 2 ? 1 : 0; c <= y; ++c) {
            for (int d = which == 3 ? 1 : 0; d <= z; ++d) {
              final int g = Functions.GCD.i(a, b, c, d);
              long q = ((which == 0 ? a : which == 1 ? b : which == 2 ? c : d) / g) * Functions.SIGMA1.l(g);
              // Remove the excluded unit vector
              if ((which == 0 && b == 0 && c == 0 && d == 0)
                || (which == 1 && a == 0 && c == 0 && d == 0)
                || (which == 2 && a == 0 && b == 0 && d == 0)
                || (which == 3 && a == 0 && b == 0 && c == 0)) {
                --q;
              }
              if (q != 0) {
                sum = sum.add(mF.get(w - a, x - b, y - c, z - d).multiply(q));
              }
            }
          }
        }
      }
      return sum.divide(t);
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mF.get(mN, mN, mN, mN);
  }

}
