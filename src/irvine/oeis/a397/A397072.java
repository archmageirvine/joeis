package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397072 a(n) is the first prime p such that the concatenation of the last digits of n consecutive primes starting with p is prime.
 * @author Sean A. Irvine
 */
public class A397072 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      Z t = Z.ZERO;
      long q = p;
      for (int k = 0; k < mN; ++k) {
        t = t.multiply(10).add(q % 10);
        q = mPrime.nextPrime(q);
      }
      if (t.isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
