package irvine.oeis.a401;

import irvine.math.MemoryFunction1;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401125 Triangle read by rows: T(n,k) is the number of Dyck paths of semilength n with exactly k symmetric peaks, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A401125 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mP = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      switch (n) {
        case 0:
          return RING.one();
        case 1:
          return RING.x();
        case 2:
          return Polynomial.create(0, 1, 1);
        case 3:
          return Polynomial.create(1, 1, 2, 1);
        case 4:
          return Polynomial.create(3, 4, 3, 3, 1);
        default:
          final Polynomial<Z> t1 = RING.multiply(get(n - 1), Polynomial.create(4 * n - 3, 3 * n + 1));
          final Polynomial<Z> t2 = RING.multiply(get(n - 2), Polynomial.create(7 - 2 * n, 13 - 10 * n, 1 - 3 * n));
          final Polynomial<Z> t3 = RING.multiply(get(n - 3), Polynomial.create(1, 4 * n - 16, 8 * n - 16, n - 1));
          final Polynomial<Z> t4 = RING.multiply(get(n - 4), Polynomial.create(6 - n, 2 * n - 13, 15 - 3 * n, 6 - 2 * n));
          final Polynomial<Z> t5 = RING.multiply(get(n - 5), Polynomial.create(0, n - 5, 10 - 2 * n, n - 5));
          return RING.divide(RING.add(t1, t2, t3, t4, t5), Z.valueOf(n + 1));
      }
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mP.get(mN).coeff(mM);
  }
}
