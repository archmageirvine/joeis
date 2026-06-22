package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396934 Number of pairs (i,j) with 0 &lt;= i,j &lt; 2^n, i AND j = 0, and gcd(i,j) = 1.
 * @author Sean A. Irvine
 */
public class A396934 extends Sequence0 {

  // After Michael S. Branicky

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long b1 = 1L << (mN - 1);
    final long b2 = 1L << mN;
    long cnt = 0;
    for (long k = 0; k < b1; ++k) {
      for (long j = k + 1; j < b2; j += 2) {
        if ((k & j) == 0 && Functions.GCD.l(k, j) == 1) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt).multiply2();
  }
}
