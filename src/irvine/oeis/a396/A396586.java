package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A396586 allocated for Marko Riedel.
 * @author Sean A. Irvine
 */
public class A396586 extends A006842 {

  private long mN = 0;

  @Override
  public Z next() {
    step();
    Q sum = Q.ZERO;
    for (final Q v : mTerms) {
      sum = sum.add(v.square());
    }
    return sum.multiply(6).multiply(Functions.FACTORIAL.z(++mN)).toZ();
  }
}
