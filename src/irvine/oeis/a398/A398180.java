package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398180 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A398180 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - 1, k -> get(n - k, m - 1)).multiply(n - 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
