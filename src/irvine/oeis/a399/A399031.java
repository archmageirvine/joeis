package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399031 allocated for Sylvain Geffroy.
 * @author Sean A. Irvine
 */
public class A399031 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisors());
    for (long k = 1, m = mN + 1; k <= mN; ++k, ++m) {
      for (long v : d) {
        if (v != 1 && v != mN && m % (v + k) == 0) {
          return Z.valueOf(k);
        }
      }
    }
    return Z.ZERO;
  }
}

