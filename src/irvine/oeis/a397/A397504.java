package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397504 a(n) is the first prime p such that the concatenations, both in forward and reverse orders, of the last digits of n consecutive primes starting with p are primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A397504 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final StringBuilder sb = new StringBuilder();
      long q = p;
      for (int k = 0; k < mN; ++k) {
        sb.append(q % 10);
        q = mPrime.nextPrime(q);
      }
      if (new Z(sb).isProbablePrime() && new Z(sb.reverse()).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
