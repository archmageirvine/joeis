package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401143 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A401143 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z m = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      if (m.mod(4) == 1) {
        m = m.multiply(5).add(3);
      } else {
        m = m.multiply(5).add(1);
      }
      m = m.makeOdd();
    }
    return Z.valueOf(seen.size());
  }
}
