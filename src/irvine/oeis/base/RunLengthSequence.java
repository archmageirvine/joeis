package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Run lengths in another sequence.
 * @author Sean A. Irvine
 */
public class RunLengthSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Run lengths sequence.
   * @param seq underlying sequence
   */
  public RunLengthSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Run lengths sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public RunLengthSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mPrev = mSeq.next();
  }

  @Override
  public Z next() {
    long c = 0;
    Z t;
    do {
      ++c;
      t = mSeq.next();
    } while (t.equals(mPrev));
    mPrev = t;
    return Z.valueOf(c);
  }
}
