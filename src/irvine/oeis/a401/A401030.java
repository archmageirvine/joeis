package irvine.oeis.a401;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401030 allocated for S. S. Krishna Chaitanya Bulusu.
 * @author Sean A. Irvine
 */
public class A401030 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Integer> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Integer compute(final int n, final int m) {
      if (m == 0 || m == n) {
        return 1;
      }
      return 1 - (get(n - 1, m - 1) & get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mB.get(mN, mM));
  }
}

