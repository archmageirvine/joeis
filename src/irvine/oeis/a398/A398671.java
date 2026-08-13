package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a005.A005089;

/**
 * A398671 allocated for Daniel Suteu.
 * @author Sean A. Irvine
 */
public class A398671 extends A005089 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().isZero()) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
