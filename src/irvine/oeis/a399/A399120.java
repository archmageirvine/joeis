package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399120 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A399120 extends Sequence1 {

  private long mN = 0;

  private Z reduce3(Z m) {
    while (m.mod(3) == 0) {
      m = m.divide(3);
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      ++mN;
    }
    Z m = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      if (m.mod(3) == 1) {
        m = reduce3(m.multiply(4).subtract(1));
      } else {
        m = reduce3(m.multiply(4).subtract(2));
      }
    }
    return Z.valueOf(seen.size());
  }
}
