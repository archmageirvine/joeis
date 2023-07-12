package irvine.oeis.triangle;

import irvine.math.z.Z;

/**
 * This class implements {@link Triangle}s that are built essentially with Pascal's rule,
 * but with two possible factors for the left and the right element to be added:
 * <code>T(n,k) = factorF(n,k)*T(n-1,k-1) + factorG(n,k)*T(n-1,k)</code>.
 * @author Georg Fischer
 */
public class ModifiedPascalTriangle extends Triangle {

  /** Construct the sequence. */
  public ModifiedPascalTriangle() {
    setOffset(0);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   */
  public ModifiedPascalTriangle(final int offset) {
    setOffset(offset);
  }

  /**
   * Function for the left source element.
   * Usually overwritten by subclasses.
   * @param n row index
   * @param k column index
   * @return the factor for <code>T(n-1,k-1)</code>.
   */
  protected Z factorF(final long n, final long k) {
    return Z.ONE; // Default: usual Pascal triangle
  }

  /**
   * Function for the right source element.
   * Usually overwritten by subclasses.
   * @param n row index
   * @param k column index
   * @return the factor for <code>T(n-1,k)</code>
   */
  protected Z factorG(final long n, final long k) {
    return factorF(n, k); // Default: the same as <code>factorF</code>
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(factorF(n, k))
      .add(get(n - 1, k).multiply(factorG(n, k)));
  }
}
