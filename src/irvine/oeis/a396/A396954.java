package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396954 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A396954 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2 * mN).multiply(mN + 2).shiftRight(mN).divide(Functions.FACTORIAL.z(mN)).subtract(Functions.FACTORIAL.z(mN).multiply(3).shiftLeft(mN - 1));
  }
}
