package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398721 Number of increasing 3-term arithmetic progressions in an n^4 hypercube.
 * @author Sean A. Irvine
 */
public class A398721 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z x = Z.valueOf(mN / 2);
    final Z y = Z.valueOf((mN + 1) / 2);
    return x.square().add(y.square()).pow(4).subtract(Z.valueOf(mN).pow(4)).divide2();
  }
}
