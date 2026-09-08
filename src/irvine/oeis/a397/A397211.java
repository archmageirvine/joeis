package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397211 Least index of the start of a run of at least n nonnegative values of the Moebius function.
 * @author Sean A. Irvine
 */
public class A397211 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private long mR = 0;

  @Override
  public Z next() {
    ++mN;
    while (mR < mN) {
      while (Functions.MOBIUS.i(mM) < 0) {
        ++mM;
      }
      mR = 1;
      while (Functions.MOBIUS.i(++mM) >= 0) {
        ++mR;
      }
    }
    return Z.valueOf(mM - mR);
  }
}

