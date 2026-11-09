package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399819 Number of primes in the n-th maximal cluster of primes with consecutive gaps at most 8.
 * @author Sean A. Irvine
 */
public class A399819 extends Sequence1 {

  private Z mP = Z.TWO;
  private long mCount = 0;

  @Override
  public Z next() {
    while (true) {
      final Z q = Functions.NEXT_PRIME.z(mP);
      ++mCount;
      if (q.subtract(mP).compareTo(Z.EIGHT) > 0) {
        final long res = mCount;
        mCount = 0;
        mP = q;
        return Z.valueOf(res);
      }
      mP = q;
    }
  }
}
