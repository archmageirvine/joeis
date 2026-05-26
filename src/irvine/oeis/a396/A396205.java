package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a033.A033676;

/**
 * A396205 a(n) = number of integers k &lt;= n with g(k)^3 &lt; k, where g(k) is the largest divisor d of k satisfying d &lt;= sqrt(k) (A033676).
 * @author Sean A. Irvine
 */
public class A396205 extends A033676 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().pow(3).compareTo(++mN) < 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
