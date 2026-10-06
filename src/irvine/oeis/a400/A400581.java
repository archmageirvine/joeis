package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002202;

/**
 * A400581 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A400581 extends Sequence1 {

  private final Sequence mS = new A002202();
  private Z mA = mS.next();
  private Z mB = mS.next();
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mS.next();
      final Z d = mA.subtract(t).min(mB.subtract(mA));
      if (d.compareTo(mBest) > 0) {
        mBest = d;
        return mA;
      }
    }
  }
}
