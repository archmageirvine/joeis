package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396279 allocated for Sajid Hussain.
 * @author Sean A. Irvine
 */
public class A396279 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.nextPrime(++mN) - mN == LongUtils.floorLog2(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

