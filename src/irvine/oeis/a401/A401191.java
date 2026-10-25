package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401191 allocated for Ganesh Jasawat.
 * @author Sean A. Irvine
 */
public class A401191 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mB.add(1).add(Functions.DIGIT_PRODUCT_PERSISTENCE.z(mA));
    mA = mB;
    mB = t;
    return t;
  }
}
