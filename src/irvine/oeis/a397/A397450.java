package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A086214 Primes of the form 3^p-2 where p is prime.
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
