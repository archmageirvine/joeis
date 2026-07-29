package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397935 Number of n X n binary matrices with exactly 14 1's such that there are an even number of 1's in every row and column.
 * @author Sean A. Irvine
 */
public class A397935 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 7).square().multiply(110940)
      .add(Binomial.binomial(mN, 7).multiply(Binomial.binomial(mN, 6)).multiply(4233600))
      .add(Binomial.binomial(mN, 7).multiply(Binomial.binomial(mN, 5)).multiply(911400))
      .add(Binomial.binomial(mN, 7).multiply(Binomial.binomial(mN, 4)).multiply(65520))
      .add(Binomial.binomial(mN, 7).multiply(Binomial.binomial(mN, 3)).multiply(1092))
      .add(Binomial.binomial(mN, 6).square().multiply(1080000))
      .add(Binomial.binomial(mN, 6).multiply(Binomial.binomial(mN, 5)).multiply(316800))
      .add(Binomial.binomial(mN, 6).multiply(Binomial.binomial(mN, 4)).multiply(11520))
      .add(Binomial.binomial(mN, 5).square().multiply(14600))
      .add(Binomial.binomial(mN, 5).multiply(Binomial.binomial(mN, 4)).multiply(480));
  }
}
