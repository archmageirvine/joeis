package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397208 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A397208 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    final long lim = (p - 3) / 4;
    for (long k = 0; k <= lim; ++k) {
      final long q = p - 2 - 4 * k;
      if (mPrime.isPrime(q) && mPrime.isPrime((p + q) / 4)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
