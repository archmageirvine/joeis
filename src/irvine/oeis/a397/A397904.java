package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397904 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A397904 extends Sequence1 {

  private long mN = 0;

  private Z reduce3(Z m) {
    while (m.mod(3) == 0) {
      m = m.divide(3);
    }
    return m;
  }

  @Override
  public Z next() {
    while (Functions.GCD.l(++mN, 6) != 1) {
      // do nothing
    }
    Z m = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      if (m.mod(6) == 1) {
        m = m.multiply(7).subtract(1);
      } else {
        m = m.multiply(7).add(1);
      }
      m = reduce3(m.makeOdd());
    }
    return Z.valueOf(seen.size());
  }
}
