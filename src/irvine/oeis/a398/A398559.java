package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398559 allocated for Hilko Koning.
 * @author Sean A. Irvine
 */
public class A398559 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN - 99).multiply(mN).add(3441).multiply(mN).subtract(49259).multiply(mN).add(247889);
  }
}
