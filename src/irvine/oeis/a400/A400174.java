package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400174 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A400174 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z m = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      if (m.mod(4) == 1) {
        m = m.multiply(5).subtract(1).makeOdd();
      } else {
        m = m.multiply(5).add(1).makeOdd();
      }
    }
    return Z.valueOf(seen.size());
  }
}
