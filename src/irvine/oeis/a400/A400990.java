package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A400990 allocated for Zhao Hui Du.
 * @author Sean A. Irvine
 */
public class A400990 extends Sequence1 {

  private final Sequence mS = new A400989().skip();
  private Z mLim = Z.ONE;
  private Z mA = mS.next();

  @Override
  public Z next() {
    long cnt = 0;
    mLim = mLim.multiply(17);
    while (mA.compareTo(mLim) < 0) {
      ++cnt;
      mA = mS.next();
    }
    return Z.valueOf(cnt);
  }
}
