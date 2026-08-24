package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396708 Numerators of Sum_{k=1..n} n^2/(k^2 + (n-k)^2).
 * @author Sean A. Irvine
 */
public class A396708 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(Rationals.SINGLETON.sum(1, ++mN, k -> new Q(mN * mN, k * k + (mN - k) * (mN - k))));
  }
}
