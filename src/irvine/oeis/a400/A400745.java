package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400745 Number of primes p &lt;= 10^n whose trajectory under the map p -&gt; prime(A007953(p)) ends in the cycle (3, 5, 11).
 * @author Sean A. Irvine
 */
public class A400745 extends Sequence1 {

  private long mP = 2;
  private long mLim = 1;
  private long mCount = 0;

  private boolean is(long p) {
    while (true) {
      if (p == 3 || p == 11) {
        return true;
      }
      if (p == 7 || p == 17 || p == 19 || p == 29 || p == 31) {
        return false;
      }
      p = Functions.PRIME.l(Functions.DIGIT_SUM.l(p));
    }
  }

  @Override
  public Z next() {
    mLim *= 10;
    while (mP <= mLim) {
      if (is(mP)) {
        ++mCount;
      }
      mP = Functions.NEXT_PRIME.l(mP);
    }
    return Z.valueOf(mCount);
  }
}
