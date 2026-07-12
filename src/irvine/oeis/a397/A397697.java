package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a018.A018804;

/**
 * A392308.
 * @author Sean A. Irvine
 */
public class A397697 extends A018804 {

  private Z mA = super.next();
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mA) > 0) {
      mA = super.next();
      mM = Z.ONE;
    }
    return mA.mod(mM);
  }
}
