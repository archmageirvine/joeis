package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400233 a(n) is the number of boundary lattice points minus the number of interior lattice points of the 4-dimensional cube [0,n]^4.
 * @author Sean A. Irvine
 */
public class A400233 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(12).multiply(mN).add(6).multiply(mN).subtract(12).multiply(mN).add(1).negate();
  }
}
