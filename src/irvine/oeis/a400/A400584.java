package irvine.oeis.a400;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400584 allocated for J. R. G. Mendon\u00e7a.
 * @author Sean A. Irvine
 */
public class A400584 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return k == 1 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, k).square()
        .add(Integers.SINGLETON.sum(k + 1, 1L << (n - 1), u -> get(n - 1, u)).multiply(get(n - 1, k)).multiply2())
        .add(Integers.SINGLETON.sum(1, k - 1, i -> get(n - 1, i).multiply(get(n - 1, k - i))));
    }
  };

  @Override
  public Z next() {
    if (++mM > 1 << mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
