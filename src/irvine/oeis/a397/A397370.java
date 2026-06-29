package irvine.oeis.a397;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397370 allocated for Alexander Willis.
 * @author Sean A. Irvine
 */
public class A397370 extends Sequence1 {

  private long mN = 4641;
  private long mMod = 10000;

  private boolean is(final long k) {
    if (k % 10 == 0) {
      return false;
    }
    final long rev = Functions.REVERSE.l(k);
    if (rev == k) {
      return false;
    }
    return LongUtils.modPow(k, k, mMod) == rev;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mMod) {
        mMod *= 10;
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}
