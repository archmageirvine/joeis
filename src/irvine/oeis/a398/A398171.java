package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A398171 allocated for Eric Hogle.
 * @author Sean A. Irvine
 */
public class A398171 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long[] divs = ZUtils.toLong(Jaguar.factor(++mN).divisors());
    for (long k = 1; k <= mN; ++k) {
      long c = 0;
      for (final long d : divs) {
        if (k <= d && Functions.GCD.l(k, d) == 1 && ++c > 1) {
          break;
        }
      }
      if (c == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

