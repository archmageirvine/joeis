package irvine.oeis.triangle;

import irvine.math.z.Z;

/**
 * A triangle, square array or irregular table supporting direct access of the terms.
 * @author Georg Fischer
 */
public interface DirectArray {

  /**
   * Return the specified term of the array.
   * The implementation must check the ranges for n ( <= nMin) and k (kMin <= k <= kMax)
   * and return Z.ZERO outside of these ranges.
   * @param n row index
   * @param k column index
   * @return A[n, k]
   */
  Z a(final int n, final int k);

}
