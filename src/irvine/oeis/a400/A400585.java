package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400585 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A400585 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (((mN / d) & 1) == 1) {
        sum = sum.add(Binomial.binomial(d, 2));
      }
    }
    return sum;
  }
}
