package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a372.A372770;

/**
 * A399574 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A399574 extends A372770 {

  private Z mA = super.next();
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    if (mP.compareTo(Z.FOUR) < 0) {
      mP = mP.add(1);
      return mP;
    }
    while (true) {
      mP = Functions.NEXT_PRIME.z(mP);
      while (mP.compareTo(mA) > 0) {
        mA = super.next();
      }
      if (!mP.equals(mA)) {
        return mP;
      }
    }
  }
}
