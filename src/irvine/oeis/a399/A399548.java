package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399548 Number of shortest lattice paths starting at (0,0) and ending at (x,y) with x,y&gt;=0, x^2+y^2&lt;=n^2, (x+1)^2+y^2&gt;n^2 and x^2+(y+1)^2&gt;n^2.
 * @author Sean A. Irvine
 */
public class A399548 extends Sequence0 {

  private long mN = -1;

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
    return sum;
  }
}

