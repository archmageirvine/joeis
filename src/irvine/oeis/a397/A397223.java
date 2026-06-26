package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397223 allocated for Ramin Mohammadi Masoudi.
 * @author Sean A. Irvine
 */
public class A397223 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 45, mN).multiply(8)
      .subtract(Binomial.binomial(mN + 39, mN).multiply(12))
      .subtract(Binomial.binomial(mN + 36, mN).multiply(12))
      .subtract(Binomial.binomial(mN + 35, mN).multiply(4))
      .add(Binomial.binomial(mN + 33, mN).multiply(24))
      .add(Binomial.binomial(mN + 30, mN).multiply(18))
      .add(Binomial.binomial(mN + 28, mN).multiply(8))
      .subtract(Binomial.binomial(mN + 27, mN).multiply(32))
      .subtract(Binomial.binomial(mN + 25, mN).multiply(30))
      .add(Binomial.binomial(mN + 24, mN).multiply(24))
      .add(Binomial.binomial(mN + 22, mN).multiply(24))
      .subtract(Binomial.binomial(mN + 21, mN).multiply(14))
      .add(Binomial.binomial(mN + 20, mN).multiply(8))
      .subtract(Binomial.binomial(mN + 19, mN).multiply(16))
      .add(Binomial.binomial(mN + 18, mN).multiply(8))
      .subtract(Binomial.binomial(mN + 17, mN));
  }
}
