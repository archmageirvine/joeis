package irvine.oeis.triangle;

import irvine.math.z.Z;

/**
 * Generate the rows of a triangle T(n,k) built with always two rows of the same length.
 * The sequence runs through T(n,k) for k = 0 to n/2 and n &gt;= 0.
 * @author Georg Fischer
 */
public class DoubleRowTriangle extends Triangle {

  protected int mHalf = -1; // mRow / 2

  /**
   * Empty constructor.
   * Generates an ordinary Pascal triangle (A007318).
   */
  public DoubleRowTriangle() {
    super();
  }

  /**
   * Constructor with initial terms.
   * @param inits list of initial terms
   * Generates a triangle with Pascal's rule.
   */
  public DoubleRowTriangle(final String inits) {
    super(inits);
  }

  /**
   * Constructor with initial terms.
   * @param inits array of initial terms
   * Generates a triangle with Pascal's rule.
   */
  public DoubleRowTriangle(final long... inits) {
    super(inits);
  }

  /**
   * Gets an element of the triangle.
   * The requirement is that all elements <code>T(0..n-1,m), T(n,0..k)</code>were already computed.
   * @param n row number
   * @param k column number
   * @return T(n,k), or 0 for k &lt; 0 or k &gt; n.
   */
  protected Z get(final int n, final int k) {
    if (k > mHalf || k < 0) {
      return Z.ZERO;
    } else if (n == mRow && k <= mCol) {
      return mLastRow[k];
    } else if (n < mRow) {
      return get(n)[k];
    } else {
      // System.err.println("assertion failed in DoubleRowTriangle.get(" + n + ", " + k + "), mIn=" + mIn);
      return Z.ZERO;
    }
  }

  /**
   * Sets a the value of a column in the last row.
   * @param k column number
   * @param value T(n,k)
   */
  protected void set(final int k, final Z value) {
    mLastRow[k] = value;
  }

  /**
   * Increases the row index, adds a new, empty row and resets the column index.
   */
  protected void addRow() {
    ++mRow;
    mHalf = mRow >> 1;
    add(new Z[mHalf + 1]);
    mLastRow = get(mRow);
    mCol = 0;
  }

  /**
   * Computes an element of the triangle.
   * The requirement is that all previous elements <code>T(0..n-1,k), T(n,0..k-1)</code>were already computed.
   * The default implementation here is Pascal's rule.
   * @param n row number
   * @param k column number
   * @return T(n,k)
   */
  protected Z compute(final int n, final int k) {
    ++mIn;
    final Z result;
    if (mIn < mLinit) {
      result = mInits[mIn]; // start with 1
    } else {
      result = get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
    }
    return result;
  }

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mCol > mHalf) {
      addRow();
    }
    final Z result = compute(mRow, mCol);
    // System.out.println("mRow=" + mRow + ", mCol=" + mCol + ", mHalf=" + mHalf);
    set(mCol, result);
    return result;
  }

}
