package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396363 Numbers k &gt;= 1 for which a record number of trailing digits in 2 different bases are equal.
 * @author Sean A. Irvine
 */
public class A396363 extends Sequence1 {

  private int mR = -1;
  private long mN = 0;

  private int count(final long n, final long b1, final long b2) {
    // b2 < b1
    int cnt = 0;
    long m1 = n;
    long m2 = n;
    while (m1 != 0) {
      if (m1 % b1 != m2 % b2) {
        return cnt;
      }
      m1 /= b1;
      m2 /= b2;
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long b1 = 2;
      while (true) {
        ++b1;
        if (Functions.DIGIT_LENGTH.i(b1, mN) <= mR) {
          break;
        }
        for (long b2 = 2; b2 < b1; ++b2) {
          final int cnt = count(mN, b1, b2);
          if (cnt > mR) {
            mR = cnt;
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
