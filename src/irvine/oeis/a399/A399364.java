package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicIntArray;

/**
 * A399364 allocated for Carlo Mitchener.
 * @author Sean A. Irvine
 */
public class A399364 extends Sequence0 {

  // After Carlo Mitchener

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    long s = 1;
    for (int k = 0; k < mN; ++k) {
      s *= 3;
    }
    final int full = (1 << mN) - 1;
    // mask[x] = mask[x // 3] << 1 | (x % 3 == 1).
    final LongDynamicIntArray mask = new LongDynamicIntArray();
    for (long x1 = 1; x1 < s; ++x1) {
      mask.set(x1, (mask.get(x1 / 3) << 1) | (x1 % 3 == 1 ? 1 : 0));
    }

    Z total = Z.ZERO;
    for (int d = 1; d < s; ++d) {
      if (Functions.MOBIUS.i(d) == 0) {
        continue;
      }

      final int[] c = new int[full + 1];
      // c[mask[x]] = number of multiples x of d having that mask.
      for (int x = 0; x < s; x += d) {
        ++c[mask.get(x)];
      }

      // Subset sums of c.
      final int[] g = c.clone();
      for (int b = 0; b < mN; ++b) {
        final int bit = 1 << b;
        for (int t = 0; t <= full; ++t) {
          if ((t & bit) != 0) {
            g[t] += g[t ^ bit];
          }
        }
      }

      Z t = Z.ZERO;
      for (int a = 0; a <= full; ++a) {
        if (c[a] == 0) {
          continue;
        }
        final int r = full ^ a;
        int b = r;
        while (true) {
          final long cb = c[b];
          final long gg = g[r ^ b];
          final Z term = Z.valueOf(c[a]).multiply(cb).multiply(gg);
          t = t.add(term);
          if (b == 0) {
            break;
          }
          b = (b - 1) & r;
        }
      }
      total = total.signedAdd(Functions.MOBIUS.i(d) > 0, t.subtract(1));
    }
    return total;
  }
}
