package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400215 allocated for Dixon J. Jones.
 * @author Sean A. Irvine
 */
public class A400215 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0
      ? Z.TWO.multiply(Z.NEG_ONE.pow(mN + 1)).add(2)
      : Binomial.binomial(mN + mM - 1, 2 * mM - 1).multiply(mN).divide(mM);
  }
}
