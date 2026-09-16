package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399791 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399791 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long r = mN % 18;
    if (r != 0 && r != 2 && r != 3 && r != 6 && r != 9 && r != 12 && r != 15) {
      return Z.ZERO;
    }
    long cnt = 0;
    long k = 0;
    while (++k <= Functions.DIGIT_LENGTH.l(k) * 9 * mN - mN) {
      if (Functions.DIGIT_SUM.l(Z.valueOf(k).pow(mN)) == k + mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
