package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399129 allocated for G. L. Honaker, Jr.
 * @author Sean A. Irvine
 */
public class A399129 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(10);
      if ((r == 1 && ++mN == 0) || (r == 9 && --mN == 0)) {
        return p;
      }
    }
  }
}

