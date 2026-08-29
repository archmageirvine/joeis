package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398872 a(n) is the least x + y + z such that (x*y*z) / (x + y + z) = n, for positive integers x,y,z.
 * @author Sean A. Irvine
 */
public class A398872 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      for (long x = 1; x <= m / 3; ++x) {
        for (long y = x; y <= (m - x) / 2; ++y) {
          final long z = m - x - y;
          if (x * y * z == m * mN) {
            return Z.valueOf(m);
          }
        }
      }
    }
  }
}

