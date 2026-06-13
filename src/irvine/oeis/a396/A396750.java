package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A396750 Number of colored 2-ball prime juggling patterns of period n.
 * @author Sean A. Irvine
 */
public class A396750 extends A396749 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if ((++mN & 1) == 1) {
      int t = 0;
      while (true) {
        final int tt = ++t;
        final Z v = Integers.SINGLETON.sum(1, (mN - 1) / 2, m -> c(tt, m.intValue()).multiply(c(tt, (int) (mN - m)).multiply(tt)));
        if (v.isZero()) {
          break;
        }
        sum = sum.add(v);
      }
    } else {
      int t = 0;
      while (true) {
        final int tt = ++t;
        final Z v = Integers.SINGLETON.sum(1, mN / 2 - 1, m -> c(tt, m.intValue()).multiply(c(tt, (int) (mN - m)).multiply(tt)));
        if (v.isZero()) {
          break;
        }
        sum = sum.add(v);
      }
      t = 0;
      while (true) {
        final Z v = c(++t, mN / 2).multiply((t + 1) / 2).add(Binomial.binomial(c(t, mN / 2), 2).multiply(t));
        if (v.isZero()) {
          break;
        }
        sum = sum.add(v);
      }
    }
    return sum;
  }
}
