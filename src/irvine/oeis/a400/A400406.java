package irvine.oeis.a400;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400406 allocated for Leo Zhang.
 * @author Sean A. Irvine
 */
public class A400406 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; 2 * p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(Binomial.binomial(mN - p, p));
    }
    return sum;
  }
}

