package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a127.A127824;

/**
 * A398208 Least prime with exactly n steps in the Collatz (3x+1) problem, or 0 if there is no such prime.
 * @author Sean A. Irvine
 */
public class A398208 extends A127824 {

  @Override
  public Z next() {
    step();
    for (final Z t : mA) {
      if (t.isProbablePrime()) {
        return t;
      }
    }
    return Z.ZERO;
  }
}
