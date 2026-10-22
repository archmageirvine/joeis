package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a179.A179502;

/**
 * A401114 allocated for Mottaqui Karim.
 * @author Sean A. Irvine
 */
public class A401114 extends A179502 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}
