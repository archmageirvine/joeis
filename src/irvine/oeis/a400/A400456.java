package irvine.oeis.a400;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400456 Let m be the n-th hyperoperation applied to n (see A189896). a(n) is the n-th hyperoperation applied to m.
 * @author Sean A. Irvine
 */
public class A400456 extends Sequence0 {

  private int mN = -1;
  private static final int MAX_BITS = 16;
  private final MemoryFunctionInt3<Z> mH = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int w, final int x, final int y) {
      switch (w) {
        case 0:
          return Z.valueOf(y + 1L);
        case 1:
          return Z.valueOf(x).add(y);
        case 2:
          return Z.valueOf(x).multiply(y);
        case 3:
          return Z.valueOf(x).pow(y);
        case 4:
          if (y == 0) {
            return Z.ONE;
          }
          // tetration
          final Z base = Z.valueOf(x);
          Z res = base;
          for (int k = 1; k < y; ++k) {
            if (base.multiply(res.bitLength() - 1).compareTo(MAX_BITS) >= 0) {
              return null;
            }
            res = base.pow(res);
          }
          return res;
        default:
          if (y == 0) {
            return Z.ONE;
          }
          final Z t = get(w, x, y - 1);
          return t == null ? null : get(w - 1, x, t.intValue());
      }
    }
  };

  @Override
  public Z next() {
    final int m = mH.get(++mN, mN, mN).intValueExact();
    return mH.get(mN, m, m);
  }
}
