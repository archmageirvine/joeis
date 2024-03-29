package irvine.oeis.transform;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Exponential reversion of another sequence.
 * @author Sean A. Irvine
 */
public class ExponentialRevertTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mPoly = RING.empty();
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private final Sequence mSeq;

  {
    mPoly.add(Q.ZERO);
  }

  /**
   * Construct the sequence.
   * @param seq underlying sequence
   */
  protected ExponentialRevertTransformSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Construct with offset and a sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  protected ExponentialRevertTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  @Override
  public Z next() {
    mPoly.add(new Q(mSeq.next(), mF.factorial(++mN)));
    return RING.reversion(mPoly, mN).coeff(mN).multiply(mF.factorial(mN)).toZ();
  }
}
