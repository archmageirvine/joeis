package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399783 Power chains: Number of essentially different linear (non-circular) permutations of the numbers 1 to n such that the sum of adjacent numbers is a perfect power, while the sum of the first and last numbers is not a perfect power.
 * @author Sean A. Irvine
 */
public class A399783 extends ParallelPermutationSequence {

  private boolean[] mPowers = {};

  /** Construct the sequence. */
  public A399783() {
    super(7);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 1) {
      return true;
    }
    if (pos == p.length && (p[0] > p[p.length - 1] || mPowers[p[0] + p[p.length - 1] + 2])) {
      return false;
    }
    return mPowers[p[pos - 1] + p[pos - 2] + 2];
  }

  @Override
  public Z next() {
    mPowers = new boolean[2 * (mN + 1)];
    for (int k = 4; k < mPowers.length; ++k) {
      mPowers[k] = Predicates.POWER.is(k);
    }
    return super.next();
  }
}
