package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a066.A066417;

/**
 * A399230 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A399230 extends A066417 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(mB).equals(mA.multiply2())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

