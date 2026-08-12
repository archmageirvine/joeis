package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398590 Number of distinct entries k of the n X n multiplication table such that k + n + 1 + floor((k-1)/n) is an entry of the (n+1) X (n+1) multiplication table.
 * @author Sean A. Irvine
 */
public class A398590 extends Sequence1 {

  private int mN = 0;

  private Set<Long> products(final long n) {
    final HashSet<Long> s = new HashSet<>();
    for (long k = 1; k <= n; ++k) {
      for (long j = k; j <= n; ++j) {
        s.add(k * j);
      }
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final Set<Long> p1 = products(mN + 1);
    for (final long k : products(mN)) {
      if (p1.contains(k + mN + 1 + (k - 1) / mN)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
