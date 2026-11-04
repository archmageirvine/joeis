package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401438 allocated for Leo Zhang.
 * @author Sean A. Irvine
 */
public class A401438 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = mPrime.nextPrime((mN + 1) / 2 - 1); p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(Binomial.binomial(p, mN - p));
    }
    return sum;
  }
}

