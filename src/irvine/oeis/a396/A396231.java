package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396231 allocated for Dave Durgin.
 * @author Sean A. Irvine
 */
public class A396231 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SORT_DESCENDING.z(mA));
    return mA;
  }
}
