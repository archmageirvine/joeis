package irvine.oeis.a398;

import irvine.math.z.Z;

/**
 * A398158 Numbers k such that A398155(k + 1) = A398155(k).
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

