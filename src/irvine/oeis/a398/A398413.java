package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A398413 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A398413 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long lp = p.longValueExact();
    long cnt = 0;
    long t = 5040 % lp;
    for (long m = 8; m < lp - 1; ++m) {
      t *= m;
      t %= lp;
      if (t == lp - 1 && lp % m != 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
