package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398370 a(1)=1; for n&gt;=2, a(n)=a(n-1)+n if a(n-1) mod floor(phi*n)&lt;n, otherwise a(n)=floor(a(n-1)/phi), where phi=(1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A398370 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mA.mod(CR.PHI.multiply(mN).floor()).compareTo(mN) < 0) {
        mA = mA.add(mN);
      } else {
        mA = CR.valueOf(mA).divide(CR.PHI).floor();
      }
    }
    return mA;
  }
}
