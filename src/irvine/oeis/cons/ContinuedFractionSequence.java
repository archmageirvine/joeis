package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
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

  /**
   * Construct a continued fraction expansion from an existing sequence.
   * Only works for an underlying sequence consisting of single digits.
   * @param seq underlying sequence
   */
  public ContinuedFractionSequence(final Sequence seq) {
    this(new DecimalExpansionSequence(1, new CR() {
      private Z mNum = Z.ZERO;
      private Z mDen = Z.ONE;
      @Override
      protected Z approximate(final int precision) {
        while (mNum.bitLength() <= -precision) {
          final Z digit = seq.next();
          if (digit.compareTo(Z.TEN) >= 0) {
            throw new UnsupportedOperationException("Value too large in underlying sequence: " + digit);
          }
          mNum = mNum.multiply(10).add(digit);
          mDen = mDen.multiply(10);
        }
        return CR.valueOf(new Q(mNum, mDen)).getApprox(precision);
      }
    }));
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
