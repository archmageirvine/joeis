package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398223 allocated for Nicholas Green.
 * @author Sean A. Irvine
 */
public class A398223 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      switch ((int) m.mod(3)) {
        case 0:
          m = m.divide(3);
          break;
        case 1:
          m = m.multiply(4).add(1);
          break;
        default: // 2
          m = m.multiply2().subtract(1);
          break;
      }
    }
    return Z.valueOf(seen.size());
  }
}
