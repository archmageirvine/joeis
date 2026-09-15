package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399741 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399741 extends Sequence1 {

  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ZERO;
      return Z.TWO;
    }
    if (mSum.isZero()) {
      mSum = Z.FOUR;
      return Z.FOUR;
    }
    mSum = mSum.add(Functions.GPF.z(mSum).add(Functions.LPF.z(mSum)));
    return mSum;
  }
}
