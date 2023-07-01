package irvine.oeis.triangle;

import irvine.math.z.Z;

/**
 * Rearrange a matrix M as a {@link Triangle} by enumerating the antidiagonals
 * in descending (NE -&gt; SW) or ascending (SW -&gt; NE) order.
 * The upper left corner of the matrix is <code>M(row0,col0)</code>,
 * while the resulting Triangle always starts with <code>T(0, 0)</code>.
 * @author Georg Fischer
 */
public class UpperLeftTriangle extends Triangle {

  protected int mRow; // current row index n
  protected int mCol; // current column index k
  protected int mRow0; // first row index
  protected int mCol0; // first columns index 
  protected int mDir; // direction: +1 = ascending, -1 = descending
  protected int mOffset; // first index

  /**
   * Empty constructor.
   */
  public UpperLeftTriangle() {
    this(0, 0, 0, -1);
  }

  /**
   * Constructor with corner index, descending.
   * @param row0 first row index
   */
  public UpperLeftTriangle(final int row0) {
    this(row0 == 0 ? 0 : 1, row0, row0, -1);
  }

  /**
   * Constructor with corner indices and direction-
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   */
  public UpperLeftTriangle(final int row0, final int col0, final int dir) {
    this(row0 == 0 ? 0 : 1, row0, col0, dir);
  }

  /**
   * Constructor with corner indices and direction-
   * @param offset first index of the resulting sequence
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   */
  public UpperLeftTriangle(final int offset, final int row0, final int col0, final int dir) {
    mOffset = offset;
    mRow0 = row0;
    mCol0 = col0;
    mDir = dir;
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
   * Retrieves an element of the matrix that was previously computed by {@link #matrixElement}.
   * The indices are shifted with <code>mRow0, mCol0</code>.
   * @param i shifted row number
   * @param j shifted column number
   * @return M(i, j)
   */
  public Z getElement(final int i, final int j) {
    return mDir < 0
      ? super.get(i + j - mCol0, i - mRow0)
      : super.get(i - mCol0, i + j - mRow0)
      ;
  }

  /**
   * Computes an element of the matrix.
   * The indices are shifted with <code>mRow0, mCol0</code>.
   * @param i shifted row number
   * @param j shifted column number
   * @return M(i, j)
   */
  public Z matrixElement(final int i, final int j) {
    return Z.valueOf(i + j);
  }

  /**
   * Computes an element of the resulting triangle.
   * @param n row number
   * @param k column number
   * @return T(n,k)
   */
  protected Z compute(final int n, final int k) {
    return mDir < 0 
        ? matrixElement(k + mRow0, n - k + mCol0) // T(n,k)=M(k+row0,n-k+col0) descending
        : matrixElement(n - k + mRow0, k + mCol0) // T(n,k)=M(n-k+row0,k+col0) ascending
        ;
  }

}
