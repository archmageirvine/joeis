package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397878 Number of integers of the form r^k (0 &lt; r &lt; n, k &gt; 0) whose base-n alternating digital root is r and whose number of base-n digits is k.
 * @author Sean A. Irvine
 */
public class A397878 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 1; r < mN; ++r) {
      long k = 1;
      while (true) {
        final Z m = Z.valueOf(r).pow(k);
        final long l = Functions.DIGIT_LENGTH.l(mN, m);
        if (l < k) {
          break;
        }
        if (m.mod(mN + 1) == r) {
          ++cnt;
        }
        ++k;
      }
    }
    return Z.valueOf(cnt);
  }
}
