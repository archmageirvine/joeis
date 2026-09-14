package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a066.A066417;

/**
 * A399231 2-anti-sigma-balanced numbers: numbers k such that (A066417(k-2) + A066417(k+2))/2 = A066417(k).
 * @author Sean A. Irvine
 */
public class A399231 extends A066417 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = mD;
      mD = super.next();
      if (t.add(mD).equals(mB.multiply2())) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}

