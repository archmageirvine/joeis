package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398138 Sum of the remainders k mod n over the distinct entries k of the n X n multiplication table.
 * @author Sean A. Irvine
 */
public class A398138 extends Sequence0 {

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
      sum = sum.add(v % mN);
    }
    return sum;
  }
}

