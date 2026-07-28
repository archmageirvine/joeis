package irvine.oeis.a397;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397361 allocated for Oliver Navarro.
 * @author Sean A. Irvine
 */
public class A397361 extends Sequence1 {

  private int mN = 0;

  private Z[] step(final Z[] u, final int d) {
    final Z[] v = new Z[u.length];
    Arrays.fill(v, Z.ZERO);
    Z s = Z.ZERO;
    for (int i = 0; i < u.length; ++i) {
      if (i % d == 0) {
        v[i] = s;
      }
      s = s.add(u[i]);
    }
    return v;
  }

  @Override
  public Z next() {
    ++mN;
    Z[] v = new Z[mN * mN + 1];
    Arrays.fill(v, Z.ZERO);
    v[0] = Z.ONE;
    for (int d = 1; d <= mN; ++d) {
      v = step(v, d);
    }
    return v[mN * mN];
  }
}
