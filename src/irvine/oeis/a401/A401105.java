package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401105 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A401105 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final long t = 1L << mN;
    long cnt = 0;
    for (long p = 3; 2 * p < t; p = mPrime.nextPrime(p)) {
      for (long s = p; s < t; s <<= 1) {
        final long u = Functions.MAKE_ODD.l(t - s);
        if (u > p && mPrime.isPrime(u)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
