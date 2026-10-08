package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A400325 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A400325 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long x = 0; x < p; ++x) {
      for (long y = 0; y < p; ++y) {
        final long x2 = (x * x) % p;
        final long y2 = (y * y) % p;
        final long t = x2 + y2;
        final long t2 = (t * t) % p;
        if ((t2 + y2) % p == x2) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
