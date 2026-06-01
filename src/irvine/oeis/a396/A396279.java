package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396279 Integers k such that p - k = floor(log_2(k)), where p is the smallest prime strictly greater than k.
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

