package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A decimal expansion defined by a sequence giving a continued fraction expansion.
 * @author Sean A. Irvine
 */
public class DecimalExpansionFromContinuedFractionSequence extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;

  /**
   * A decimal expansion defined by a sequence giving a continued fraction expansion.
   * @param offset sequence offset
   * @param seq underlying sequence.
   */
  public DecimalExpansionFromContinuedFractionSequence(final int offset, final Sequence seq) {
    super(offset, new CR() {
      private Z mH0 = Z.ZERO;
      private Z mK0 = Z.ONE;
      private Z mH1 = Z.ONE;
      private Z mK1 = Z.ZERO;
      private final Sequence mCf = seq;

      private void step() {
        final Z a = mCf.next();
        final Z h = a.multiply(mH1).add(mH0);
        final Z k = a.multiply(mK1).add(mK0);
        mH0 = mH1;
        mK0 = mK1;
        mH1 = h;
        mK1 = k;
      }

      @Override
      protected Z approximate(final int precision) {
        final int workingPrecision = precision - EXTRA_PRECISION;
        Z prev = Z.ZERO;
        while (true) {
          step();
          final CR z = CR.valueOf(new Q(mH1, mK1));
          final Z zz = z.getApprox(workingPrecision);
          if (zz.equals(prev)) {
            return scale(zz, -EXTRA_PRECISION);
          }
          prev = zz;
        }
      }
    });
  }

  /**
   * A decimal expansion defined by a sequence giving a continued fraction expansion.
   * @param seq underlying sequence.
   */
  public DecimalExpansionFromContinuedFractionSequence(final Sequence seq) {
    this(0, seq);
  }
}
