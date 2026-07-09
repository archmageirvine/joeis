package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396321 Number of n X n binary matrices with exactly 10 1's such that there are no odd number of 1's in a row and no odd number of 1's in a column.
 * @author Sean A. Irvine
 */
public class A396321 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z b4 = Binomial.binomial(mN, 4);
    final Z b5 = Binomial.binomial(mN, 5);
    return b5.square().multiply(2040)
      .add(b5.multiply(b4).multiply(1440))
      .add(b5.multiply(Binomial.binomial(mN, 3)).multiply(120))
      .add(b4.square().multiply(96));
  }
}
