package irvine.oeis.a399;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399697 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A399697 extends Sequence1 {

  private long mN = 0;

  private Q delta1(final long n) {
    Q res = Q.ZERO;
    for (long b = n + 1; b < 2 * n; ++b) {
      Map<Z, Z> dp = Collections.singletonMap(Z.valueOf(b), Z.ONE);
      for (long d = n + 1; d < 2 * n; ++d) {
        if (d == b) {
          continue;
        }
        final Map<Z, Z> newDp = new HashMap<>(dp);
        for (final Map.Entry<Z, Z> e : dp.entrySet()) {
          newDp.merge(e.getKey().lcm(d), e.getValue().negate(), Z::add);
        }
        dp = newDp;
      }
      for (final Map.Entry<Z, Z> e : dp.entrySet()) {
        res = res.add(new Q(e.getValue(), e.getKey()));
      }
    }
    return res;
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(delta1(++mN));
  }
}
