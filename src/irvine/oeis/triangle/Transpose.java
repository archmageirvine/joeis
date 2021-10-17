package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Transpose of a triangle S: all rows of S are reversed.
 * @author Georg Fischer
 */
public class Transpose extends Triangle {

  protected Triangle mS; // source triangle
  
  /**
   * Constructor with a Triangle.
   * @param s sequence for source triangle
   */
  public Transpose(final Triangle s) {
    mS = s;
  }
  
  /**
   * Constructor with a Sequence.
   * @param s sequence for source triangle
   */
  public Transpose(final Sequence s) {
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
   * @param n row number
   * @param k column number
   * @return <code>S(n, n-k)</code>, 
   */
  @Override
  protected Z compute(final int n, final int k) {
    return mS.get(n, n - k);
  }
}
