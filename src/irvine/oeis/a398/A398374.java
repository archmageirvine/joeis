package irvine.oeis.a398;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398374 allocated for Alexander Krivilev.
 * @author Sean A. Irvine
 */
public class A398374 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN - (1L << LongUtils.ceilLog2(mN)));
    }
    return mA;
  }
}
