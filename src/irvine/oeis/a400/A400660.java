package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400660 Number of bases b in range 2 &lt;= b &lt;= prime(n) in which prime(n) is a two-sided truncatable prime.
 * @author Sean A. Irvine
 */
public class A400660 extends A000040 {

  private boolean is(final long p, final long b) {
    long q = p / b;
    long r = p % b;
    long s = 1;
    while (q != 0) {
      if (!Predicates.PRIME.is(q) || !Predicates.PRIME.is(r)) {
        return false;
      }
      if (q % b == 0 && q >= b) {
        return false;
      }
      s *= b;
      r += s * (q % b);
      q /= b;
    }
    return true;
  }

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long b = 2; b <= p; ++b) {
      if (is(p, b)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

