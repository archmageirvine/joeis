package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Compute the inverse of a triangle: S * T = Identity.
 * The target elements are generated row by row,
 * @author Georg Fischer
 */
public class Inverse extends Triangle {

  protected Triangle mS; // source triangle
  
  /**
   * Constructor with a Triangle.
   * @param s sequence for source triangle
   */
  public Inverse(final Triangle s) {
    mS = s;
  }
  
  /**
   * Constructor with a Sequence.
   * @param s sequence for source triangle
   */
  public Inverse(final Sequence s) {
    this(Triangle.asTriangle(s));
  }
  
  /**
   * Increases <code>mRow</code>, adds a new, empty target row, resets the column index,
   * and advances the source sequence such that their <code>mRow</code> is completely filled.
   */
  protected void addRow() {
    super.addRow();
    for (int k = 0; k <= mRow; ++k) {
      mS.next();
    }
  }

  /**
   * Computes an element of the resulting triangle.
   * <code>addRow()</code> has made sure that rows <code>n</code> of both source triangles are completely filled.
   * @param n row number
   * @param k column number
   * @return <code>T(n,k) = (Identity(n,k) - sum(S(n,j) * T(j,k), j=0..n-1)) / S(n,k)</code>, 
   * or <code>null</code> if the Triangle is not invertible.
   */
  @Override
  protected Z compute(final int n, final int k) {
    Z result = Z.ZERO;
    for (int j = 0; j < n; ++j) {
      result = result.add(mS.get(n, j).multiply(get(j, k)));
    }
  /*
    System.out.println("---- S ----");
    for (int j = 0; j <= n; ++j) {
      mS.printRow(j);
    }
    System.out.println("---- T ----");
    for (int j = 0; j <= n; ++j) {
      this.printRow(j);
    }
    System.out.println("---- result=" + result + ", S(" + n + ", " + k + ")=" + mS.get(n, k));
  */
    final Z[] fraction = (n == k ? Z.ONE : Z.ZERO).subtract(result).divideAndRemainder(mS.get(n, n));
    return fraction[1].isZero() ? fraction[0] : null;
  }
}
