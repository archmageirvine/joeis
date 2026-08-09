package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A397450 a(n) is the number of positive integers &lt;= n that are the sum of 2 nonzero squares.
 * @author Sean A. Irvine
 */
public class A397450 extends A000404 {

  private long mA = super.next().longValueExact();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mA) {
      mCount = mCount.add(1);
      mA = super.next().longValueExact();
    }
    return mCount;
  }
}
