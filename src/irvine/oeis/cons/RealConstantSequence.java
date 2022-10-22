package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.oeis.AbstractSequence;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class RealConstantSequence extends AbstractSequence {

  private final CR mX;

  /**
   * Construct a sequence with given offset and based on a particular real number.
   * @param offset the offset of the sequence
   * @param x computable real number
   */
  protected RealConstantSequence(final int offset, final CR x) {
    super(offset);
    mX = x;
  }

  /**
   * Get the real number underlying this sequence.
   * @return real number
   */
  public CR getCR() {
    return mX;
  }
}
