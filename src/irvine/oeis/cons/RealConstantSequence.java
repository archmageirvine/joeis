package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.oeis.Sequence;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class RealConstantSequence implements Sequence {

  private final int mOffset;
  private final CR mX;

  /**
   * Construct a sequence with given offset and based on a particular real number.
   * @param offset the offset of the sequence
   * @param x computable real number
   */
  protected RealConstantSequence(final int offset, final CR x) {
    mOffset = offset;
    mX = x;
  }

  /**
   * Get the real number underlying this sequence.
   * @return real number
   */
  public CR getCR() {
    return mX;
  }

  protected int getOffset() {
    return mOffset;
  }
}
