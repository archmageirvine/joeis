package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395941 allocated for Chuck Seggelin.
 * @author Sean A. Irvine
 */
public class A395941 extends Sequence0 {

  private int mN = -1;
  private final Fast mPrime = new Fast();
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int p = 2; p <= Math.min(m, n); p = (int) mPrime.nextPrime(p)) {
        sum = sum.add(get(n - p, p));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN * mN, mN);
  }
}

