package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a191.A191232;

/**
 * A399861 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399861 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private final Sequence mS = new A191232();

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = mS.next().isZero() ? mB.subtract(mA) : mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
