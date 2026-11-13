
package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SumOfLikePowersSequence;

/**
 * A400327 Smallest positive integer that can be written as the sum of n distinct positive n-th powers and also as the sum of n+1 distinct positive (n+1)-th powers.
 * @author Sean A. Irvine
 */
public class A400327 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence a = new SumOfLikePowersSequence(mN, mN, mN, true);
    final Sequence b = new SumOfLikePowersSequence(mN + 1, mN + 1, mN + 1, true);
    return new IntersectionSequence(a, b).next();
  }
}
