package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398471 Minimum total search cost of an optimal binary search tree over n keys in sorted order, where key i has access frequency i.
 * @author Sean A. Irvine
 */
public class A398471 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int i, final int j) {
      if (i == j + 1) {
        return Z.ZERO;
      }
      Z min = get(i, i - 1).add(get(i + 1, j));
      for (int r = i + 1; r <= j; ++r) {
        min = min.min(get(i, r - 1).add(get(r + 1, j)));
      }
      return min.add(s(i, j));
    }
  };

  private Z s(final int i, final int j) {
    return Z.valueOf(i + j).multiply(j - i + 1).divide2();
  }

  @Override
  public Z next() {
    return mB.get(1, ++mN);
  }
}

