package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a046.A046974;

/**
 * A396107 Recam\u00e1n transform of the running sum of the decimal digits of Pi (A046974).
 * @author Sean A. Irvine
 */
public class A396107 extends Sequence0 {

  private final Sequence mD = new A046974().prepend(0);
  private Z mS = Z.ZERO;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    final Z k = mD.next();
    if (k.isZero()) {
      return Z.ZERO;
    }
    mT = mT.add(mT.compareTo(k) <= 0 || mS.testBit(mT.subtract(k).intValueExact()) ? k : k.negate());
    mS = mS.or(Z.ONE.shiftLeft(mT.longValueExact()));
    return mT;
  }
}
