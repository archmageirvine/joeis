package irvine.oeis.a397;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A397121 Number of rooted unlabeled cacti with blocks of sizes 5, 7 and 9, having n blocks.
 * @author Sean A. Irvine
 */
public class A397121 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mS = RING.empty();
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      mS.add(Z.ONE);
    } else {
      final Polynomial<Z> k5 = RING.divide(RING.add(RING.pow(mS, 4, mN), RING.pow(mS, 2, mN / 2).substitutePower(2, mN)), Z.TWO).shift(1);
      final Polynomial<Z> k7 = RING.divide(RING.add(RING.pow(mS, 6, mN), RING.pow(mS, 3, mN / 2).substitutePower(2, mN)), Z.TWO).shift(1);
      final Polynomial<Z> k9 = RING.divide(RING.add(RING.pow(mS, 8, mN), RING.pow(mS, 4, mN / 2).substitutePower(2, mN)), Z.TWO).shift(1);
      mS.add(EulerTransformUtils.eulerTransform(RING.add(k5, k7, k9), mN - 1));
      mS.add(EulerTransformUtils.eulerTransform(RING.add(k5, k7, k9), mN));
    }
    return mS.coeff(mN);
  }
}
