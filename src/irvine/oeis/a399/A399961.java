package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399961 Trajectory of 2 under the map x -&gt; x + (sum of decimal digits of x)*(product of nonzero decimal digits of x).
 * @author Sean A. Irvine
 */
public class A399961 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.add(Functions.DIGIT_NZ_PRODUCT.z(mA).multiply(Functions.DIGIT_SUM.z(mA)));
    return mA;
  }
}
