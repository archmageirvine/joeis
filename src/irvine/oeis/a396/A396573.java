package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396573 Primes p such that the gap to the next prime is strictly less than floor(log_2(p)).
 * @author Sean A. Irvine
 */
public class A396573 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).compareTo(q.bitLength() - 1) < 0) {
        return p;
      }
    }
  }
}

