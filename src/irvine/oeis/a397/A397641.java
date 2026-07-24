package irvine.oeis.a397;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397641 Irregular triangle read by rows: T(m,r) is the number of chemical reaction networks on species A and B that use both species, contain r reactions, and have only complexes i*A+j*B with 1 &lt;= i+j &lt;= m, up to swapping A and B.
 * @author Sean A. Irvine
 */
public class A397641 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private static final Polynomial<Z> X2 = Polynomial.create(1, 0, 1);
  private static final Z NEG_TWO = Z.valueOf(-2);
  private long mN = 0;
  private long mM = 0;
  private Polynomial<Z> mA = RING.zero();

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      ++mN;
      final long c = Z.valueOf(mN).multiply(mN + 3).multiply(mN * mN + 3 * mN - 2).divide(4).longValueExact();
      final long d = (mN / 2) * (mN / 2 - 1);
      final long e = mN * (mN - 1);
      mA = RING.add(
        RING.pow(X1, c),
        RING.multiply(RING.pow(X1, d), RING.pow(X2, (c - d) / 2)),
        RING.multiply(RING.pow(X1, e), NEG_TWO)
      );
      mM = 1;
    }
    return mA.coeff(mM).divide2();
  }
}

