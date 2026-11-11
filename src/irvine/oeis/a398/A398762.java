package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398762 allocated for Dmytro Dmytryshyn.
 * @author Sean A. Irvine
 */
public class A398762 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.valueOf(1 + k);
      }
      if (n == -1) {
        return Z.ONE;
      }
      if (n == -2) {
        return Z.ZERO;
      }
      return get(n - 1, k).multiply(4L * n + 1 + k).subtract(get(n - 2, k).multiply(4L * n - 5 - k)).add(get(n - 3, k).multiply(n - 2)).divide(n + 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}

