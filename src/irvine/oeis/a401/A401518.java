package irvine.oeis.a401;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007521;

/**
 * A401518 a(n) = t(p) = (A_1 - A_3)/p, where p = A007521(n) and A_j is the sum of the elements of the j-th coset of the fourth powers mod p, the quartic character being normalized by chi_4(2) = i.
 * @author Sean A. Irvine
 */
public class A401518 extends Sequence2 {

  private final Sequence mA = new A007521().skip();

  @Override
  public Z next() {
    final long p = mA.next().longValueExact();
    final long e = (p - 1) / 4;
    final long ip = LongUtils.modPow(2, e, p);
    final long ip3 = LongUtils.modPow(ip, 3, p);
    Z sum = Z.ZERO;
    for (long n = 1; n < p; ++n) {
      final long b = LongUtils.modPow(n, e, p);
      if (b == ip) {
        sum = sum.add(n);
      }
      if (b == ip3) {
        sum = sum.subtract(n);
      }
    }
    return sum.divide(p);
  }
}
