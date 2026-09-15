package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a396.A396966;

/**
 * A399627 allocated for Jakob Stemberger.
 * @author Sean A. Irvine
 */
public class A399627 extends A396966 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}
