package irvine.oeis.a402;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402652 allocated for Gnouma Jerome Kadouno.
 * @author Sean A. Irvine
 */
public class A402652 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      long prod = 1;
      for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
        prod *= q - 1;
        prod %= mP;
      }
      if (prod == 1) {
        return Z.valueOf(mP);
      }
    }
  }
}
