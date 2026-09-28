package irvine.oeis.a400;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a057.A057556;

/**
 * A400200 H_x(y, z), the x-th hyperoperation of y and z, where (x, y, z) is the triple with index n+1 in the lexicographic shell ordering of N^3 given by A057556.
 * @author Sean A. Irvine
 */
public class A400200 extends Sequence1 {

  private final Sequence mA = new A057556();
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
    return mH.get(mA.next().intValueExact(), mA.next().intValueExact(), mA.next().intValueExact());
  }
}

