package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the cycle, indistinct, unlabeled transform of another sequence.
 * Same as the <tt>CIK</tt> transform.
 * @author Sean A. Irvine
 */
public class CycleTransformSequence extends InverseMobiusTransformSequence {

  /**
   * Creates the transform.
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public CycleTransformSequence(final Sequence seq, final int skip) {
    super(new LyndonTransformSequence(seq, skip), 1, Z.ONE);
  }

  /**
   * Creates the transform.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public CycleTransformSequence(final int offset, final Sequence seq, final int skip) {
    super(offset, new LyndonTransformSequence(seq, skip), 1, Z.ONE);
  }
}
