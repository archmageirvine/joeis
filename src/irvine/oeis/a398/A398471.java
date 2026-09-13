package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398471 allocated for Attili Veera Naga Sai Harsha.
 * @author Sean A. Irvine
 */
public class A398471 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == m + 1) {
        return Z.ZERO;
      }
      Z min = get(n, n - 1).add(get(n + 1, m));
      for (int r = n + 1; r <= m; ++r) {
        min = min.min(get(n, r - 1)).add(get(r + 1, m));
      }
      return min.add(s(n, m));
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

