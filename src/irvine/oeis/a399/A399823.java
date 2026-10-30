package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a077.A077800;

/**
 * A399823 For n&gt;=1, a(n) is the least twin prime that starts a block of 2*n - 1 consecutive terms of A077800 having a twin-prime sum.
 * @author Sean A. Irvine
 */
public class A399823 extends Sequence1 {

  private int mN = -1;
  private final DirectSequence mTwinPrimes = DirectSequence.create(new A077800());

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    // Initial run up
    long k = 1;
    while (k <= mN) {
      sum = sum.add(mTwinPrimes.a(k++));
    }
    while (!sum.isProbablePrime() || (!sum.add(2).isProbablePrime() && !sum.subtract(2).isProbablePrime())) {
      sum = sum.subtract(mTwinPrimes.a(k - mN)).add(mTwinPrimes.a(k++));
    }
    return mTwinPrimes.a(k - mN);
  }
}
