package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a046.A046315;

/**
 * A398488 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A398488 extends A046315 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    long cnt = 0;
    Z p = mPrime.nextPrime(t);
    while (p.compareTo(mA) < 0) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}
