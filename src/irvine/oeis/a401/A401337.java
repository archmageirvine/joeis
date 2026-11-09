package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401337 Absolute difference between the number of primes in the left half and the right half of the interval [prime(n)^2, prime(n+1)^2].
 * @author Sean A. Irvine
 */
public class A401337 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z lo = mP.square();
    final Z hi = mPrime.nextPrime(mP).square();
    final Z mid = hi.add(lo);
    long cnt = 0;
    Z q = mPrime.nextPrime(lo);
    while (q.multiply2().compareTo(mid) < 0) {
      ++cnt;
      q = mPrime.nextPrime(q);
    }
    if (q.multiply2().equals(mid)) {
      q = mPrime.nextPrime(q);
    }
    while (q.compareTo(hi) < 0) {
      --cnt;
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(Math.abs(cnt));
  }
}
