package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a005.A005089;

/**
 * A398671 a(n) is the number of positive integers &lt;= n with no prime factors of form 4*k+1.
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
