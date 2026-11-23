package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401896 Span of the n-th maximal cluster of primes with consecutive gaps at most 6.
 * @author Sean A. Irvine
 */
public class A401896 extends A000040 {

  private Z mStart = super.next();

  @Override
  public Z next() {
    Z p = mStart;
    while (true) {
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).compareTo(Z.SIX) > 0) {
        final Z res = p.subtract(mStart);
        mStart = q;
        return res;
      }
      p = q;
    }
  }
}
