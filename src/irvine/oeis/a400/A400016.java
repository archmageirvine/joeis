package irvine.oeis.a400;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400016 Number of permutations p of [n] such that every left-to-right maximum of p is a vertex of the upper convex hull of the points (i, p(i)).
 * @author Sean A. Irvine
 */
public class A400016 extends Sequence0 {

  // After Karan Sharma

  private int mN = -1;

  private final MemoryFunctionInt4<Z> mF = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int px, final int py, final int x, final int y) {
      if (y == mN) {
        return Functions.FACTORIAL.z(mN - x);
      }
      Z sum = Z.ZERO;
      for (int x2 = x + 1; x2 <= mN; ++x2) {
        Z fill = Z.ONE;
        for (int i = x + 1; i < x2; ++i) {
          fill = fill.multiply(y - i + 1);
        }
        for (int y2 = y + 1; y2 <= mN; ++y2) {
          if ((long) (y - py) * (x2 - px) > (long) (y2 - py) * (x - px)) {
            sum = sum.add(fill.multiply(get(x, y, x2, y2)));
          }
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    mF.clear();
    Z sum = Functions.FACTORIAL.z(mN - 1);
    for (int y = 1; y < mN; ++y) {
      for (int x2 = 2; x2 <= mN; ++x2) {
        Z fill = Z.ONE;
        for (int i = 2; i < x2; ++i) {
          fill = fill.multiply(y - i + 1);
        }
        for (int y2 = y + 1; y2 <= mN; ++y2) {
          sum = sum.add(fill.multiply(mF.get(1, y, x2, y2)));
        }
      }
    }
    return sum;
  }
}
