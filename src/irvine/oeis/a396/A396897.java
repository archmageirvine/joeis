package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396897 a(n) = n divided by the largest ratio of consecutive divisors of n.
 * @author Sean A. Irvine
 */
public class A396897 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Q max = Q.ZERO;
    Z prev = null;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prev != null) {
        max = max.max(new Q(d, prev));
      }
      prev = d;
    }
    return Q.valueOf(mN).divide(max).toZ();
  }
}
