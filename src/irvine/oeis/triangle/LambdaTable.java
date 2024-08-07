package irvine.oeis.triangle;

import java.util.function.BiFunction;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Generate the rows of a triangle T[n,k] directly from a lambda expression for each element.
 * In contrast to {@link Triangle}, this class handles offsets, and starting values for row and column indexes.
 * If the upper index in the range is smaller than the lower index, that row is silently skipped.
 * @author Georg Fischer
 */
public abstract class LambdaTable extends AbstractSequence implements DirectArray {

  private int mColMax; // ending column index
  private int mRow; // current row index
  private int mCol; // current column index
  private final Function<Integer, Integer[]> mColRange; // expression for { mColMin, mColMax }
  private final BiFunction<Integer, Integer, Z> mLambda; // expression for T[n, k]

  /**
   * Constructor with offset, origin and lambda expression.
   * @param offset first index of the sequence
   * @param rowMin index of first row
   * @param colRange index of first column
   * @param lambda function for T[n, k]
   */
  public LambdaTable(final int offset, final int rowMin, final Function<Integer, Integer[]> colRange, final BiFunction<Integer, Integer, Z> lambda) {
    super(offset);
    // starting row index
    mRow = rowMin - 1;
    mColRange = colRange;
    mColMax = 0;
    mCol = 0; // forces a row increment in next()
    mLambda = lambda;
  }

  /**
   * Compute an element of the LambdaTable with shifted indexes.
   * @param n shifted row index
   * @param k shifted column index
   * @return T[n, k]
   */
  public Z a(final int n, final int k) {
    final Integer[] range = mColRange.apply(n);
    if (k < range[0] || k > range[1]) {
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
    while (++mCol > mColMax) {
      ++mRow;
      final Integer[] range = mColRange.apply(mRow);
      mColMax = range[1];
      mCol = range[0] - 1;
    }
    return mLambda.apply(mRow, mCol);
  }

}
