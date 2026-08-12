package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A398350 Primes p that start a run of three consecutive primes in arithmetic progression (CPAP-3) such that the two primes immediately preceding p, or the two primes immediately following the run, form a twin prime pair.
 * @author Sean A. Irvine
 */
public class A398350 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      if (r.subtract(q).equals(q.subtract(p))) {
        final Z s = mPrime.nextPrime(r);
        if (s.add(2).isProbablePrime()) {
          return p;
        }
        final Z t = mPrime.prevPrime(p);
        if (t.subtract(2).isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
