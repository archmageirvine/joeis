package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401980 allocated for Leo Zhang.
 * @author Sean A. Irvine
 */
public class A401980 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    for (long d = 1; 2 *d <= mN; ++d) {
      final long t = Functions.PRIME_PI.l(mN - 2 * d);
      if (t != 0) {
        sum = sum.add(Binomial.binomial(d + t - 1, d));
      }
    }
    return sum;
  }
}

