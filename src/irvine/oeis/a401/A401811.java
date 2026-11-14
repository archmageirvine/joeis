package irvine.oeis.a401;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401811 allocated for Dmytro Dmytryshyn.
 * @author Sean A. Irvine
 */
public class A401811 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.ZERO;
      }
      return get(n - 1, k).multiply2().add(get(n - 2, k).multiply(Z.ONE.shiftLeft(2L * k).subtract(1))).multiply(n - 1).divide(n + 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM + 1);
  }
}
