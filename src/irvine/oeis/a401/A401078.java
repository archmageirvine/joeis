
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401078 allocated for Michael P. May.
 * @author Sean A. Irvine
 */
public class A401078 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    if (mA.equals(Z.TWO)) {
      mA = Z.THREE;
      return Z.THREE;
    }
    final Z p = Functions.PREV_PRIME.z(mA.add(1));
    mA = p.add(Functions.PREV_PRIME.z(p));
    return mA;
  }
}
