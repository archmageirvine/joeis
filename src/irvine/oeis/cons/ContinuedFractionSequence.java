package irvine.oeis.cons;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence generating the continued fraction of a computable real.
 * @author Sean A. Irvine
 */
public class ContinuedFractionSequence implements Sequence {

  private final DecimalExpansionSequence mSeq;
  private final int mAccuracy;
  protected long mN = -1;

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   * @param accuracy accuracy to pass down
   */
  public ContinuedFractionSequence(final DecimalExpansionSequence seq, final int accuracy) {
    mSeq = seq;
    mAccuracy = accuracy;
  }

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   */
  public ContinuedFractionSequence(final DecimalExpansionSequence seq) {
    this(seq, 500);
  }

  @Override
  public Z next() {
    mSeq.next(); // ensure precision
    // Re-step every time due to changing precision
    final Convergents conv = new Convergents(mSeq.getCR(), mAccuracy);
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      conv.next();
    }
    return conv.frac();
  }

}
