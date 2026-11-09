package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401524 Subword complexity (number of distinct blocks of length n) of A400826.
 * @author Sean A. Irvine
 */
public class A401524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return mN == 1 ? Z.THREE : mN == 2 ? Z.SEVEN : Z.valueOf(11);
    }
    final long m = Long.highestOneBit(mN);
    final long q = mN & (m - 1);
    if (q == 0) {
      return Z.valueOf(m << 2);
    }
    if (q < m >>> 1) {
      return Z.valueOf((m << 2) + 5 * q + 1);
    }
    return Z.valueOf(5 * m + 3 * q - 1);
  }
}
