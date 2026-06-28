package irvine.oeis.a397;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397276 Triangle read by rows: T(n,k) is the smallest prime p such that p^k in base n contains exactly k distinct digits, for 1 &lt;= k &lt;= n (n &gt;= 2), and T(1,1) = 2.
 * @author Sean A. Irvine
 */
public class A397276 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;

  private boolean is(final Z p, final long k, final long base) {
    Z pk = p.pow(k);
    final Set<Long> seen = new HashSet<>();
    while (!pk.isZero()) {
      final Z[] qr = pk.divideAndRemainder(base);
      seen.add(qr[1].longValue());
      if (seen.size() > k) {
        return false;
      }
      pk = qr[0];
    }
    return seen.size() == k;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 1) {
        return Z.TWO;
      }
      mM = 1;
    }
    Z p = Z.TWO;
    while (!is(p, mM, mN)) {
      p = mPrime.nextPrime(p);
    }
    return p;
  }
}
