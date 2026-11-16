package irvine.oeis.a401;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a003.A003849;

/**
 * A401899 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401899 extends Sequence3 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private long mN = 2;

  @Override
  public Z next() {
    final MatrixField<Z> ring = new MatrixField<>(++mN, IntegerField.SINGLETON);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    final Sequence s = new A003849();
    for (long i = 0; i < mN; ++i) {
      final Z w = s.next().add(1);
      final long j = (i + 1) % mN;
      m.set(i, i, m.get(i, i).add(w));
      m.set(j, j, m.get(j, j).add(w));
      m.set(i, j, m.get(i, j).subtract(w));
      m.set(j, i, m.get(j, i).subtract(w));
    }
    final Polynomial<Q> p = PolynomialUtils.zToQ(ring.characteristicPolynomial(m));
    final Polynomial<Q> g = RING.gcd(p, RING.diff(p));
    return Z.valueOf(p.degree() - g.degree());
  }
}
