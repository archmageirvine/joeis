package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A402346 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A402346 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    final Z p = super.next();
    mA = mA == null ? Z.ONE : mA.isEven() ? mA.divide2() : mA.add(p);
    return mA;
  }
}
