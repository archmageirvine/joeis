package irvine.oeis.transform;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the inverse INVERT transform of another sequence.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class InverseInvertTransform extends AbstractSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeq;
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seq underlying
   */
  public InverseInvertTransform(final Sequence seq) {
    this(0, seq);
  }

  /**
   * Creates a new inverse INVERT transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   */
  public InverseInvertTransform(final int offset, final Sequence seq) {
    this(offset, seq, 0);
  }

  /**
   * Creates a new inverse INVERT transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param skip number of terms to skip in underlying sequence
   */
  public InverseInvertTransform(final int offset, final Sequence seq, final int skip) {
    super(offset);
    mSeq = seq;
    mA.add(Z.ONE);
    for (int k = 0; k < skip; ++k) {
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    mA.add(mSeq.next());
    return RING.coeff(RING.one(), mA, ++mN).negate();
  }
}
