package irvine.oeis.a400;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400526 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A400526 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      Z sum = Z.ONE;
      for (long k = 2; k <= mN; ++k) {
        final Z kz = Z.valueOf(k);
        final Z e = kz.pow(kz.pow(k));
        sum = sum.add(kz.modPow(e, p));
      }
      if (sum.mod(p).isZero()) {
        return p;
      }
    }
  }
}
