package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398918 Number of primes p &lt;= 10^n having a Fibonacci primitive root.
 * @author Sean A. Irvine
 */
public class A398918 extends Sequence1 {

  private long mP = 2;
  private long mLim = 1;
  private long mCount = 0;

  private boolean is(final long p) {
    if (p == 5) {
      return true;
    }
    if (Functions.KRONECKER.l(5, p) != 1) {
      return false;
    }
    final Z zp = Z.valueOf(p);
    final Z s = Z.FIVE.modSqrt(zp);
    final Z i = Z.TWO.modInverse(zp);
    return Functions.ORDER.l(p, s.add(1).multiply(i)) == p - 1 || Functions.ORDER.l(p, Z.ONE.subtract(s).multiply(i)) == p - 1;
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
