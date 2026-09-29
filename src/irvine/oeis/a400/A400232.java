package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400232 allocated for Henrik Arhold.
 * @author Sean A. Irvine
 */
public class A400232 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(9).multiply(mN).add(3).multiply(mN).subtract(3).negate();
  }
}

