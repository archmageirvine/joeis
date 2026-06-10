package irvine.oeis.a396;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085249.
 * @author Sean A. Irvine
 */
public class A396749 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mH = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int t, final int n) {
      if (t == 0 && n == 0) {
        return Z.ONE;
      }
      if (t <= 0 || n <= 0) {
        return Z.ZERO;
      }
      return get(t - 1, n - t).add(get(t, n - t)).multiply(t + 1);
    }
  };

  protected Z c(final int t, final int n) {
    return mH.get(t, n).divide(t * (t + 1L));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    int t = 0;
    while (true) {
      final int tt = ++t;
      final Z v = c(tt, mN).add(Integers.SINGLETON.sum(1, mN - 1, m -> c(tt, m.intValue()).multiply(tt)));
      if (v.isZero()) {
        return sum.add(1);
      }
      sum = sum.add(v);
    }
  }
}
