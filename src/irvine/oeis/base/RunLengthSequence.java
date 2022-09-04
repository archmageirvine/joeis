package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Run lengths in another sequence.
 * @author Sean A. Irvine
 */
public class RunLengthSequence implements Sequence {

  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Run lengths sequence.
   * @param seq underlying sequence
   */
  public RunLengthSequence(final Sequence seq) {
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
