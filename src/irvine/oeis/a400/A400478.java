package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086786.
 * @author Sean A. Irvine
 */
public class A400478 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mB.subtract(mA).multiply(Functions.DIGIT_SUM.l(mA.add(mB)));
    mA = mB;
    mB = t;
    return t;
  }
}
