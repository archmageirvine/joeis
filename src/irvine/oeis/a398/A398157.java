package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398157 a(n) = n/3 if n == 0 (mod 3), 4n+1 if n == 1 (mod 3), 2n-1 if n == 2 (mod 3).
 * @author Sean A. Irvine
 */
public class A398157 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        return Z.valueOf(mN / 3);
      case 1:
        return Z.valueOf(4 * mN + 1);
      default: // 2
        return Z.valueOf(2 * mN - 1);
    }
  }
}
