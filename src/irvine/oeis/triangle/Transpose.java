package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Transpose of a triangle T: all rows of T are reversed.
 * The underlying sequence should have the "<code>tabl</code>" structure,
 * but it does not need to extend {@link Triangle}.
 * @author Georg Fischer
 */
public class Transpose extends AbstractSequence {

  protected Sequence mSeq; // source sequences (with "tabl" structure)
  protected int mRow; // current row index n
  protected int mCol; // current column index k
  protected Z[] mLastRow;

  /**
   * Constructor with a Sequence.
   * @param seq sequence for source triangle
   */
  public Transpose(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mRow = -1;
    mCol = 0; // start with first element T(0,0)
  }

  /**
   * Constructor with a Sequence.
   * @param seq sequence for source triangle
   */
  public Transpose(final Sequence seq) {
    this(0, seq);
  }

  /**
   * Increases <code>mRow</code> and reads the reverse of the next row from the source triangle into <code>mLastRow</code>
   */
  protected void addRow() {
    ++mRow;
    mLastRow = new Z[mRow + 1];
    for (int k = 0; k <= mRow; ++k) {
      mLastRow[mRow - k] = mSeq.next();
    }
    mCol = 0;
  }

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (mCol > mRow) {
      addRow();
    }
    return mLastRow[mCol++];
  }
}
