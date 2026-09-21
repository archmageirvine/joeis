package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399611 Number of factorizations of (p*q*r)^n into parts &gt; 1 containing at least one part divisible by p*q*r, where p, q, and r are distinct primes.
 * @author Sean A. Irvine
 */
public class A399611 extends Sequence0 {

  private int mN = -1;

  /*
   * Coefficients of prod_{(a,b,c) != (0,0,0)} (1-x^a y^b z^c)^(-1)
   */
  private final MemoryFunctionInt3<Z> mT = new MemoryFunctionInt3<>() {
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
            // For the logarithmic derivative, the contribution of
            // all multiples of the primitive vector is
            //   (selected coordinate / g) * sigma(g).
            final long q = ((long) (which == 0 ? a : which == 1 ? b : c) / g) * Functions.SIGMA1.l(g);

            if (q != 0) {
              sum = sum.add(mT.get(x - a, y - b, z - c).multiply(q));
            }
          }
        }
      }
      return sum.divide(d);
    }
  };

  /*
   * Coefficients of prod_{(a,b,c) != (0,0,0), abc=0} (1-x^a y^b z^c)^(-1)
   */
  private final MemoryFunctionInt3<Z> mR = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int x, final int y, final int z) {
      if (x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }

      // Differentiate with respect to a nonzero coordinate
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
            // R contains exactly the triples for which at least one coordinate is zero
            if (a != 0 && b != 0 && c != 0) {
              continue;
            }
            final int g = Functions.GCD.i(a, b, c);
            final long q = ((long) (which == 0 ? a : which == 1 ? b : c) / g) * Functions.SIGMA1.l(g);
            if (q != 0) {
              sum = sum.add(mR.get(x - a, y - b, z - c).multiply(q));
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
    return mT.get(mN, mN, mN).subtract(mR.get(mN, mN, mN));
  }
}
