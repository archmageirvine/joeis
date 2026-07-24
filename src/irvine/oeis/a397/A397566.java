package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397566 a(0) = 0; for n &gt;= 1, a(n) is the smallest number whose Hamming distance from a(n-1) is n^2.
 * @author Sean A. Irvine
 */
public class A397566 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.xor(Z.ONE.shiftLeft(mN * mN).subtract(1));
    }
    return mA;
  }
}
