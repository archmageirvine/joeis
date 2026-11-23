package irvine.oeis.a402;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402170 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402170 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0 || k == 0) {
        return Z.ONE;
      }
      long m = 1;
      outer:
      while (true) {
        ++m;
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < k; ++j) {
            if (get(i, j).multiply(m).equals(get(i, k).multiply(get(n, j)))) {
              continue outer;
            }
          }
        }
        return Z.valueOf(m);
      }
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}
