package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401106 allocated for Ali Sada.
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
            if (t==128) {
              System.out.println(t + " = 2^" + Z.valueOf(s).makeOdd().auxiliary() + "*" + c + " + 2^" + Z.valueOf(t - s).makeOdd().auxiliary() + "*" + u);
            }
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
