package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398906 Maximum number of painted tiles in a hexagonal grid of side length n+1 such that no two painted tiles touch and all unpainted tiles form a contiguous area.
 * @author Sean A. Irvine
 */
public class A398906 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.SEVEN;
    }
    switch ((int) (mN % 3)) {
      case 0:
        return Z.valueOf(mN).multiply(mN + 1).add(1);
      case 1:
        final long k1 = mN / 3;
        return Z.valueOf(k1).multiply(3).add(3).multiply(k1).add(1).multiply(3);
      default: // 2
        final long k2 = mN / 3;
        return Z.valueOf(k2).multiply(3).add(5).multiply(k2).add(2).multiply(3);
    }
  }
}
