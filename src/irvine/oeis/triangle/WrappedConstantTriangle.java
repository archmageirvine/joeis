package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Generate the rows of a triangle <code>T(n,k)</code> with sequences for 
 * the left and right border, and a constant term for all inner elements of a row.
 * @author Georg Fischer
 */
public class WrappedConstantTriangle extends WrappedRecurrence {

  /**
   * Triangle with the same sequence for both borders.
   * @param offset first index of target sequence
   * @param seqLeft sequence for both borders <code>T(n,0)</code>
   */
  public WrappedConstantTriangle(final int offset, final Sequence seqLeft) {
    super(offset, seqLeft);
  }

  /**
   * Triangle with a value for both borders.
   * @param offset first index of target sequence
   * @param constLeft constant for both borders <code>T(n,0)</code> and <code>T(n,n)</code>
   */
  public WrappedConstantTriangle(final int offset, final String constLeft) {
    super(offset, constLeft);
  }

  /**
   * Triangle with two sequences for the borders.
   * @param offset first index of target sequence
   * @param seqLeft sequence for the left border <code>T(n,0)</code>
   * @param seqRight sequence for the right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedConstantTriangle(final int offset, final Sequence seqLeft, final Sequence seqRight) {
    super(offset, seqLeft, seqRight);
  }

  /**
   * Triangle with a sequence and a value for the borders.
   * @param offset first index of target sequence
   * @param seqLeft sequence for the left border <code>T(n,0)</code>
   * @param constRight constant right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>;
   */
  public WrappedConstantTriangle(final int offset, final Sequence seqLeft, final String constRight) {
    super(offset, seqLeft, constRight);
  }

  /**
   * Triangle with a value and a sequence for the borders.
   * @param offset first index of target sequence
   * @param constLeft constant left border <code>T(n,0)</code>
   * @param seqRight sequence for the right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedConstantTriangle(final int offset, final String constLeft, final Sequence seqRight) {
    super(offset, constLeft, seqRight);
  }

  /**
   * Triangle with two values for the borders.
   * @param offset first index of target sequence
   * @param constLeft constant left border <code>T(n,0)</code>
   * @param constRight constant right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedConstantTriangle(final int offset, final String constLeft, final String constRight) {
    super(offset, constLeft, constRight);
  }

  /**
   * Computes an element of the triangle.
   * @param n row number
   * @param k column number
   * @return the constant element for the current row
   */
  @Override
  protected Z compute(final int n, final int k) {
    final Z result;
    if (k < 0 || k > n) { // outside, for safety only
      result = Z.ZERO;
    } else if (k == 0 || k == n) { 
      result = get(n, k); // borders were already set in addRow
    } else {
      result = getPlus();
    }
    return result;
  }
}
