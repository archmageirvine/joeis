package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001358;

/**
 * A401644 Sum of semiprimes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A401644 extends Sequence0 {

  private final Sequence mSemiprimes = new A001358();
  private Z mA = mSemiprimes.next();
  private Z mT = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    while (mA.compareTo(mT) < 0) {
      mSum = mSum.add(mA);
      mA = mSemiprimes.next();
    }
    return mSum;
  }
}
