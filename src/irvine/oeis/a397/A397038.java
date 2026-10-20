package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397038 Sum of the quotients floor(k/n) over the distinct entries k of the n X n multiplication table.
 * @author Sean A. Irvine
 */
public class A397038 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> s = new HashSet<>();
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        s.add(j * k);
      }
    }
    Z sum = Z.ZERO;
    for (final long v : s) {
      sum = sum.add(v / mN);
    }
    return sum;
  }
}

