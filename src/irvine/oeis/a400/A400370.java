package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030190;

/**
 * A400370 Deterministic version of the random Fibonacci sequence, with signs from A030190 and the seed as (1,0).
 * @author Sean A. Irvine
 */
public class A400370 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private final Sequence mS = new A030190();

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = mS.next().isZero() ? mB.subtract(mA) : mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
