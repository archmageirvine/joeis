package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Row sums of a {@link Sequence} that is (interpreted as) a {@link Triangle}.
 * The underlying sequence usually has keyword <code>tabl</code>;
 * it is processed sequentially without using Triangle access methods.
 * Internally the Triangle starts with <code>T(0,0)</code>, but only the
 * <code>tabl</code> structure is necessary.
 * The default offset is 0.
 * @author Georg Fischer
 */
public class RowSumSequence extends AbstractSequence {

  protected final Sequence mSeq;
  protected int mRow; // current row number

  /**
   * Row sums of another sequence that is (interpreted as) a {@link Triangle}.
   * @param offset first index of the target sequence
   * @param seq sequence to compute row sums of
   */
  public RowSumSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mRow = 0;
  }

  /**
   * Row sums of another sequence that is (interpreted as) a {@link Triangle}.
   * @param seq sequence to compute row sums of
   */
  public RowSumSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (int icol = 0; icol <= mRow; ++icol) {
      sum = sum.add(mSeq.next());
    }
    ++mRow;
    return sum;
  }
}
