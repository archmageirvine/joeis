package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400941 The number of order-preserving or reversing partial permutations of an n-element set.
 * @author Sean A. Irvine
 */
public class A400941 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).multiply2().subtract(mN * mN + 1);
  }
}
