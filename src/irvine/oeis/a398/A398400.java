package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A398400 a(n) is the least k such that the concatenation of prime(n+1), prime(n+2),..., prime(n+k) is a multiple of prime(n) or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A398400 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    Z q = p;
    long k = 0;
    do {
      q = mPrime.nextPrime(q);
      sb.append(q);
      ++k;
    } while (!new Z(sb).mod(p).isZero());
    return Z.valueOf(k);
  }
}
