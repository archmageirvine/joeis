package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397811
 * @author Sean A. Irvine
 */
public class A397811 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt4<Z> mF = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int w, final int x, final int y, final int z) {
      if (w == 0 && x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      /*
       * Choose a positive coordinate for the logarithmic derivative.
       * This guarantees that every recursive call has a strictly
       * smaller value in that coordinate.
       */
      if (w > 0) {
        return recurrence(w, x, y, z, 0);
      } else if (x > 0) {
        return recurrence(x, w, y, z, 1);
      } else if (y > 0) {
        return recurrence(y, w, x, z, 2);
      } else {
        return recurrence(z, w, x, y, 3);
      }
    }
    /*
     * The first argument r is the coordinate with respect to which
     * the logarithmic derivative is taken.  The other three arguments
     * are the remaining coordinates.
     */
    private Z recurrence(final int r, final int a, final int b, final int c, final int which) {
      Z sum = Z.ZERO;
      for (int i = 1; i <= r; ++i) {
        for (int j = 0; j <= a; ++j) {
          for (int k = 0; k <= b; ++k) {
            for (int l = 0; l <= c; ++l) {
              if (i == 0 && j == 0 && k == 0 && l == 0) {
                continue;
              }
              final int g = Functions.GCD.i(i, j, k, l);
              final long q = coefficient(i, g);
              if (q == 0) {
                continue;
              }
              final Z f;
              switch (which) {
                case 0:
                  f = mF.get(r - i, a - j, b - k, c - l);
                  break;
                case 1:
                  f = mF.get(a - j, r - i, b - k, c - l);
                  break;
                case 2:
                  f = mF.get(a - j, b - k, r - i, c - l);
                  break;
                default:
                  f = mF.get(a - j, b - k, c - l, r - i);
                  break;
              }
              sum = sum.add(f.multiply(q));
            }
          }
        }
      }

      return sum.divide(r);
    }
  };

  /*
   * Returns r * sum_{d | gcd(i,j,k,l)} 1/d
   * where r is the positive coordinate used by the derivative.
   * Since every divisor of the gcd divides r, this is an integer.
   */
  private static long coefficient(final int r, final int g) {
    long result = 0;
    for (int d = 1; d * d <= g; ++d) {
      if (g % d == 0) {
        result += r / d;
        final int e = g / d;
        if (e != d) {
          result += r / e;
        }
      }
    }
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    return mF.get(mN, mN, mN, mN);
  }
}
