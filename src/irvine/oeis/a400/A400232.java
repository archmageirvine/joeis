package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400232 a(n) is the number of boundary lattice points minus the number of interior lattice points of the cube [0,n] X [0,n] X [0,n].
 * @author Sean A. Irvine
 */
public class A400232 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(9).multiply(mN).add(3).multiply(mN).subtract(3).negate();
  }
}

