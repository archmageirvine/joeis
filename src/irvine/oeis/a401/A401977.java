package irvine.oeis.a401;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401977 Triangle read by rows: T(0,0) = 2; for n &gt;= 1, T(n,0) = 1, T(n,n) = (-1)^n*prime(n+1), and T(n,k) = T(n-1,k-1) + T(n-1,k) for 0 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A401977 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return n == 0 ? Z.TWO : Z.ONE;
      }
      if (n == m) {
        return Functions.PRIME.z(n + 1).multiply(Z.NEG_ONE.pow(n));
      }
      return get(n - 1, m - 1).add(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
