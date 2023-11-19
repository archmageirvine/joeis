package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;

/**
 * A sequence which is the transformation of another sequence by a DirectSequence.
 * @author Georg Fischer
 */
public class DirectTransformSequence extends AbstractSequence {

  private final DirectSequence mSeqA;
  private final Sequence mSeqB;

  /**
   * Constructor with parameters.
   * @param offset index of first term of the resulting sequence
   * @param seqA outer, direct sequence
   * @param seqB inner sequence
   */
  public DirectTransformSequence(final int offset, final DirectSequence seqA, final Sequence seqB) {
    super(offset);
    mSeqA = seqA;
    mSeqB = seqB;
    int ofb = seqB.getOffset();
    while (ofb < offset) {
      seqB.next();
      ++ofb;
    }
  }

  @Override
  public Z next() {
    return mSeqA.a(mSeqB.next());
  }
}
