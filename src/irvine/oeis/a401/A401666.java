package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401666 Sum of n-bit primes whose binary expansion has a single circular run of 1s and at most one internal block of 0s.
 * @author Sean A. Irvine
 */
public class A401666 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z t0 = Z.ONE.shiftLeft(mN).subtract(1);
    Z sum = t0.isProbablePrime() ? t0 : Z.ZERO;
    for (long k = 1; k < mN - 1; ++k) {
      for (long s = 1; s < mN - k; ++s) {
        final Z t = t0.subtract(Z.ONE.shiftLeft(k).subtract(1).shiftLeft(s));
        if (t.isProbablePrime()) {
          sum = sum.add(t);
        }
      }
    }
    return sum;
  }
}
