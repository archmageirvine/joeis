package irvine.oeis.a396;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396796 allocated for Duc Ngo.
 * @author Sean A. Irvine
 */
public class A396796 extends Sequence0 {

  // After Duc Ngo

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    final int full = (1 << ++mN) - 1;
    final MemoryFunctionInt4<Z> f = new MemoryFunctionInt4<>() {
      @Override
      protected Z compute(final int mask, final int prev2, final int prev1, final int depth) {
        if (mask == full) {
          return Z.ONE;
        }
        Z res = Z.ZERO;
        for (int x = 0, m = mask; x < mN; ++x, m >>>= 1) {
          if ((m & 1) == 1) {
            continue;
          }
          if (depth >= 1 && Math.abs(x - prev1) == 1) {
            continue;
          }
          if (depth >= 2 && Math.abs(x - prev2) == 2) {
            continue;
          }
          res = res.add(get(mask | (1 << x), prev1, x, depth + 1));
        }
        return res;
      }
    };
    return f.get(0, -1, -1, 0);
  }
}
