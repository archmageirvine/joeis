package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399520 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A399520 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(CR.valueOf(CR.valueOf(mN).log().floor()).exp().floor());
  }
}
