package irvine.oeis.a398;

import irvine.math.z.Z;

/**
 * A398158 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398158 extends A398155 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

