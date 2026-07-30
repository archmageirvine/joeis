package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A398183 allocated for Soroosh Hemmati.
 * @author Sean A. Irvine
 */
public class A398183 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    boolean seen = false;
    long p = 2;
    while (p <= mN) {
      if (mPrime.isPrime(2 * mN - p)) {
        if (seen) {
          return Z.valueOf(p);
        }
        seen = true;
      }
      p = mPrime.nextPrime(p);
    }
    return Z.ZERO;
  }
}
