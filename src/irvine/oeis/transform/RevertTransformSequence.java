package irvine.oeis.transform;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Revert transform.
 * @author Sean A. Irvine
 */
public class RevertTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected final Sequence mSeq;
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());

  {
    mA.add(Z.ZERO);
  }

  /**
   * Construct a sequence which is the revert transform of another sequence.
   * @param seq underlying sequence
   */
  public RevertTransformSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  /**
   * Construct a sequence which is the revert transform of another sequence.
   * offset first index of target sequence
   * @param seq underlying sequence
   */
  public RevertTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(mSeq.next());
    return RING.reversion(mA, n).coeff(n);
  }
}
