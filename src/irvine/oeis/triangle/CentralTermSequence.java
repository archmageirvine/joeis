package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Central terms of a {@link Sequence} that is (interpreted as) a {@link Triangle}.
 * The underlying sequence usually has keyword <code>tabl</code>;
 * it is processed sequentially without using Triangle access methods.
 * Internally the Triangle starts with <code>T(0,0)</code>, but only the
 * <code>tabl</code> structure is necessary.
 * The default offset is 0.
 * @author Georg Fischer
 */
public class CentralTermSequence extends AbstractSequence {

  private final AbstractSequence mSeq;
  private final DirectArray mTriangle; // != null iff mSeq instanceof DirectArray
  private int mRow; // current row number
  private int mTrix; // current triangular number
  private int mN; // current index of target sequence (always starting at 0)

  /**
   * Central terms of another sequence that is (interpreted as) a {@link Triangle}.
   * @param offset first index of the target sequence
   * @param seq sequence to compute row sums of
   */
  public CentralTermSequence(final int offset, final AbstractSequence seq) {
    super(offset);
    mSeq = seq;
    mRow = 0;
    mTrix = 0;
    mN = -1;
    if (seq instanceof DirectArray) {
      mTriangle = (DirectArray) seq;
      mRow = seq.getOffset() - 1;
    } else {
      mTriangle = null;
    }
  }

  @Override
  public Z next() {
    if (mTriangle == null) { // not DirectArray
      while (true) {
        ++mN;
        final Z result = mSeq.next();
        if (mN == mTrix * 4) {
          ++mRow;
          mTrix = ((mRow + 1) * mRow) / 2;
          return result;
        }
      }
    } else {
      ++mRow;
      return mTriangle.a(2 * mRow, mRow);
    }
  }
}
