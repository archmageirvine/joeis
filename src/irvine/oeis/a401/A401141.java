package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001097;

/**
 * A401141 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A401141 extends Sequence1 {

  private final DirectSequence mTwins = DirectSequence.create(new A001097());
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    Z sum = Z.ZERO;
    // initial run up
    while (++k <= mN) {
      sum = sum.add(mTwins.a(k));
    }
    while (true) {
      if (sum.isProbablePrime() && (sum.subtract(2).isProbablePrime() || sum.add(2).isProbablePrime())) {
        return mTwins.a(k - mN);
      }
      sum = sum.subtract(mTwins.a(k - mN)).add(mTwins.a(k++));
    }
  }
}

