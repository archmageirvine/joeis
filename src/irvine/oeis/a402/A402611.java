package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a032.A032531;

/**
 * A402611 allocated for Yifeng Zou.
 * @author Sean A. Irvine
 */
public class A402611 extends A032531 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.NEG_ONE;
    long maxCol = 0;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (t.compareTo(max) > 0) {
        max = t;
        maxCol = k;
      }
    }
    return Z.valueOf(maxCol);
  }
}
