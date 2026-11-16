package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401908 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A401908 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    long count = 0;
    while (true) {
      ++count;
      final long q = mPrime.nextPrime(mP);
      if (q - mP > 4) {
        mP = q;
        return Z.valueOf(count);
      }
      mP = q;
    }
  }
}
