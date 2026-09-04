package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399440 Number of pairs (d, e) of divisors of n with d &lt; e &lt; 2*d.
 * @author Sean A. Irvine
 */
public class A399440 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisorsSorted());
    long cnt = 0;
    for (int k = 0; k < d.length; ++k) {
      for (int j = k + 1; j < d.length && d[j] < 2 * d[k]; ++j) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

