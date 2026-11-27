package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a032.A032531;

/**
 * A402613 allocated for Yifeng Zou.
 * @author Sean A. Irvine
 */
public class A402613 extends A032531 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
