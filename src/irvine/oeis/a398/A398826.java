package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398826 Number of partitions of n where the largest part is equal to the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A398826 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1).add(get(n - i, Math.min(n - i, i)));
    }
  };

  @Override
  public Z next() {
    final int s = Functions.SIGMA0.i(++mN);
    return mB.get(mN - s, s);
  }
}
