package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397379 Number of compositions (c_1,...,c_k) of n such that gcd(c_i,i)=1 for all i.
 * @author Sean A. Irvine
 */
public class A397379 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k <= n; ++k) {
        if (Functions.GCD.i(k, m) == 1) {
          sum = sum.add(get(n - k, m - 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mB.get(mN, k));
  }
}
