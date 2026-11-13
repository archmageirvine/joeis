package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401617 Maximum number of consecutive equal digits of n in any base &gt;= 2.
 * @author Sean A. Irvine
 */
public class A401617 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long max = 0;
    for (long b = 2; b < Math.max(3, mN); ++b) {
      long m = mN;
      long r = -1;
      long c = 0;
      while (m != 0) {
        final long q = m % b;
        if (q == r) {
          ++c;
        } else {
          if (c > max) {
            max = c;
          }
          c = 1;
          r = q;
        }
        m /= b;
      }
      if (c > max) {
        max = c;
      }
    }
    return Z.valueOf(max);
  }
}
