package irvine.oeis.a399;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399559 Norm from Q(zeta_n) to Q of F(zeta_n), where F(q) = Sum_{k&gt;=0} (q;q)_k is the Kontsevich-Zagier series and zeta_n is a primitive n-th root of unity.
 * @author Sean A. Irvine
 */
public class A399559 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private Polynomial<Z> mP = RING.one();
  private Polynomial<Z> mS = RING.one();

  @Override
  public Z next() {
    if (++mN > 1) {
      mP = RING.multiply(mP, RING.oneMinusXToTheN(mN - 1));
      mS = RING.add(mS, mP);
    }
    return RING.resultant(CyclotomicPolynomials.cyclotomic(mN), mS).abs();
  }
}
