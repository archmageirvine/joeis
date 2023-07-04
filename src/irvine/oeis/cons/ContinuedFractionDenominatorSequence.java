package irvine.oeis.cons;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A sequence generating the continued fraction of a computable real.
 * @author Sean A. Irvine
 */
public class ContinuedFractionDenominatorSequence extends AbstractSequence {

  private final DecimalExpansionSequence mSeq;
  private long mN = -1;

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   */
  public ContinuedFractionDenominatorSequence(final DecimalExpansionSequence seq) {
    super(seq.getOffset());
    mSeq = seq;
  }

  @Override
  public Z next() {
    mSeq.next(); // ensure precision
    // Re-step every time due to changing precision
    final Convergents conv = new Convergents(mSeq.getCR());
    ++mN;
    for (int k = 0; k < mN; ++k) {
      conv.next();
    }
    return conv.next().den();
  }

}
