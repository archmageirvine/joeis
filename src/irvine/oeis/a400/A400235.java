package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400235 a(n) is the number of boundary lattice points minus the number of interior lattice points of the prism with vertices (0,0,0), (n,0,0), (0,n,0), (0,0,n), (n,0,n) and (0,n,n).
 * @author Sean A. Irvine
 */
public class A400235 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(12).multiply(mN).add(5).multiply(mN).subtract(6).divide2().negate();
  }
}
