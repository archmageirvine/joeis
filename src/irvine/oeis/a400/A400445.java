package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400445 a(n) = (n-1)*(2*a(n-1) + 15*a(n-2))/(n+1) with a(0)=1, a(1)=0.
 * @author Sean A. Irvine
 */
public class A400445 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private long mN = -1;


  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mA.multiply(15).add(mB.multiply2()).multiply(mN - 1).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

