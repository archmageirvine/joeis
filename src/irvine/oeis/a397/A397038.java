package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397038 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A397038 extends Sequence0 {

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

