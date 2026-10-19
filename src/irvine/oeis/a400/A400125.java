package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400125 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A400125 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long m = mN * (mN + 1);
    final long m1 = (mN + 1) * (mN + 2);
    long cnt = 0;
    for (long k = 2; 2 * k < mN; ++k) {
      if (m % k == 0 && m1 % (k + 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
