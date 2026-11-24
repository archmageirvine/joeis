package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402276 Number of primes in the n-th maximal cluster of primes with consecutive gaps at most 10.
 * @author Sean A. Irvine
 */
public class A402276 extends Sequence1 {

  private Z mP = Z.TWO;
  private long mCount = 0;

  @Override
  public Z next() {
    while (true) {
      final Z q = Functions.NEXT_PRIME.z(mP);
      ++mCount;
      if (q.subtract(mP).compareTo(Z.TEN) > 0) {
        final long res = mCount;
        mCount = 0;
        mP = q;
        return Z.valueOf(res);
      }
      mP = q;
    }
  }
}
