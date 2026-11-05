package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398117 allocated for Dmytro Dmytryshyn.
 * @author Sean A. Irvine
 */
public class A398117 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k > n) {
        return Z.ZERO;
      }
      if (n == k) {
        return Z.ONE;
      }
      return get(n - 1, k).multiply(4L * n - 2L * k - 2).add(get(n - 2, k).multiply(2L * n - 2)).subtract(get(n - 4, k).multiply(n + k - 2)).divide(n - k);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
