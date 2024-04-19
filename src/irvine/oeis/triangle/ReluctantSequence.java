package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * Compute a triangle in which row n lists the first n terms of some underlying sequence.
 * All columns are constant.
 * See also ToeplitzTriangle (all diagonals constant) and WrappedConstantTriangle (all rows constant).
 * @author Georg Fischer
 */
public class ReluctantSequence extends BaseTriangle {

  private final MemorySequence mSeq; // the underlying sequence
  private final int mRow = -1;
  private final int mCol = 0;

  /**
   * Constructor with offset and a row sequence
   * @param offset first index of target triangle
   * @param seq the sequence for all rows
   */
  public ReluctantSequence(final int offset, final Sequence seq) {
    super(offset, 0, 0);
    hasRAM(true);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.a(k);
  }

}
