package irvine.oeis.a397;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A397786 T(n,k) is the number of positive integers x such that there are exactly k divisors d of n with x&lt;=d and gcd(x,d)=1, 1 &lt;= k &lt;= A000005(n), read by rows.
 * @author Sean A. Irvine
 */
public class A397786 extends Sequence1 {

  private final LinkedList<Z> mRow = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mRow.isEmpty()) {
      final long[] divs = ZUtils.toLong(Jaguar.factor(++mN).divisors());
      final long[] v = new long[Functions.SIGMA0.i(mN)];
      for (long j = 1; j <= mN; ++j) {
        int k = 0;
        for (final long d : divs) {
          if (j <= d && Functions.GCD.l(d, j) == 1) {
            ++k;
          }
        }
        if (k > 0) {
          ++v[k - 1];
        }
      }
      for (final long u : v) {
        mRow.add(Z.valueOf(u));
      }
    }
    return mRow.pollFirst();
  }
}
