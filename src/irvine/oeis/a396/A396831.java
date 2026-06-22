package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396831 a(n) is the n-th digit after the decimal point in the decimal expansion of the natural logarithm of n.
 * @author Sean A. Irvine
 */
public class A396831 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final CR flog = CR.valueOf(++mN).log();
    mT = mT.multiply(10);
    return flog.multiply(mT).floor().mod(Z.TEN);
  }
}
