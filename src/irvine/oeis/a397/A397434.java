package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397434 allocated for Tanguy Gautier Lo\u00efc Le Mer.
 * @author Sean A. Irvine
 */
public class A397434 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = (mN + 1) / 2;
    Z sum = Z.ZERO;
    for (long d = 1; d <= mN; ++d) {
      long s = 0;
      for (long k = 0; k < t; ++k) {
        s ^= Binomial.binomial(d, k, 2);
      }
      if (s == 1) {
        sum = sum.add(Binomial.binomial(mN, d));
      }
    }
    return sum;
  }
}
