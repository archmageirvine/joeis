package irvine.oeis.a397;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397830 Integers k&gt;9 such that removing the most and the least significant digit from k^2 produces another square.
 * @author Sean A. Irvine
 */
public class A397830 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 5) {
        final String s = Z.valueOf(mN).square().toString();
        if (Predicates.SQUARE.is(new Z(s.substring(1, s.length() - 1)))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
