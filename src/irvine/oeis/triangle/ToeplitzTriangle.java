package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * Compute a triangle where all columns are the same underlying sequence.
 * All diagonals are constant.
 * See also ReluctantSequence (all columns constant) and WrappedConstantTriangle (all rows constant).
 * .
 * @author Georg Fischer
 */
public class ToeplitzTriangle extends BaseTriangle {

  private final MemorySequence mSeq; // the sequence for the columns

  /**
   * Constructor with offset and column vector
   * @param offset first index of target triangle
   * @param seq the sequence for the columns
   */
  public ToeplitzTriangle(final int offset, final Sequence seq) {
    super(offset, 0, 0);
    hasRAM(true);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.a(n - k);
  }

}
