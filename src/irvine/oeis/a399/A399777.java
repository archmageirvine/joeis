package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399777 Positive integers n such that the central-cross sum divides the diagonal product in the (2*n + 1) X (2*n + 1) Ulam spiral.
 * @author Sean A. Irvine
 */
public class A399777 extends Sequence1 {

  private Z mSum = Z.ONE;
  private Z mProd = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z neg = mN.negate();
      mSum = mSum
        .add(ZUtils.ulamValue(Z.ZERO, mN))
        .add(ZUtils.ulamValue(mN, Z.ZERO))
        .add(ZUtils.ulamValue(Z.ZERO, neg))
        .add(ZUtils.ulamValue(neg, Z.ZERO));
      mProd = mProd.multiply(
        ZUtils.ulamValue(mN, mN)
          .multiply(ZUtils.ulamValue(neg, mN))
          .multiply(ZUtils.ulamValue(mN, neg))
          .multiply(ZUtils.ulamValue(neg, neg))
      );
      if (mProd.mod(mSum).isZero()) {
        return mN;
      }
    }
  }
}
