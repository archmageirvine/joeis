package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399303 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A399303 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunctionInt4<Z> mF = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int w, final int x, final int y, final int z) {
      if (w == 0 && x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      if (w > 0) {
        return recW(w, x, y, z);
      }
      if (x > 0) {
        return recX(w, x, y, z);
      }
      if (y > 0) {
        return recY(w, x, y, z);
      }
      return recZ(w, x, y, z);
    }

    private Z recW(final int w, final int x, final int y, final int z) {
      Z s = Z.ZERO;
      for (int i = 0; i <= w; ++i) {
        for (int j = 0; j <= x; ++j) {
          for (int k = 0; k <= y; ++k) {
            for (int l = 0; l <= z; ++l) {
              if (i + j + k + l <= 1) {
                continue;
              }
              s = s.add(mF.get(w - i, x - j, y - k, z - l).multiply(coeff(i, j, k, l, i)));
            }
          }
        }
      }
      return s.divide(w);
    }

    private Z recX(final int w, final int x, final int y, final int z) {
      Z s = Z.ZERO;
      for (int i = 0; i <= w; ++i) {
        for (int j = 0; j <= x; ++j) {
          for (int k = 0; k <= y; ++k) {
            for (int l = 0; l <= z; ++l) {
              if (i + j + k + l <= 1) {
                continue;
              }
              s = s.add(mF.get(w - i, x - j, y - k, z - l).multiply(coeff(i, j, k, l, j)));
            }
          }
        }
      }
      return s.divide(x);
    }

    private Z recY(final int w, final int x, final int y, final int z) {
      Z s = Z.ZERO;
      for (int i = 0; i <= w; ++i) {
        for (int j = 0; j <= x; ++j) {
          for (int k = 0; k <= y; ++k) {
            for (int l = 0; l <= z; ++l) {
              if (i + j + k + l <= 1) {
                continue;
              }
              s = s.add(mF.get(w - i, x - j, y - k, z - l).multiply(coeff(i, j, k, l, k)));
            }
          }
        }
      }
      return s.divide(y);
    }

    private Z recZ(final int w, final int x, final int y, final int z) {
      Z s = Z.ZERO;
      for (int i = 0; i <= w; ++i) {
        for (int j = 0; j <= x; ++j) {
          for (int k = 0; k <= y; ++k) {
            for (int l = 0; l <= z; ++l) {
              if (i + j + k + l <= 1) {
                continue;
              }
              s = s.add(mF.get(w - i, x - j, y - k, z - l).multiply(coeff(i, j, k, l, l)));
            }
          }
        }
      }
      return s.divide(z);
    }

    /*
     * r * sum (-1)^(d+1)/d, over d | gcd(i,j,k,l), subject to (i+j+k+l)/d > 1.
     * The returned value is integral because d divides r.
     */
    private long coeff(final int i, final int j, final int k, final int l, final int r) {
      final int g = Functions.GCD.i(i, j, k, l);
      final int total = i + j + k + l;
      long s = 0;
      for (int d = 1; d * d <= g; ++d) {
        if (g % d == 0) {
          final int e = g / d;
          if (total / d > 1) {
            s += (d & 1) == 1 ? r / d : -r / d;
          }
          if (e != d && total / e > 1) {
            s += (e & 1) == 1 ? r / e : -r / e;
          }
        }
      }
      return s;
    }
  };

  @Override
  public Z next() {
    return mF.get(++mN, mN, mN, mN);
  }
}
