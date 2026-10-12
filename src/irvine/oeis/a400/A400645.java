package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400645 allocated for Bence Bern\u00e1th.
 * @author Sean A. Irvine
 */
public class A400645 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mC == null) {
        if (mB == null) {
          if (mA == null) {
            mA = Z.ZERO;
            return Z.ZERO;
          }
          mB = Z.ZERO;
          return mB;
        }
        mC = Z.ZERO;
        return mC;
      }
      mD = Z.ONE;
      return Z.ONE;
    }
    final Z t = CR.valueOf(mD.square().add(mC.square()).add(mB.square()).subtract(mA.square())).sqrt().round();
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}

