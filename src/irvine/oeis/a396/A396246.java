package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396246 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A396246 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mN * mM).multiply(Functions.FACTORIAL.z(mN)).multiply(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z(mN + mM - 1));
  }
}
