package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398553 Number of factorizations of (p*q*r)^n into parts &gt; 1 where none of p, q, or r are permitted as factors, for any three distinct primes p, q, and r.
 * @author Sean A. Irvine
 */
public class A398553 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt3<Z> mF = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int x, final int y, final int z) {
      if (x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }

      // Differentiate with respect to a nonzero coordinate.
      final int d;
      final int which;
      if (x > 0) {
        d = x;
        which = 0;
      } else if (y > 0) {
        d = y;
        which = 1;
      } else {
        d = z;
        which = 2;
      }

      Z sum = Z.ZERO;
      for (int a = which == 0 ? 1 : 0; a <= x; ++a) {
        for (int b = which == 1 ? 1 : 0; b <= y; ++b) {
          for (int c = which == 2 ? 1 : 0; c <= z; ++c) {
            final int g = Functions.GCD.i(a, b, c);
            // Sum of the contributions from all multiples of the primitive vector (a/g,b/g,c/g).
            long q = ((which == 0 ? a : which == 1 ? b : c) / g) * Functions.SIGMA1.l(g);
            // Remove the excluded unit vector
            if ((which == 0 && b == 0 && c == 0) || (which == 1 && a == 0 && c == 0) || (which == 2 && a == 0 && b == 0)) {
              --q;
            }
            if (q != 0) {
              sum = sum.add(mF.get(x - a, y - b, z - c).multiply(q));
            }
          }
        }
      }
      return sum.divide(d);
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mF.get(mN, mN, mN);
  }

}
