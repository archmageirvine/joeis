package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398438 Array read by ascending antidiagonals: A(0,k) = 0 and A(n,k) = A(n-1,k)^2 + k for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A398438 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return  n == 0 ? Z.ZERO : get(n - 1, m).square().add(m);
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
