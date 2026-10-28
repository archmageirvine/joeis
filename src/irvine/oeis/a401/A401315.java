package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a025.A025487;

/**
 * A401315 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A401315 extends Sequence0 {

  private final Sequence mS = new A025487();
  private Z mLim = null;
  private Z mA = mS.next();
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    while (mA.compareTo(mLim) <= 0) {
      mA = mS.next();
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}

