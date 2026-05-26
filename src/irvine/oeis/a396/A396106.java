package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396106 n-th prime greater than 10^n.
 * @author Sean A. Irvine
 */
public class A396106 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(10);
    Z p = mA;
    for (int k = 0; k < mN; ++k) {
      p = mPrime.nextPrime(p);
    }
    return p;
  }
}
