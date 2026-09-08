package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399312 Number of partitions of n where the smallest part is equal to the number of divisors of n, d(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A399312 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 0 || i > n) {
        return Z.ZERO;
      }
      return get(n, i + 1).add(get(n - i, i));
    }
  };

  @Override
  public Z next() {
    final long s = Functions.SIGMA0.l(++mN);
    return mB.get(mN - s, s);
  }
}

