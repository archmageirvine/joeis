package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Return a subsection of a triangle.
 * The target elements are generated row by row,
 * @author Georg Fischer
 */
public class SubTriangle extends AbstractSequence {

  protected Sequence mS; // underlying source triangle
  protected int mRofs; // row offset
  protected int mRow; // target row number
  protected int mCol; // target column number

  /**
   * Constructor with a Sequence.
   * The first row and the diagonal of the underlying sequence are ignored.
   * @param s sequence for source triangle
   */
  public SubTriangle(final Sequence s) {
    this(s, 1);
  }

  /**
   * Constructor with a Sequence.
   * @param s sequence for source triangle
   * @param rofs row offset for the source triangle
   */
  public SubTriangle(final Sequence s, final int rofs) {
    super(0);
    mS = s;
    mRofs = rofs;
    mRow = 0;
    mCol = 0;
  }

  /**
   * Return next term, reading the source triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    while (mCol + mRofs > mRow) {
      while (mCol <= mRow) {
        mS.next();
        ++mCol;
      }
      ++mRow;
      mCol = 0;
    }
    ++mCol;
    return mS.next();
  }
}
