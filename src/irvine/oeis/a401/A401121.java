package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.group.CyclicGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086891.
 * @author Sean A. Irvine
 */
public class A401121 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex c = new CyclicGroup(mN).cycleIndex();
    final Q[] subs = new Q[mN + 1];
    subs[0] = Q.ONE;
    for (int k = 1; k < subs.length; ++k) {
      subs[k] = new Q(1, k);
    }
    return c.apply(subs).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
