package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401759 allocated for Henry E. Rodr\u00edguez Vargas.
 * @author Sean A. Irvine
 */
public class A401759 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    for (long p = mPrime.prevPrime(mN + 1), k = 1; p > 1; p = mPrime.prevPrime(p), ++k) {
      if (mPrime.isPrime(2 * mN - p)) {
        return Z.valueOf(k);
      }
    }
    throw new RuntimeException(); // Goldbach conjecture would be false
  }
}

