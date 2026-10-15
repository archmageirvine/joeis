package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399516 Indices of jumps in A399515, where first differences A399515(n+1) - A399515(n) are &gt; 1.
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

