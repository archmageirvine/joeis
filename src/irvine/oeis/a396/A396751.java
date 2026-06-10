package irvine.oeis.a396;

import irvine.math.z.Z;

/**
 * A085249.
 * @author Sean A. Irvine
 */
public class A396751 extends A396749 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    int t = 0;
    while (true) {
      final Z v = c(++t, mN - t).multiply(t).add(c(t, mN - t - 1).multiply(t));
      if (v.isZero()) {
        return sum;
      }
      sum = sum.add(v);
    }
  }
}
