package irvine.oeis.transform;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ConstantFactorSequence;
import irvine.oeis.Sequence;

/**
 * Take the square root (or some other fractional exponent) of another sequence by using Euler and inverse Euler transform.
 * @author Georg Fischer
 */
public class RootSequence extends AbstractSequence {

  private final EulerTransform mET;

  /**
   * Construct the sequence.
   * @param offset first index
   * @param seq the underlying sequence
   * @param exponent take the sequence to this power
   */
  public RootSequence(final int offset, final Sequence seq, final Q exponent) {
    super(offset);
    mET = new EulerTransform(offset, new ConstantFactorSequence(new InverseEulerTransform(seq), exponent), 1);
  }

  /**
   * Constructor with long parameters.
   * @param seq the underlying sequence
   * @param num numerator of the exponent
   * @param den denominator of the exponent
   */
  public RootSequence(final int offset, final Sequence seq, final long num, final long den) {
    this(offset, seq, new Q(num, den));
  }

  @Override
  public Z next() {
    return mET.next();
  }
}
