package irvine.oeis.a399;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399599 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399599 extends Sequence1 {

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
