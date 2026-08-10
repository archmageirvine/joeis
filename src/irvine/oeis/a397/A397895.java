package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397895 allocated for G. L. Honaker, Jr.
 * @author Sean A. Irvine
 */
public class A397895 extends A000040 {

  private long mN = 0;
  private long mC1 = 0;
  private long mC9 = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = super.next().mod(10);
      if (r == 1) {
        ++mC1;
      } else if (r == 9) {
        ++mC9;
      }
      if (mC1 == mC9) {
        return Z.valueOf(mN);
      }
    }
  }
}
