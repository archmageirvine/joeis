package irvine.oeis.triangle;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * Generate the rows of a triangle T(n,k).
 * In contrast to {@link #Triangle}, this class handles offsets, row and column shifts.
 * @author Georg Fischer
 */
public abstract class BaseTriangle extends Triangle implements SequenceWithOffset {

  protected int mOffset; // first index of sequence, only used for b-files
  // super.mRow is 0-based current row index
  // super.mCol is 0-based current row index
  protected int mRowShift; // shifts mRow to first row index
  protected int mColShift; // shifts mCol to first columns index
  // super.mLastRow[] is 0-based last (current) row
  protected int mRowLen; // length of the current row
  protected Function<Integer, Integer> mSizeFct; // maps 0-based mRow to mLastCol + 1

  /**
   * Empty constructor with offset 0, corner (0,0)
   */
  public BaseTriangle() {
    this(0, 0, 0);
  }

  /**
   * Constructor with offset and corner
   * @param offset first index of the sequence
   * @param rowShift index of first row
   * @param colShift index of first column
   */
  public BaseTriangle(final int offset, final int rowShift, final int colShift) {
    this(offset, rowShift, colShift, n -> n + 1);
  }

  /**
   * Constructor with offset, corner and row size function.
   * @param offset first index of the sequence
   * @param rowShift index of first row
   * @param colShift index of first column
   * @param sizeFct function for the row sizes
   */
  public BaseTriangle(final int offset, final int rowShift, final int colShift, final Function<Integer, Integer> sizeFct) {
    mOffset = offset;
    mRowShift = rowShift;
    mColShift = colShift;
    mSizeFct = sizeFct;
    mRow = -1;
    mCol = -1;
    mRowLen = -1;
    mHasRAM = true; // default: with random access
  }

  /**
   * Get the offset of the sequence.
   * Used for b-file creation.
   * @return first index
   */
  @Override
  public int getOffset() {
    return mOffset;
  }

  /**
   * Set the offset for the sequence or for a subclass that represents a column or row.
   * @param offset first index
   */
  public void setOffset(final int offset) {
    mOffset = offset;
  }

  /**
   * Increase the row index, add a new, empty row and reset the column index.
   * The row length is <code>mRow + 1</code>.
   */
  protected void addRow() {
    ++mRow;
    mRowLen = mSizeFct.apply(mRow);
    add(new Z[mRowLen]);
    mLastRow = get(mRow);
    mCol = 0;
  }

  /**
   * Get the length of a row.
   * This is the length of the Z array for the row.
   * @param n 0-based number of the row
   * @return <code>n + 1</code> for <code>tabl</code> triangles, or some other value for irregular (<code>tabf</code>) triangles
   */
  protected int getRowLength(final int n) {
    return get(n).length;
  }

  /**
   * Set the value of a column in the last row.
   * @param k 0-based column number
   * @param value T(n,k)
   */
  protected void set(final int k, final Z value) {
    mLastRow[k] = value;
  }

  /**
   * Compute an element of the triangle.
   * The requirement is that all previous elements <code>T(0..n-1,k), T(n,0..k-1)</code>were already computed.
   * The default implementation here is Pascal's rule.
   * @param n row number
   * @param k column number
   * @return T(n,k)
   */
  protected Z compute(final int n, final int k) {
    return triangleElement(mRow + mRowShift, mCol + mColShift);
  }

  /**
   * Compute an element of the BaseTriangle with shifted indexes.
   * In contrast to {@link #get} and {@link #compute}, the indexes are shifted by {@link #mRowShift}, {@link #mColShift}.
   * @param n shifted row index
   * @param k shifted column index
   * @return T(n, k)
   */
  public abstract Z triangleElement(final int n, final int k);

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mCol >= mRowLen) {
      addRow();
    }
    final Z result = compute(mRow, mCol);
    set(mCol, result);
    return result;
  }
}
