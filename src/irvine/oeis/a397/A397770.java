package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007602;

/**
 * A397770 Number of n-digit Zuckerman numbers.
 * @author Sean A. Irvine
 */
public class A397770 extends Sequence1 {

  private final Sequence mS = new A007602();
  private Z mA = mS.next();
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long cnt = 0;
    while (mA.compareTo(mLim) < 0) {
      ++cnt;
      mA = mS.next();
    }
    return Z.valueOf(cnt);
  }
}
