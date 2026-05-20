package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A396018 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A396018 extends Sequence3 {

  private int mN = 2;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.OMEGA.i(Z.valueOf(mM).multiply(mM + 1).multiply(mM + 2).multiply(mM + 3).multiply(mM + 4)) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
