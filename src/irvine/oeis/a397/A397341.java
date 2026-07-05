package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397341 a(1) = 1; for n &gt; 1, a(n) is the concatenation of a(n-1) and the smallest prime p such that the concatenation a(n-1) | p is prime.
 * @author Sean A. Irvine
 */
public class A397341 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = mA.multiply(10);
    long p = 2;
    long lim = 10;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p >= lim) {
        mA = mA.multiply(10);
        lim *= 10;
      }
      final Z t = mA.add(p);
      if (t.isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}
