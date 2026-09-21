package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398559 a(n) = n^4 - 99*n^3 + 3441*n^2 - 49259*n + 247889, for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A398559 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN - 99).multiply(mN).add(3441).multiply(mN).subtract(49259).multiply(mN).add(247889);
  }
}
