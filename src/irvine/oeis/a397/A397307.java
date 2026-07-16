package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397307 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A397307 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 2; k < mN; k <<= 1) {
      if (mPrime.isPrime(mN - k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
