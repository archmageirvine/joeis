package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A398032 Consider a prime number prime(i) with k digits (d_1, d_2, ..., d_k), where d_k is the units digit. Consider the k preceding prime numbers prime(i-1), prime(i-2), ..., prime(i-k) and the numbers obtained by concatenating [d_1, prime(i-1)], [d_2, prime(i-2)], ..., [d_k, prime(i-k)]. If the latter are all prime, then prime(i) belongs to the sequence.
 * @author Sean A. Irvine
 */
public class A398032 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    Z q = p;
    for (int k = 0; k < s.length(); ++k) {
      q = mPrime.prevPrime(q);
      if (q.compareTo(Z.TWO) < 0 || (s.charAt(k) != '0' && !new Z(s.charAt(k) + q.toString()).isProbablePrime())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
