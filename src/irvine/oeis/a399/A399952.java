package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030190;

/**
 * A399952 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399952 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private final Sequence mS = new A030190();

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mS.next().isZero() ? mB.subtract(mA) : mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
