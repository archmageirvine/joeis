package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399163 allocated for G\u00f6ktu\u011f Omay.
 * @author Sean A. Irvine
 */
public class A399163 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long x = 1; x < p; ++x) {
      final long t = ((((((((((x + 2) * x) % p + 2) * x) % p + 2) * x) % p + 1) * x) % p) * x) % p + 1;
      if (t % p == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
