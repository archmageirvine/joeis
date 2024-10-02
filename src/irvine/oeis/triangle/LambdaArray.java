package irvine.oeis.triangle;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Rearrange a square array A as a {@link Triangle} by enumerating the antidiagonals
 * in descending (NE -&gt; SW) or ascending (SW -&gt; NE) order.
 * The upper left corner (the origin) of the matrix is <code>A[rowMin, colMin]</code>.
 * This class is similar to {@link UpperLeftTriangle}.
 * @author Georg Fischer
 */
public class LambdaArray extends AbstractSequence implements DirectArray {

  private static final int DEFOFF = 0;
  protected int mRow; // current row index n
  protected int mCol; // current column index k
  private final int mRowMin; // first row index
  private final int mColMin; // first columns index
  private final int mDir; // direction: +1 = ascending, -1 = descending antidiagonals
  private BiFunction<Integer, Integer, Z> mLambda; // expression for A[n, k]

  /**
   * Constructor with offset, lambda expression, and a default origin [0, 0] with descending antidiagonals.
   * @param offset first index of the resulting sequence
   */
  public LambdaArray(final int offset) {
    this(offset, 0, 0, -1);
  }

  /**
   * Constructor with offset, lambda expression, and a default origin [0, 0] with descending antidiagonals.
   * @param offset first index of the resulting sequence
   * @param lambda expression for A[n, k]
   */
  public LambdaArray(final int offset, final BiFunction<Integer, Integer, Z> lambda) {
    this(offset, 0, 0, -1, lambda);
  }

  /**
   * Constructor with offset, origin (coordinates of the upper left corner), direction of the antidiagonals, and a lambda expression.
   * @param offset first index of the resulting sequence
   * @param rowMin first row index
   * @param colMin first column index
   * @param dir direction: +1 = ascending, -1 = descending
   * @param lambda expression for A[n, k]
   */
  public LambdaArray(final int offset, final int rowMin, final int colMin, final int dir, final BiFunction<Integer, Integer, Z> lambda) {
    this(offset, rowMin, colMin, dir);
    mLambda = lambda;
  }

  /**
   * Constructor with offset, origin (coordinates of the upper left corner), direction of the antidiagonals, and a lambda expression.
   * @param offset first index of the resulting sequence
   * @param rowMin first row index
   * @param colMin first column index
   * @param dir direction: +1 = ascending, -1 = descending
   */
  public LambdaArray(final int offset, final int rowMin, final int colMin, final int dir) {
    super(offset);
    mRowMin = rowMin;
    mColMin = colMin;
    mDir = dir;
    if (mDir < 0) {
      mRow = mRowMin - 1;
      mCol = mColMin;
    } else {
      mRow = mRowMin - 1;
      mCol = mRow;
    }
    mLambda = null;
  }

  /**
   * Return next term, reading the upper left triangle by descending or ascending antidiagonals,
   * starting with A[mRowMin, mCOl0].
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (mDir < 0) { // descending
      if (--mCol < mColMin) {
        ++mRow;
        mCol = mRow;
      }
    } else { // ascending
      if (++mCol > mRow) {
        ++mRow;
        mCol = mColMin;
      }
    }
    // System.out.println("mRow=" + mRow + ", n=" + (mRow - mCol + mRowMin) + ", k=" + mCol + ", result=" + mLambda.apply(mRow - mCol + mRowMin, mCol));
    return mLambda.apply(mRow - mCol + mRowMin, mCol);
  }

  /**
   * Gets an element of the triangle.
   * @param n row number
   * @param k column number
   * @return A[n, k], or 0 for k &lt; 0 or k &gt; n.
   */
  public Z a(final int n, final int k) {
    if (k < mColMin || k > n) {
      return Z.ZERO;
    }
    return mLambda.apply(n, k);
  }

  /**
   * Retrieve the indexes of the upper left corner and the direction
   * @return [mRowMin, mColMin, mDir]
   */
  public int[] getOrigin() {
    return new int[]{mRowMin, mColMin, mDir};
  }

}
