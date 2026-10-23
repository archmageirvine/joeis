package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401041 a(n) = Sum_{k=4..n, k composite} (pi(lpf(k)) - 1), where lpf(k) = A020639(k) is the least prime factor of k.
 * @author Sean A. Irvine
 */
public class A401041 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1 && !Predicates.PRIME.is(mN)) {
      mSum = mSum.add(Functions.PRIME_PI.l(Functions.LPF.l(mN)) - 1);
    }
    return mSum;
  }
}
