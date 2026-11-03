package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.CyclotomicExtension;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401487 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401487 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  private Polynomial<Q> v(final CyclotomicExtension ring, final int k) {
    return ring.monomial(Q.ONE, k);
  }

  private Z t(final int n, final int k) {
    final int m = Functions.LCM.i(n, k) * 2;
    final int u = m / (2 * k);
    final int v = m / (2 * n);
    final CyclotomicExtension ring = new CyclotomicExtension(m);
    final HashSet<Polynomial<Q>> s = new HashSet<>();
    for (int i = 0; i < k; ++i) {
      final Polynomial<Q> qi = ring.add(v(ring, i * u), v(ring, m - i * u));
      for (int j = 0; j < n; ++j) {
        final Polynomial<Q> qj = ring.add(v(ring, j * v), v(ring, m - j * v));
        s.add(ring.add(qi, qj));
      }
    }
    return Z.valueOf(s.size());
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
