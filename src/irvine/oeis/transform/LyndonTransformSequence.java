package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the Lyndon transform of another sequence.
 * @author Sean A. Irvine
 */
public class LyndonTransformSequence extends InverseEulerTransform {

  private boolean mFirst = true;

  /**
   * Creates a new Lyndon transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public LyndonTransformSequence(final Sequence seq, final int skip) {
    super(new SimpleTransformSequence(seq, Z::negate), skip);
  }

  /**
   * Creates a new Lyndon transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public LyndonTransformSequence(final int offset, final Sequence seq, final int skip) {
    super(new SimpleTransformSequence(offset, seq, Z::negate), skip);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return t == null ? null : t.negate();
  }
}
