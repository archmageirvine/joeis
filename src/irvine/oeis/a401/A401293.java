package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a027.A027556;

/**
 * A401293 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A401293 extends Sequence0 {

  private final Sequence mS = new A027556();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = mS.next().add(mB.multiply2()).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
