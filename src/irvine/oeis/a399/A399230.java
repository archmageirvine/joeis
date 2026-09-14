package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a066.A066417;

/**
 * A399230 1-anti-sigma-balanced numbers: numbers k such that (A066417(k-1) + A066417(k+1))/2 = A066417(k).
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

