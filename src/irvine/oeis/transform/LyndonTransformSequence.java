package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransform;
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
    super(new NegationTransformSequence(seq), skip);
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
