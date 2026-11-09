
package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SumOfLikePowersSequence;

/**
 * A400327 allocated for Jean-Marc Rebert.
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
