package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a065.A065357;

/**
 * A401674 a(n) = Sum_{k=1..n} k*(-1)^pi(k), where pi = A000720.
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
