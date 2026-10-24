package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Row products of a {@link Sequence} that is (interpreted as) a {@link Triangle}.
 * The underlying sequence usually has keyword <code>tabl</code>;
 * it is processed sequentially without using Triangle access methods.
 * Internally the Triangle starts with <code>T(0,0)</code>, but only the
 * <code>tabl</code> structure is necessary.
 * @author Georg Fischer
 */
public class RowProductSequence extends AbstractSequence {

  private final Sequence mSeq;
  private int mRow; // current row number
  private boolean mNonZero; // whether to take nonzero row elements only (default: false, take all row elements)

  /**
   * Row sums of another sequence that is (interpreted as) a {@link Triangle}.
   * @param offset first index of the target sequence
   * @param seq sequence to compute row sums of
   */
  public RowProductSequence(final int offset, final Sequence seq) {
    this(offset, seq, false);
  }

  /**
   * Row sums of another sequence that is (interpreted as) a {@link Triangle}.
   * @param offset first index of the target sequence
   * @param seq sequence to compute row sums of
   * @param nonZero whether to take nonzero row elements only
   */
  public RowProductSequence(final int offset, final Sequence seq, final boolean nonZero) {
    super(offset);
    mSeq = seq;
    mRow = 0;
    mNonZero = nonZero;
  }

  @Override
  public Z next() {
    Z prod = Z.ONE;
    if (mNonZero) {
      for (int icol = 0; icol <= mRow; ++icol) {
        final Z elem = mSeq.next();
        if (!elem.isZero()) {
          prod = prod.multiply(elem);
        }
      }
    } else {
      for (int icol = 0; icol <= mRow; ++icol) {
        prod = prod.multiply(mSeq.next());
      }
    }
    ++mRow;
    return prod;
  }
}
