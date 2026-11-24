package irvine.oeis.a401;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401825 Maximum number of digits of a zerofree non-repdigit permutation-invariant Niven number in base n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A401825 extends Sequence0 {

  // After Guido Avagliano

  private int mN = -1;

  /*
   * pB(n, r, m) counts partitions of n into at most r parts,
   * each part at most m.
   */
  private final MemoryFunctionInt3<Z> mPB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int r, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 0 || r <= 0 || m <= 0) {
        return Z.ZERO;
      }
      final int mv = Math.min(n, m);
      return get(n - mv, r - 1, mv).add(get(n, r, mv - 1));
    }
  };

  private final MemoryFunctionInt3<Z> mPPart = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int c, final int r, final int m) {
      if (c <= 0 || r <= 0 || m <= 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int d = 1; d * d <= c; ++d) {
        if (c % d == 0) {
          final int mu = Functions.MOBIUS.i(d);
          if (mu != 0) {
            sum = sum.add(mPB.get(c / d, r, m / d).multiply(mu));
          }
          final int e = c / d;
          if (e != d) {
            final int mu2 = Functions.MOBIUS.i(e);
            if (mu2 != 0) {
              sum = sum.add(mPB.get(c / e, r, m / e).multiply(mu2));
            }
          }
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    if (mN <= 3) {
      return Z.ZERO;
    }
    int best = 0;
    for (int g = 1; g <= mN - 2; ++g) {
      final int m = (mN - 1) * g;
      if (m - g <= best) {
        continue;
      }
      for (int s = 2; s <= m; ++s) {
        if (m % s != 0) {
          continue;
        }
        for (int a0 = 1; a0 <= mN - 1 - g; ++a0) {
          final int mc = (mN - 1 - a0) / g;
          if (mc < 1) {
            continue;
          }
          final int maxL = (s - g) / a0;
          for (int l = maxL; l > best; --l) {
            final int rem = s - l * a0;
            if (rem <= 0 || rem % g != 0) {
              continue;
            }
            final int c = rem / g;
            if (c > (l - 1) * mc) {
              continue;
            }
            final Z modulus = Z.valueOf((long) s * (mN - 1));
            final Z base = Z.valueOf(mN);
            final Z residue = base.modPow(Z.valueOf(l), modulus);
            final long rk = residue.subtract(Z.ONE).divide(Z.valueOf(mN - 1)).mod(s);
            if ((long) a0 * (rk - l) % s == 0 && mPPart.get(c, l - 1, mc).signum() > 0) {
              best = l;
              break;
            }
          }
        }
      }
    }
    return Z.valueOf(best);
  }
}
