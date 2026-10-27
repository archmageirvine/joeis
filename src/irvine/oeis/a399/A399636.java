package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399636 allocated for Nicolae Boicu.
 * @author Sean A. Irvine
 */
public class A399636 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex c = SymmetricGroup.create(mN).cycleIndex();
    final Q[] subs = new Q[mN + 1];
    subs[0] = Q.ONE;
    for (int k = 1; k < subs.length; ++k) {
      subs[k] = new Q(1, k);
    }
    return c.apply(subs).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
