package irvine.oeis.closure;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Additive closure formed by sums of distinct elements of a strictly increasing sequence.
 * @author Sean A. Irvine
 */
public class DistinctAdditiveClosureSequence extends DistinctMultiplicativeClosureSequence {

  private static final int DEFOFF = 1;

  /**
   * Construct the additive closure of distinct elements of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence.
   */
  public DistinctAdditiveClosureSequence(final int offset, final Sequence seq) {
    super(offset, seq, Z.ZERO);
  }

  /**
   * Construct the additive closure of distinct elements of another sequence.
   * @param seq underlying sequence.
   */
  public DistinctAdditiveClosureSequence(final Sequence seq) {
    super(DEFOFF, seq, Z.ZERO);
  }

  @Override
  protected Z op(final Z a, final Z b) {
    return a.add(b);
  }

  @Override
  protected Z invOp(final Z a, final Z b) {
    return a.subtract(b);
  }
}
