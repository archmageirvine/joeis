package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398004 allocated for Eric Tr\u00e9buchon.
 * @author Sean A. Irvine
 */
public class A398004 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (Math.min(n, k) == 1) {
        return Z.valueOf(Math.max(n, k));
      }
      return get(n, k - 1).add(n + k).add(get(n - 1, k));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mM, 1 + mN - mM);
  }
}
