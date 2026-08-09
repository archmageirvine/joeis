package irvine.oeis.a398;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A398446 Number of permutations of [n] avoiding the pattern 1324 with the maximum element n in position n-2.
 * @author Sean A. Irvine
 */
public class A398446 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 6, mN - 3).multiply(mN).add(Z.ONE.shiftLeft(2 * mN - 6)).divide2();
  }
}
