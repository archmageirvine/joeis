package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.CyclotomicExtension;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401170 Number of distinct adjacency eigenvalues of the n X n grid graph P_n X P_n.
 * @author Sean A. Irvine
 */
public class A401170 extends Sequence1 {

  private int mN = 0;

  private Polynomial<Q> v(final CyclotomicExtension ring, final int k) {
    return ring.monomial(Q.ONE, k);
  }

  @Override
  public Z next() {
    final int m = 2 * (++mN + 1);
    final CyclotomicExtension ring = new CyclotomicExtension("x", PolynomialUtils.zToQ(CyclotomicPolynomials.cyclotomic(m)));
    final HashSet<Polynomial<Q>> s = new HashSet<>();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> qk = ring.add(v(ring, k), v(ring, m - k));
      for (int j = k; j <= mN; ++j) {
        final Polynomial<Q> qj = ring.add(v(ring, j), v(ring, m - j));
        s.add(ring.add(qk, qj));
      }
    }
    return Z.valueOf(s.size());
  }
}
