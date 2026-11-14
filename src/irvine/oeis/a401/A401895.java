package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A401895 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Long.bitCount(Functions.SYNDROME.l(Functions.REVERSE.z(++mN).multiply(mN))));
  }
}
