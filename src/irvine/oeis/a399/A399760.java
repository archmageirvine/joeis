package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399760 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A399760 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 4;
    final Z s = Z.valueOf(mN);
    Z t = s;
    Z r = Z.ZERO;
    while (t.compareTo(s) >= 0) {
      r = r.multiply2();
      if (t.isOdd()) {
        r = r.add(1);
        t = t.multiply(3).add(1).divide2();
      } else {
        t = t.divide2();
      }
    }
    return r.makeOdd();
  }
}

