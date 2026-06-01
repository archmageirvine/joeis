package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396281 a(n) is the coefficient of z^n in the solution y(z), holomorphic at z = 0 and normalized by y(0) = 1, of the Calabi-Yau differential operator AESZ #182 (Almkvist-van Straten classification case 2.64).
 * @author Sean A. Irvine
 */
public class A396281 extends Sequence0 {

  private long mN = 1;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.SIX;
      return mB;
    }
    final Z t = Z.valueOf(++mN).multiply(43).subtract(86).multiply(mN).add(77).multiply(mN).subtract(34).multiply(mN).add(6).multiply(mB);
    final Z u = Z.valueOf(6 * mN - 7).multiply(6 * mN - 5).multiply(mN - 1).multiply(mN - 1).multiply(12).multiply(mA);
    final Z v = t.subtract(u);
    mA = mB;
    mB = v.divide(Z.valueOf(mN).pow(4));
    return mB;
  }
}

