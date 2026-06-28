package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A397051 a(n) is the number of n-digit terms in A397050.
 * @author Sean A. Irvine
 */
public class A397051 extends Sequence1 {

  private final Sequence mS = new A397050();
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
