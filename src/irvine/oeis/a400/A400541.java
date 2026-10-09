package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400541 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A400541 extends Sequence2 {

  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long k = 2; 2 * k <= mN; ++k) {
      if (Functions.LIOUVILLE_LAMBDA.i(k) == -1 && Functions.LIOUVILLE_LAMBDA.i(mN - k) == -1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
