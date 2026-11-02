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
 * A401412 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401412 extends Sequence1 {

  private int mN = 0;

  private Polynomial<Q> v(final CyclotomicExtension ring, final int k) {
    return ring.monomial(Q.ONE, k);
  }

  @Override
  public Z next() {
    ++mN;
    final CyclotomicExtension ring = new CyclotomicExtension("x", PolynomialUtils.zToQ(CyclotomicPolynomials.cyclotomic(mN)));
    final HashSet<Polynomial<Q>> s = new HashSet<>();
    for (int k = 0; k < mN; ++k) {
      final Polynomial<Q> qk = ring.add(v(ring, k), v(ring, mN - k));
      for (int j = k; j < mN; ++j) {
        final Polynomial<Q> qj = ring.add(v(ring, j), v(ring, mN - j));
        final Polynomial<Q> qkj = ring.add(v(ring, k + j), v(ring, 2 * mN - k - j));
        s.add(ring.add(qk, qj, qkj));
      }
    }
    return Z.valueOf(s.size());
  }
}
