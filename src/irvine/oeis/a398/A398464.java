package irvine.oeis.a398;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398464 allocated for Alexander Krivilev.
 * @author Sean A. Irvine
 */
public class A398464 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      final int q = IntegerUtils.ceilingLog2(n);
      final int b = 2 * n - (1 << q) - 1;
      return get(n - 1, k).add(get(n - 1, k - q + 1).multiply(n - b - 1)).add(get(n - 1, k - q).multiply(b));
    }
  };

  @Override
  public Z next() {
    if (mB.get(mN, ++mM).isZero()) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
