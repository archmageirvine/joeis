package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400235 allocated for Henrik Arhold.
 * @author Sean A. Irvine
 */
public class A400235 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(12).multiply(mN).add(5).multiply(mN).subtract(6).divide2().negate();
  }
}
