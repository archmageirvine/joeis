package irvine.oeis.a400;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400238 allocated for Dmytro Dmytryshyn.
 * @author Sean A. Irvine
 */
public class A400238 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.valueOf(3 + 6L * k);
      }
      return get(n - 1, k).multiply(8L * n - 5 + 6L * k).subtract(get(n - 2, k).multiply(6L * n - 13 - 2L * k)).subtract(get(n - 3, k).multiply(4L * n - 7 + 10L * k)).add(get(n - 4, k).multiply(3L * n - 9 + 6L * k)).divide(n);
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

