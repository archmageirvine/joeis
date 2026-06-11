package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394095 Number of convex sets satisfying the condition.
 * @author Sean A. Irvine
 */
public class A396768 extends Sequence1 {

  // After Felix Huber

  private final Fast mPrime = new Fast();
  private long mP = 1;

  private boolean is(final long x, final long y) {
    if (x == 2) {
      return false;
    }
    if ((x & 3) == 3 && (y & 3) == 3) {
      return false;
    }
    if (((x - y) & 7) == 4) {
      return false;
    }
    final long l = (Math.max(2, Math.abs(x - y) + 1) + 1) & ~1;
    final long u = x + y - 1;
    for (long k = l; k <= u; k += 2) {
      final long s = (x + y + k) / 2;
      final long v = (x + y - k) / 2;
      final long r = (y - x + k) / 2;
      final long t = (x - y + k) / 2;
      if (Predicates.SQUARE.is(Z.valueOf(s).multiply(v).multiply(r).multiply(t))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    for (long q = 3; q < mP; q = mPrime.nextPrime(q)) {
      if (is(q, mP)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
