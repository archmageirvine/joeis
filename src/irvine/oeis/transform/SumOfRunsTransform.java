package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Sum of the runs in another sequence.
 * @author Sean A. Irvine
 */
public class SumOfRunsTransform extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Sum of run lengths sequence.
   * @param seq underlying sequence
   */
  public SumOfRunsTransform(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Sum of run lengths sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public SumOfRunsTransform(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mPrev = mSeq.next();
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    Z t;
    do {
      sum = sum.add(mPrev);
      t = mSeq.next();
    } while (t.equals(mPrev));
    mPrev = t;
    return sum;
  }
}
