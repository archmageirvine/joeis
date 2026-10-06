package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a400.A400298;

/**
 * A396003 allocated for Vicenzo P DeMaar.
 * @author Sean A. Irvine
 */
public class A396003 extends A400298 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    Z sum = Z.ZERO;
    while (mA.compareTo(mLim) < 0) {
      sum = sum.add(Functions.DIGIT_SUM.l(mA));
      mA = super.next();
    }
    return sum;
  }
}
