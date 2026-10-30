package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a032.A032531;

/**
 * A401242 allocated for Yifeng Zou.
 * @author Sean A. Irvine
 */
public class A401242 extends A032531 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      max = max.max(super.next());
    }
    return max;
  }
}

