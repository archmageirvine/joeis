package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A sequence comprising the simple transform of another sequence.
 * Example include negating terms, taking the absolute values, adding a
 * constant, multiplying by a constant, squaring terms etc.
 * @author Sean A. Irvine
 */
public class OrdinalTransformSequence extends AbstractSequence {

  private final int mStart; // first index of underlying sequence
  private final AbstractSequence mSeq; // underlying sequence
  private final ArrayList<Z> mArr = new ArrayList<>(128);

  /**
   * Creates a simple transform of an existing sequence.
   * @param offset offset of new sequence
   * @param seq underlying sequence
   * @param start first index of seq
   */
  public OrdinalTransformSequence(final int offset, final AbstractSequence seq, final int start) {
    super(offset);
    mSeq = seq;
    mStart = start;
    if (mStart == 1) {
      mArr.add(Z.ZERO); // [0] not used for offset = 1
    }
  }

  /**
   * Creates a simple transform of an existing sequence.
   * @param offset offset of new sequence
   * @param seq underlying sequence
   */
  public OrdinalTransformSequence(final int offset, final AbstractSequence seq) {
    this (offset, seq, 1);
  }

  @Override
  public Z next() {
    final Z t = mSeq.next();
    mArr.add(t);
    int count = 1;
    for (int k = mArr.size() - 2; k >= mStart; --k) {
      if (mArr.get(k).equals(t)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
