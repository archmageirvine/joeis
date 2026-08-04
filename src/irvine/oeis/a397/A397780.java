package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a396.A396966;

/**
 * A397780 allocated for Jakob Stemberger.
 * @author Sean A. Irvine
 */
public class A397780 extends A396966 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}
