package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397456 allocated for Dieter Renz.
 * @author Sean A. Irvine
 */
public class A397456 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mLimit = 1;

  protected long base() {
    return 10;
  }

  @Override
  public Z next() {
    long count = 0;
    mLimit *= base();
    while (mP < mLimit) {
      final long t = mPrime.nextPrime(mP);
      if (t < mLimit && t - mP == 6) {
        ++count;
      }
      mP = t;
    }
    return Z.valueOf(count);
  }
}
