package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399784 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A399784 extends ParallelPermutationSequence {

  private boolean[] mPowers = {};

  /** Construct the sequence. */
  public A399784() {
    super(17);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p[0] != 0) {
      return false;
    }
    if (pos <= 1) {
      return true;
    }
    if (pos == p.length && (p[1] > p[p.length - 1] || !mPowers[p[p.length - 1] + p[0] + 2])) {
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
