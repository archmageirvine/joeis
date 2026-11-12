package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a065.A065357;

/**
 * A401674 allocated for Dirk Broeders.
 * @author Sean A. Irvine
 */
public class A401674 extends A065357 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().multiply(mN));
    return mSum;
  }
}
