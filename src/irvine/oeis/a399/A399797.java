package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399797 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A399797 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z t = mN;
    while (!t.isOne()) {
      ++cnt;
      switch ((int) t.mod(3)) {
        case 0:
          t = t.divide(3);
          break;
        case 1:
          t = t.multiply(4).subtract(1).divide(3);
          break;
        default: // 2
          t = t.multiply(4).add(1).divide(3);
          break;
      }
    }
    return Z.valueOf(cnt);
  }
}
