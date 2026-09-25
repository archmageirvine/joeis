package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a397.A397831;

/**
 * A400183 Even terms in A397831, divided by 2.
 * @author Sean A. Irvine
 */
public class A400183 extends A397831 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isEven()) {
        return t.divide2();
      }
    }
  }
}

