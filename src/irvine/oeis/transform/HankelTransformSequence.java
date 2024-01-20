package irvine.oeis.transform;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * Construct the Hankel transform of the given sequence.
 * Example: A056229 Hankel transform of Euler totient function (A000010).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class HankelTransformSequence extends AbstractSequence {

  private final DirectSequence mSeq;
  private int mN;
  private final DefaultMatrix<Q> mMat = new DefaultMatrix<>(0, 0, Q.ZERO);

  /**
   * Construct the Hankel transform of the given sequence.
   * @param offset first index
   * @param seq sequence
   */
  public HankelTransformSequence(final int offset, final AbstractSequence seq) {
    this(offset, seq, 0);
  }

  /**
   * Construct the Hankel transform of the given sequence.
   * @param offset first index
   * @param seq sequence
   */
  public HankelTransformSequence(final int offset, final AbstractSequence seq, int skip) {
    super(offset);
    mN = offset - 1;
    mSeq = DirectSequence.create(seq);
    while (--skip >= 0) {
      next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> ring = new MatrixField<>(mN, Rationals.SINGLETON);
    mMat.setCols(mN);
    mMat.setRows(mN);
    for (int k = 0; k < mN; ++k) {
      mMat.set(mN - 1, k, new Q(mSeq.a(mN + k - 1)));
      mMat.set(k, mN - 1, new Q(mSeq.a(mN + k - 1)));
    }
    return ring.det(mMat).toZ();
  }
}
