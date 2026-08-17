package irvine.oeis.a397;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A397210 allocated for Fr\u00e9d\u00e9ric G. Speyser.
 * @author Sean A. Irvine
 */
public class A397210 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mS = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mS.add(Z.ONE);
    } else {
      final Polynomial<Z> g = RING.divide(RING.add(RING.pow(mS, 6, mN), RING.pow(mS.substitutePower(2, mN), 3, mN)), Z.TWO);
      final Z t = EulerTransformUtils.eulerTransform(g, mN);
      mS.add(t);
    }
    return mS.coeff(mN);
  }
}
