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
 * A401366 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401366 extends Sequence1 {

  private static final Polynomial<Q> THREE = Polynomial.create(Q.THREE);
  private int mN = 0;

  private Polynomial<Q> v(final CyclotomicExtension ring, final int k) {
    return ring.monomial(Q.ONE, (mN + k) % mN);
  }

  @Override
  public Z next() {
    final CyclotomicExtension ring = new CyclotomicExtension("x", PolynomialUtils.zToQ(CyclotomicPolynomials.cyclotomic(++mN)));
    final HashSet<Polynomial<Q>> s = new HashSet<>();
    for (int k = 0; k < mN; ++k) {
      final Polynomial<Q> qk = ring.add(v(ring, k), v(ring, -k));
      for (int j = k; j < mN; ++j) {
        final Polynomial<Q> qj = ring.add(v(ring, j), v(ring, -j));
        final Polynomial<Q> qjk = ring.add(v(ring, k - j), v(ring, j - k));
        s.add(ring.add(THREE, qk, qj, qjk));
      }
    }
    return Z.valueOf(s.size()).multiply2().subtract(mN % 3 == 0 ? 1 : 0);
  }
}
