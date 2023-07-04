package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence reversing the order of the rows of a regular triangle.
 * @author Sean A. Irvine
 */
public class ReversedRowTriangle extends AbstractSequence {

  private final Sequence mSeq;
  private Z[] mRow;
  private int mN = -1;
  private int mM = 0;

  /** Construct the sequence. */
  public ReversedRowTriangle(final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mRow = new Z[mN + 1];
      for (int k = 0; k <= mN; ++k) {
        mRow[k] = mSeq.next();
      }
    }
    return mRow[mN - mM];
  }
}
