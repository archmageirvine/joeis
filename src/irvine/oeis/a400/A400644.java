package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400644 a(n+1) = round(sqrt(a(n)^2 + a(n-1)^2 + a(n-2)^2)).
 * @author Sean A. Irvine
 */
public class A400644 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
      if (mC == null) {
        if (mB == null) {
          if (mA == null) {
            mA = Z.ZERO;
            return Z.ZERO;
          }
          mB = Z.ZERO;
          return mB;
        }
        mC = Z.ONE;
        return mC;
      }
    final Z t = CR.valueOf(mC.square()).add(mB.square()).add(mA.square()).sqrt().round();
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

