package irvine.oeis.a396;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A396380 Number of integers m in {n, n+1, n+2, ..., n+A396377(n)} so that m divides the product of the other integers.
 * @author Sean A. Irvine
 */
public class A396380 extends A396377 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long k = super.next().longValueExact();
    final Z prod = Integers.SINGLETON.product(mN, mN + k, Z::valueOf);
    long cnt = 0;
    for (long j = mN; j <= mN + k; ++j) {
      if (prod.divide(j).mod(j) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
