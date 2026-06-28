package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A397047 a(n) is the number of n-digit terms in A397046.
 * @author Sean A. Irvine
 */
public class A397047 extends Sequence1 {

  private final Sequence mS = new A397046();
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
