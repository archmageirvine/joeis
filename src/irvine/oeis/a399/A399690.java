package irvine.oeis.a399;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399690 Numerator of delta(n), the density of the integers that are divisible by some integer in the open interval (n, 2n).
 * @author Sean A. Irvine
 */
public class A399690 extends Sequence1 {

  private long mN = 0;

  private Q delta(final long n) {
    Map<Z, Z> dp = Collections.singletonMap(Z.ONE, Z.ONE);
    for (long d = n + 1; d < 2 * n; ++d) {
      final Map<Z, Z> newDp = new HashMap<>(dp);
      for (final Map.Entry<Z, Z> e : dp.entrySet()) {
        newDp.merge(e.getKey().lcm(d), e.getValue().negate(), Z::add);
      }
      dp = newDp;
    }
    Q res = Q.ONE;
    for (final Map.Entry<Z, Z> e : dp.entrySet()) {
      res = res.subtract(new Q(e.getValue(), e.getKey()));
    }
    return res;
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(delta(++mN));
  }
}
