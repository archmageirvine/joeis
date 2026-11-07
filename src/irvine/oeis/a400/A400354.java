package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a032.A032531;

/**
 * A401531.
 * @author Sean A. Irvine
 */
public class A400354 extends A032531 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long maxC = 0;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (t.compareTo(max) >= 0) {
        max = t;
        maxC = k;
      }
    }
    return Z.valueOf(maxC);
  }
}
