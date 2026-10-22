package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400617 allocated for Jules Beauchamp.
 * @author Sean A. Irvine
 */
public class A400617 extends Sequence1 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mN += 2;
      mA = Z.ONE;
      return Z.ONE;
    }
    mA = mA.isEven() ? mA.divide2() : mA.add(mN);
    final Z res = mA;
    if (mA.isOne()) {
      mA = null;
    }
    return res;
  }
}
