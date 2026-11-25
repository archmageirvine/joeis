package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402207 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A402207 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(++mN).multiply(4).subtract(Functions.SIGMA0.z(mN).multiply(mN));
  }
}
