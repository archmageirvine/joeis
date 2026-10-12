package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399516 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A399516 extends A399515 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).compareTo(Z.ONE) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

