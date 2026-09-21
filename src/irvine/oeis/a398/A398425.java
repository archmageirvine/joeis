package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007769;

/**
 * A398425 Number of regular (rotationally asymmetric) orbits of chord diagrams on 2n vertices under the action of the cyclic group C_(2n).
 * @author Sean A. Irvine
 */
public class A398425 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Integers.SINGLETON.sumdiv(mN, q -> A007769.alpha(mN / q.intValue(), Z.valueOf(q)).multiply(Functions.MOBIUS.l(q))).divide(mN);
  }
}
