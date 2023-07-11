package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A056193.
 * @author Sean A. Irvine
 */
public class LittleHankelTransform extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final Sequence mSeq;
  private Z mA;
  private Z mB;

  /**
   * Construct the little Hankel transform of the given sequence.
   * @param seq sequence
   */
  public LittleHankelTransform(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mA = mSeq.next();
    mB = mSeq.next();
  }

  /**
   * Construct the little Hankel transform of the given sequence.
   * @param seq sequence
   */
  public LittleHankelTransform(final Sequence seq) {
    this(DEFOFF, seq);
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mSeq.next();
    return mA.square().subtract(t.multiply(mB));
  }
}
