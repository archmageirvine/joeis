package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402180 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A402180 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(Functions.BIG_OMEGA.z(++mN).add(Functions.OMEGA.l(mN)), Functions.OMEGA.l(mN)).subtract(Functions.SIGMA0.z(mN));
  }
}
