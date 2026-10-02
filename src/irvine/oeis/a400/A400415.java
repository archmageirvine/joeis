package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400415 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A400415 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(2 * ++mN).subtract(Functions.SIGMA1.z(mN));
    return t.divide(Functions.GCD.z(Functions.SIGMA0.z(mN), t));
  }
}
