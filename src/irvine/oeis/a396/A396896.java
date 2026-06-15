package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396896 a(n) is the first prime p &gt; n such that the concatenation of p - n and p is prime.
 * @author Sean A. Irvine
 */
public class A396896 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (new Z(String.valueOf(p - mN) + p).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
