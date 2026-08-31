package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398982 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A398982 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z s = Z.valueOf(2 * mN).subtract(Functions.SIGMA1.z(mN));
    return s.divide(Functions.GCD.z(s, Functions.SIGMA0.z(mN).subtract(2)));
  }
}
