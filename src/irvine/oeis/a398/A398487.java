package irvine.oeis.a398;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398487 Number of unsatisfiable 3-SAT formulas with 4 variables and n clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A398487 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 119, mN)
      .subtract(Binomial.binomial(mN + 99, mN).multiply(16))
      .add(Binomial.binomial(mN + 89, mN).multiply(32))
      .add(Binomial.binomial(mN + 83, mN).multiply(48))
      .add(Binomial.binomial(mN + 80, mN).multiply(32))
      .subtract(Binomial.binomial(mN + 79, mN).multiply(88))
      .add(Binomial.binomial(mN + 75, mN).multiply(24))
      .subtract(Binomial.binomial(mN + 73, mN).multiply(192))
      .subtract(Binomial.binomial(mN + 70, mN).multiply(128))
      .add(Binomial.binomial(mN + 69, mN).multiply(256))
      .subtract(Binomial.binomial(mN + 67, mN).multiply(48))
      .add(Binomial.binomial(mN + 66, mN).multiply(240))
      .subtract(Binomial.binomial(mN + 65, mN).multiply(288))
      .add(Binomial.binomial(mN + 63, mN).multiply(384))
      .subtract(Binomial.binomial(mN + 62, mN).multiply(192))
      .add(Binomial.binomial(mN + 61, mN).multiply(208))
      .add(Binomial.binomial(mN + 60, mN).multiply(208))
      .subtract(Binomial.binomial(mN + 59, mN).multiply(544))
      .add(Binomial.binomial(mN + 58, mN).multiply(512))
      .add(Binomial.binomial(mN + 57, mN).multiply(32))
      .subtract(Binomial.binomial(mN + 56, mN).multiply(952))
      .add(Binomial.binomial(mN + 55, mN).multiply(492))
      .subtract(Binomial.binomial(mN + 54, mN).multiply(576))
      .subtract(Binomial.binomial(mN + 53, mN).multiply(512))
      .add(Binomial.binomial(mN + 52, mN).multiply(1376))
      .subtract(Binomial.binomial(mN + 51, mN).multiply(840))
      .add(Binomial.binomial(mN + 50, mN).multiply(320))
      .add(Binomial.binomial(mN + 49, mN).multiply(1360))
      .subtract(Binomial.binomial(mN + 48, mN).multiply(1696))
      .add(Binomial.binomial(mN + 47, mN).multiply(1168))
      .add(Binomial.binomial(mN + 46, mN).multiply(192))
      .subtract(Binomial.binomial(mN + 45, mN).multiply(1536))
      .add(Binomial.binomial(mN + 44, mN).multiply(1344))
      .subtract(Binomial.binomial(mN + 43, mN).multiply(564))
      .subtract(Binomial.binomial(mN + 42, mN).multiply(1824))
      .add(Binomial.binomial(mN + 41, mN).multiply(2640))
      .subtract(Binomial.binomial(mN + 40, mN).multiply(576))
      .subtract(Binomial.binomial(mN + 39, mN).multiply(1120))
      .add(Binomial.binomial(mN + 38, mN).multiply(1504))
      .subtract(Binomial.binomial(mN + 37, mN).multiply(216))
      .subtract(Binomial.binomial(mN + 36, mN).multiply(1216))
      .add(Binomial.binomial(mN + 35, mN).multiply(1000))
      .subtract(Binomial.binomial(mN + 34, mN).multiply(288))
      .add(Binomial.binomial(mN + 33, mN).multiply(64))
      .subtract(Binomial.binomial(mN + 32, mN).multiply(32))
      .add(Binomial.binomial(mN + 31, mN).multiply(7));
  }
}
