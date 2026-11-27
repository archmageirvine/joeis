package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A402233 Triangle T(n,k) read by rows: Weighted count of pairs of binary necklaces of length n, one containing k black beads and the other n-k black beads, with relatively prime repetition counts. Each pair contributes the reciprocal of the product of its repetition counts.
 * @author Sean A. Irvine
 */
public class A402233 extends Sequence2 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(Functions.GCD.l(mN, mM), d -> Binomial.binomial(mN / d, mM / d).square().multiply(Functions.MOBIUS.l(d))).divide(mN * mN);
  }
}
