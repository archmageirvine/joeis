package irvine.oeis.a401;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a384.A384222;

/**
 * A401248 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A401248 extends A384222 {

  @Override
  public Z next() {
    mA.clear();
    step();
    return Z.valueOf(IntegerUtils.min(mA));
  }
}
