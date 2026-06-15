package irvine.oeis.a396;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396926 The smallest k for which the square of at least one integer among {n, n+1, ..., n+k} divides the sum of the remaining integers.
 * @author Sean A. Irvine
 */
public class A396926 extends Sequence1 {

  private long mN = 0;

  static long is(final long k, final long n) {
    final Z sum = Integers.SINGLETON.sum(n, n + k, Z::valueOf);
    for (long j = n; j <= n + k; ++j) {
      if (sum.subtract(j).mod(j * j) == 0) {
        return j - n + 1;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (is(k, mN) == 0) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
