package irvine.oeis.a396;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396378 Smallest m belonging to {n, n+1, n+2, ..., n+A396377(n)} that divides the product of the other integers.
 * @author Sean A. Irvine
 */
public class A396378 extends Sequence1 {

  // After Michel Marcus

  private long mN = 0;

  static long is(final long k, final long n) {
    final Z prod = Integers.SINGLETON.product(n, n + k, Z::valueOf);
    for (long j = n; j <= n + k; ++j) {
      if (prod.mod(j * j) == 0) {
        return j - n + 1;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    long j;
    while ((j = is(k, mN)) == 0) {
      ++k;
    }
    return Z.valueOf(mN + j - 1);
  }
}
