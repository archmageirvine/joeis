package irvine.oeis.a399;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399584 allocated for Zhenxuan Gui.
 * @author Sean A. Irvine
 */
public class A399584 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int nn = mN * mN;
    final Polynomial<Z> d = RING.empty();
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        final int r = i * j;
        while (r >= d.size()) {
          d.add(Z.ZERO);
        }
        d.set(r, d.coeff(r).add(Z.ONE));
      }
    }
    final Polynomial<Z> dd = RING.multiply(d, d);
    Z sumSquares = Z.ZERO;
    for (int r = 1; r <= nn; ++r) {
      sumSquares = sumSquares.add(d.coeff(r).square());
    }
    Z triple = Z.ZERO;
    for (int r = 1; r <= nn; ++r) {
      triple = triple.add(d.coeff(r).multiply(dd.coeff(r)));
    }
    final Z c = Z.valueOf(4L * mN + 1);
    final Z m = c.pow(3).add(Z.valueOf(24).multiply(c).multiply(sumSquares)).add(Z.valueOf(48).multiply(triple));
    return m.add(1).divide2().subtract(Z.valueOf(2L * mN + 1).pow(3));
  }
}
