package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401894 allocated for Marko Radulovic.
 * @author Sean A. Irvine
 */
public class A401894 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; k += 2) {
      final long m = mN / Functions.GCD.l(k, mN);
      for (long j = 2; j <= m; j += 2) {
        if (k <= mN / Functions.GCD.l(j, mN)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
