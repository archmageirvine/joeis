package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400446.
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

