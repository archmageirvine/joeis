package irvine.oeis.a398;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A398575 allocated for Fr\u00e9d\u00e9ric G. Speyser.
 * @author Sean A. Irvine
 */
public class A398575 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mS = RING.empty();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      mS.add(Z.ONE); // 0 term
      mS.add(Z.ONE);
    } else {
      final Polynomial<Z> g = RING.divide(RING.add(RING.pow(mS, 6, mN), RING.pow(mS, 3, mN / 2).substitutePower(2, mN)), Z.TWO);
      final Z t = EulerTransformUtils.eulerTransform(g, mN);
      mS.add(t);
    }
    final Polynomial<Z> h = RING.subtract(mS.substitutePower(7, mN), RING.pow(mS, 7, mN)).shift(1);
    return mS.coeff(mN).add(h.coeff(mN).divide(7).multiply(3));
  }
}
