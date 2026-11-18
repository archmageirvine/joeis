package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401848 Trajectory of 30 under the map x -&gt; x^(omega(x)-1) + 1, where omega(x) is the number of distinct prime divisors of x.
 * @author Sean A. Irvine
 */
public class A401848 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(30) : mA.pow(Functions.OMEGA.l(mA) - 1).add(1);
    return mA;
  }
}
