package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397687 a(n) is the least k &gt;= 1 such that Sum_{i = 0..n} A000005(k + i) / (n + 1) is an integer.
 * @author Sean A. Irvine
 */
public class A397687 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z sum = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      sum = sum.add(Functions.SIGMA0.z(j));
    }
    while (true) {
      sum = sum.subtract(Functions.SIGMA0.z(k)).add(Functions.SIGMA0.z(mN + ++k));
      if (sum.mod(mN + 1) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
