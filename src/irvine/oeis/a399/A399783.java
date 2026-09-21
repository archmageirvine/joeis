package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399783 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A399783 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A399783() {
    super(7);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 1) {
      return true;
    }
    if (pos == p.length && (p[0] > p[p.length - 1] || Predicates.POWER.is(p[0] + p[p.length - 1] + 2))) {
      return false;
    }
    return Predicates.POWER.is(p[pos - 1] + p[pos - 2] + 2);
  }
}
