package irvine.oeis.triangle;

import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * Generate the rows of a triangle T(n,k) directly from a lambda expression for each element.
 * In contrast to {@link Triangle}, this class handles offsets, row and column shifts.
 * @author Georg Fischer
 */
public abstract class LambdaTriangle extends Triangle implements DirectArray {

  protected int mRowShift; // shifts mRow to first row index
  protected int mColShift; // shifts mCol to first columns index
  protected BiFunction<Integer, Integer, Z> mLambda; // expression for T(n, k)

  /**
   * Constructor with offset, corner and lambda expression.
   * @param offset first index of the sequence
   * @param rowShift index of first row
   * @param colShift index of first column
   * @param lambda function for T(n, k)
   */
  public LambdaTriangle(final int offset, final int rowShift, final int colShift, final BiFunction<Integer, Integer, Z> lambda) {
    super(offset);
    mRowShift = rowShift;
    mColShift = colShift;
    mLambda = lambda;
    mHasRAM = true;
  }

  /**
   * Constructor with offset, default corner (0,0) and lambda expression.
   * @param offset first index of the sequence
   * @param lambda function for T(n, k)
   */
  public LambdaTriangle(final int offset, final BiFunction<Integer, Integer, Z> lambda) {
    this(offset, 0, 0, lambda);
  }

  /**
   * Compute an element of the triangle.
   * The requirement is that all previous elements <code>T(0..n-1,k), T(n,0..k-1)</code>were already computed.
   * The default implementation here is Pascal's rule.
   * @param n row number
   * @param k column number
   * @return T(n, k)
   */
  protected Z compute(final int n, final int k) {
    return triangleElement(n + mRowShift, k + mColShift);
  }

  /**
   * Compute an element of the LambdaTriangle with shifted indexes.
   * In contrast to {@link #get} and {@link #compute}, the indexes are shifted by {@link #mRowShift}, {@link #mColShift}.
   * @param n shifted row index
   * @param k shifted column index
   * @return T(n, k)
   */
  protected Z triangleElement(final int n, final int k) {
    return mLambda.apply(n, k);
  }

  /**
   * Compute an element of the LambdaTriangle with shifted indexes.
   * In contrast to {@link #get} and {@link #compute}, the indexes are shifted by {@link #mRowShift}, {@link #mColShift}.
   * @param n shifted row index
   * @param k shifted column index
   * @return T(n, k)
   */
  public Z a(final int n, final int k) {
    return mLambda.apply(n, k);
  }

}
