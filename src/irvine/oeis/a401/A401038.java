package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401038 allocated for Matthew Skywalker.
 * @author Sean A. Irvine
 */
public class A401038 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    final Z p = super.next();
    mA = mA == null ? p : mA.add(p).multiply(p);
    return mA;
  }
}

