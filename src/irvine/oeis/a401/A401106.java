package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401106 Number of unordered representations of 2^n as a sum of two distinct positive integers, each an odd composite number multiplied by a power of 2.
 * @author Sean A. Irvine
 */
public class A401106 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final long t = 1L << mN;
    long cnt = 0;
    for (long c = 9; 2 * c < t; c += 2) {
      if (!mPrime.isPrime(c)) {
        for (long s = c; s < t; s <<= 1) {
          final long u = Functions.MAKE_ODD.l(t - s);
          if (u > c && !mPrime.isPrime(u)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
