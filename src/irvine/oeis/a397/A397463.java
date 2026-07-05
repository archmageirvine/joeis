package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397463 Smallest prime greater than or equal to (prime(n)^2 + prime(n+1)^2)/2.
 * @author Sean A. Irvine
 */
public class A397463 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p.square().add(mPrime.nextPrime(p).square()).divide2().subtract(1));
  }
}
