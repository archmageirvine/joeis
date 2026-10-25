package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a191.A191232;

/**
 * A399309 Deterministic version of the random Fibonacci sequence, with signs from A191232 and the seed as (0,1).
 * @author Sean A. Irvine
 */
public class A399309 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private final Sequence mS = new A191232();

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mS.next().isZero() ? mB.subtract(mA) : mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
