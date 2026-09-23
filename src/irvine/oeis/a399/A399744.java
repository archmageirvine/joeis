package irvine.oeis.a399;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399744 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399744 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;

  @Override
  public Z next() {
    final Z l = Functions.LUCAS.z(++mN);
    final int h = mN / 2;
    final int u = h + 1;
    final Z[] w = new Z[u];
    final int[] m = new int[u];
    for (int i = 0, k = h; k >= 0; ++i, --k) {
      w[i] = Binomial.binomial(mN, k);
      m[i] = 2 * k == mN ? 1 : 2;
    }
    final Z[] s = new Z[u + 1];
    s[u] = Z.ZERO;
    for (int i = u - 1; i >= 0; --i) {
      s[i] = s[i + 1].add(w[i].multiply(m[i]));
    }
    Map<Z, Integer> d = new HashMap<>();
    d.put(Z.ZERO, 0);
    for (int i = 0; i < u; ++i) {
      final Map<Z, Integer> q = new HashMap<>();
      for (final Map.Entry<Z, Integer> e : d.entrySet()) {
        final Z old = e.getKey();
        final int cost = e.getValue();
        for (int c = -m[i]; c <= m[i]; ++c) {
          final Z t = old.add(w[i].multiply(c));
          if (l.subtract(t).abs().compareTo(s[i + 1]) <= 0) {
            final int a = cost + Math.abs(c);
            final Integer oldCost = q.get(t);
            if (oldCost == null || a < oldCost) {
              q.put(t, a);
            }
          }
        }
      }
      d = q;
    }
    final Integer result = d.get(l);
    return Z.valueOf(result == null ? 0 : result);
  }
}
