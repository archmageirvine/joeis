package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Row sums of a {@link Sequence} that is (interpreted as) a {@link Triangle}.
 * The underlying sequence usually has keyword <code>tabl</code>;
 * it is processed sequentially without using Triangle access methods.
 * Internally the Triangle starts with <code>T(0,0)</code>, but only the
 * <code>tabl</code> structure is necessary.
 * @author Georg Fischer
 */
public class RowSumSequence implements Sequence {

  protected final Sequence mSeq;
  protected int mRow; // current row number

  /**
   * Row sums of another sequence that is (interpreted as) a {@link Triangle}.
   * @param seq sequence to compute row sums of
   */
  public RowSumSequence(final Sequence seq) {
    mSeq = seq;
    mRow = 0;
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
