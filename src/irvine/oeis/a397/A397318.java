package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A397318 allocated for Eric Hogle.
 * @author Sean A. Irvine
 */
public class A397318 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long[] divs = ZUtils.toLong(Jaguar.factor(++mN).divisors());
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      long c = 0;
      for (final long d : divs) {
        if (k <= d && Functions.GCD.l(k, d) == 1 && ++c > 2) {
          break;
        }
      }
      if (c == 2) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
