package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a076.A076478;

/**
 * A400405 Deterministic version of the random Fibonacci sequence, with signs from A076478 and the seed as (0,1).
 * @author Sean A. Irvine
 */
public class A400405 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private final Sequence mS = new A076478();

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
