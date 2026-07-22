package irvine.oeis.a398;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086041.
 * @author Sean A. Irvine
 */
public class A398023 extends Sequence0 {

  private int mN = -1;

  private boolean isZero(final Z[] u) {
    for (final Z v : u) {
      if (!v.isZero()) {
        return false;
      }
    }
    return true;
  }

  private Z[] step(final Z[] u, final long d) {
    final Z[] v = new Z[u.length];
    Arrays.fill(v, Z.ZERO);
    Z s = Z.ZERO;
    for (int k = 0; k < u.length; ++k) {
      if (k % d == 0) {
        v[k] = s;
      }
      s = s.add(u[k]);
    }
    return v;
  }

  @Override
  public Z next() {
    Z[] v = new Z[++mN + 1];
    Arrays.fill(v, Z.ZERO);
    final Z[] r = new Z[v.length];
    Arrays.fill(r, Z.ZERO);
    long d = 0;
    v[0] = Z.ONE;
    while (!isZero(v)) {
      for (int k = 0; k < v.length; ++k) {
        r[k] = r[k].add(v[k]);
      }
      ++d;
      v = step(v, d);
    }
    return r[r.length - 1];
  }
}
