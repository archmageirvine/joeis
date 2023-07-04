package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the negation of another sequence.
 * @author Sean A. Irvine
 */
public class NegationTransformSequence extends AbstractSequence {

  private final Sequence mSeq;

  /**
   * Creates a new negation sequence.
   * @param seq underlying sequence
   */
  public NegationTransformSequence(final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
  }

  @Override
  public Z next() {
    final Z t = mSeq.next();
    return t == null ? null : t.negate();
  }
}
