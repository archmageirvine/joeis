package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401358 Irregular triangle read by rows: row n lists the arithmetic means of the outermost pairs of primes in the interval [prime(n)^2, prime(n+1)^2].
 * @author Sean A. Irvine
 */
public class A401358 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;
  private Z mR = Z.ONE;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    mR = mPrime.prevPrime(mR);
    if (mQ.compareTo(mR) > 0) {
      // Row was completed start new row
      mP = mPrime.nextPrime(mP);
      mQ = mPrime.nextPrime(mP.square());
      mR = mPrime.prevPrime(mPrime.nextPrime(mP).square());
    }
    return mQ.add(mR).divide2();
  }
}
