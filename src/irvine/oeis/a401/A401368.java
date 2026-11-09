package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401368 Number of ways to write 2n as p + q with p a twin prime and q a cousin prime.
 * @author Sean A. Irvine
 */
public class A401368 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long p = 3; p < mN; p = mPrime.nextPrime(p)) {
      final long q = mN - p;
      if (mPrime.isPrime(q) && (mPrime.isPrime(p - 2) || mPrime.isPrime(p + 2)) && (mPrime.isPrime(q - 4) || mPrime.isPrime(q + 4))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
