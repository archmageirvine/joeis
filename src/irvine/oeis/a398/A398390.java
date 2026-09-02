package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398390 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A398390 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunctionInt4<Z> mF = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int w, final int x, final int y, final int z) {
      if (w == 0 && x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      if (w > 0) {
        return rec(w, x, y, z, 0);
      }
      if (x > 0) {
        return rec(x, w, y, z, 1);
      }
      if (y > 0) {
        return rec(y, w, x, z, 2);
      }
      return rec(z, w, x, y, 3);
    }

    /*
     * Recurrence using the positive coordinate r.
     * The other coordinates are a,b,c, in their original order
     * except that r has been moved to the first position.
     */
    private Z rec(final int r, final int a, final int b, final int c, final int which) {
      Z s = Z.ZERO;

      /*
       * Enumerate binary exponent vectors u with u[which] = 1
       * and weight at least 2.
       */
      for (int mask = 0; mask < 16; ++mask) {
        if ((mask & (1 << which)) == 0) {
          continue;
        }
        if (Integer.bitCount(mask) < 2) {
          continue;
        }

        final int u0 = (mask & 1) != 0 ? 1 : 0;
        final int u1 = (mask & 2) != 0 ? 1 : 0;
        final int u2 = (mask & 4) != 0 ? 1 : 0;
        final int u3 = (mask & 8) != 0 ? 1 : 0;

        /*
         * q*u <= (w,x,y,z). Since u consists only of zeroes
         * and ones, q is bounded by every selected coordinate.
         */
        int qmax = Integer.MAX_VALUE;
        if (u0 != 0) {
          qmax = Math.min(qmax, original(r, a, b, c, which, 0));
        }
        if (u1 != 0) {
          qmax = Math.min(qmax, original(r, a, b, c, which, 1));
        }
        if (u2 != 0) {
          qmax = Math.min(qmax, original(r, a, b, c, which, 2));
        }
        if (u3 != 0) {
          qmax = Math.min(qmax, original(r, a, b, c, which, 3));
        }

        for (int q = 1; q <= qmax; ++q) {
          s = s.add(mF.get(
            original(r, a, b, c, which, 0) - q * u0,
            original(r, a, b, c, which, 1) - q * u1,
            original(r, a, b, c, which, 2) - q * u2,
            original(r, a, b, c, which, 3) - q * u3
          ));
        }
      }

      return s.divide(r);
    }

    // Recover the original coordinate from the reordered arguments
    private int original(final int r, final int a, final int b, final int c,  final int which, final int coordinate) {
      if (coordinate == which) {
        return r;
      }
      int p = 0;
      for (int i = 0; i < 4; ++i) {
        if (i == which) {
          continue;
        }
        if (i == coordinate) {
          return p == 0 ? a : p == 1 ? b : c;
        }
        ++p;
      }
      throw new IllegalStateException();
    }
  };

  @Override
  public Z next() {
    return mF.get(++mN, mN, mN, mN);
  }
}
