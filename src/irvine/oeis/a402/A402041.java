package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402041 Numerators of the convergents of A402040.
 * @author Sean A. Irvine
 */
public class A402041 extends Sequence0 {

  private Z mA0 = Z.ONE;
  private Z mA1 = null;
  private Z mB0 = Z.ZERO;
  private Z mB1 = Z.ONE;

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  public Z next() {
    if (mA1 == null) {
      mA1 = Z.ONE;
    } else {
      final Z a = mB1.add(mA0).multiply(mA1);
      final Z b = mB1.square().add(mA1.multiply(mB0));
      mA0 = mA1;
      mA1 = a;
      mB0 = mB1;
      mB1 = b;
    }
    return select(mA1, mB1);
  }
}
