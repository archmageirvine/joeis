package irvine.oeis.triangle;

import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * Generate the rows of a triangle T[n,k] directly from a lambda expression for each element.
 * In contrast to {@link Triangle}, this class handles offsets, and starting values for row and column indexes.
 * @author Georg Fischer
 */
public abstract class LambdaTriangle extends Triangle implements DirectArray {

  private int mRowMin; // starting row index
  private int mColMin; // starting column index
  private int mRow; // current row index
  private int mCol; // current column index
  private BiFunction<Integer, Integer, Z> mLambda; // expression for T[n, k]

  /**
   * Constructor with offset, default origin [0, 0] and a lambda expression.
   * @param offset first index of the sequence
   * @param lambda function for T[n, k]
   */
  public LambdaTriangle(final int offset, final BiFunction<Integer, Integer, Z> lambda) {
    this(offset, 0, 0, lambda);
  }

  /**
   * Constructor with offset, origin and lambda expression.
   * @param offset first index of the sequence
   * @param rowMin index of first row
   * @param colMin index of first column
   * @param lambda function for T[n, k]
   */
  public LambdaTriangle(final int offset, final int rowMin, final int colMin, final BiFunction<Integer, Integer, Z> lambda) {
    super(offset);
    mRowMin = rowMin;
    mRow = mRowMin - 1;
    mCol = mRow;
    mColMin = mRowMin;
    mLambda = lambda;
    mHasRAM = true; // legacy
  }

  /**
   * Retrieve the indexes of the origin (the coordinates of the upper left corner)
   */
  public int[] getOrigin() {
    return new int[]{mRowMin, mColMin};
  }

  /**
   * Compute an element of the LambdaTriangle with defined indexes.
   * @param n row index
   * @param k column index
   * @return T[n, k]
   */
  public Z a(final int n, final int k) {
    if (k < mColMin || k > n) {
      return Z.ZERO;
    }
    return mLambda.apply(n, k);
  }

  /**
   * Return next term, reading the triangle row by row from left to right,
   * starting with T[mRowMin, mColMin].
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mCol > mRow) {
      ++mRow;
      mCol = mColMin;
    }
    return mLambda.apply(mRow, mCol);
  }

}
