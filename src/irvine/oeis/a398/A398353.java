package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398353 Least prime p such that n - p is semiprime or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A398353 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (p < mN) {
      if (Predicates.SEMIPRIME.is(mN - p)) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
    return Z.ZERO;
  }
}
