package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399628 allocated for Patrick Bini.
 * @author Sean A. Irvine
 */
public class A399628 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mF = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int r) {
      if (n == r) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n - r, d -> Binomial.binomial(n - r, d).multiply(get(n, r + d)).multiply(b(r, d)));
    }
  };

  private static Z b(final int r, final long d) {
    return Z.ONE.shiftLeft(r).subtract(d == 1 ? 1 : 0);
  }

  @Override
  public Z next() {
    return mF.get(++mN, 0);
  }
}
