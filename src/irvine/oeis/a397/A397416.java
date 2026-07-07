package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a085.A085989;

/**
 * A397416 allocated for Friedjof Tellkamp.
 * @author Sean A. Irvine
 */
public class A397416 extends A085989 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
