package irvine.oeis.a399;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399497 allocated for Jens Ahlstr\u00f6m.
 * @author Sean A. Irvine
 */
public class A399497 extends Sequence1 {

  private static final int MAX_BITS = 16;
  private long mB = 0;
  private long mC = 0;
  private long mD = -1;
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
          if ((IntegerUtils.log2(x) - 1) * y >= MAX_BITS) {
            return null;
          }
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
    if (++mD > mC) {
      if (++mC > mB) {
        ++mB;
        mC = 0;
      }
      mD = 0;
    }
    return mH.get(mB, mC, mD);
  }
}

