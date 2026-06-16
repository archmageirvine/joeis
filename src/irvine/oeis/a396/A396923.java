package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396923 a(n) is the number of grand Motzkin paths with air pockets of length n.
 * @author Sean A. Irvine
 */
public class A396923 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (long d = 1; d <= mN / 2; ++d) {
      final long dd = d;
      final Z s = Integers.SINGLETON.sum(0, mN - 2 * d, k -> Binomial.binomial(mN - dd, k).multiply(Binomial.binomial(mN - dd - k - 1, dd - 1)));
      sum = sum.add(s.multiply(Binomial.binomial(mN - d + 1, d)));
    }
    return sum;
  }
}
