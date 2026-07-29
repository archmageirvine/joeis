package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A397939 Number of partitions of n that can be reduced to a single part by repeatedly replacing two parts x and y with |x - y| &gt;= 2 by their sum x + y.
 * @author Sean A. Irvine
 */
public class A397939 extends A000041 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      super.next();
      return mN == 0 ? Z.ZERO : Z.ONE;
    }
    return super.next().add(3 + (mN & 1) - mN).subtract(Functions.SIGMA0.z(mN - 1));
  }
}
