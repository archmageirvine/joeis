package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399548 allocated for Gerhard Kirchner.
 * @author Sean A. Irvine
 */
public class A399548 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CR r = CR.valueOf(mN).divide(CR.SQRT2);
    final long k = r.floor().longValueExact();
    Z sum = Z.ZERO;
    for (long x = k + 1; x <= mN; ++x) {
      final long y = Functions.SQRT.l(mN * mN  - x * x);
      sum = sum.add(Binomial.binomial(x + y, y));
    }
    sum = sum.multiply2().add(Binomial.binomial(2 * k, k).multiply(1 - r.multiply(2).floor().mod(2)));
    return sum.multiply(4).subtract(4);
  }
}

