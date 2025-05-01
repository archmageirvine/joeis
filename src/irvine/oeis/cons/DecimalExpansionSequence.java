package irvine.oeis.cons;

import java.io.Serializable;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public class DecimalExpansionSequence extends RealConstantSequence implements Serializable {

  /**
   * Create an expansion from an arbitrary sequence.  This sometimes useful
   * when there is a need to treat a sequence as real value via <code>getCR</code>.
   * @param seq underlying sequence
   * @return sequence as a <code>DecimalExpansionSequence</code>
   */
  public static DecimalExpansionSequence create(final Sequence seq) {
    if (seq instanceof DecimalExpansionSequence) {
      return (DecimalExpansionSequence) seq;
    }

    // Note: currently this makes no effort to obey offsets and probably only
    // works properly for numbers between 0 and 1.
    // Also, it is assumed the input sequence has values 0-9.
    return new DecimalExpansionSequence(new CR() {
      private Z mV = Z.ZERO;
      private Z mD = Z.ONE;

      @Override
      protected Z approximate(final int precision) {
        while (mD.bitLength() <= -precision) {
          mD = mD.multiply(10);
          mV = mV.multiply(10).add(seq.next());
        }
        return CR.valueOf(new Q(mV, mD)).getApprox(precision);
      }
    });
  }

  private final int mBase;
  private final int mLookaheadDigitsHeuristic; // lookahead of digits needed to ensure correct result
  private String mS = "";
  protected int mN;

  /**
   * Construct a new expansion of a computable real number.
   * @param offset OEIS offset
   * @param x the number
   * @param base base for expansion
   * @param lookaheadDigits number of digits to lookahead before deciding on the current digit
   */
  public DecimalExpansionSequence(final int offset, final CR x, final int base, final int lookaheadDigits) {
    // "offset" here is supposed to be number of digits before decimal point.
    // For us anything non-negative means we generate straight away, but a
    // negative value means we should skip some leading 0s
    super(offset, x);
    mBase = base;
    // Occasionally we encounter numbers (e.g. A119925) where an unusual number of
    // digits must be examined in order to determine what the next digit it.
    // This parameter controls that.
    mLookaheadDigitsHeuristic = lookaheadDigits;
    // We want to set mN to one less than first term to generate from the expansion.
    // For most numbers (non-negative offset) we want to start generating from the
    // first digit of the expansion.  But if the offset is negative -- e.g. for a
    // constant like 0.0001 -- we need to skip the leading zeros.
    // Caveat: some offsets in the OEIS and likely incorrect!
    mN = offset >= 0 ? -1 : 1 - offset;
  }

  /**
   * Construct a new expansion of a computable real number.
   * @param offset OEIS offset
   * @param x the number
   * @param base base for expansion
   */
  public DecimalExpansionSequence(final int offset, final CR x, final int base) {
    this(offset, x, base, 32);
  }

  protected DecimalExpansionSequence(final int offset, final CR x) {
    this(offset, x, 10);
  }

  /**
   * Construct the decimal expansion of the given value.
   * @param x number
   */
  public DecimalExpansionSequence(final CR x) {
    this(1, x);
  }

  protected void ensureAccuracy(final int n) {
  }

  private void updateString() {
    while (mN >= mS.length() - mLookaheadDigitsHeuristic) {
      final int newLength = 2 * mS.length() + 1;
      ensureAccuracy(newLength);
      mS = getCR().toString(newLength, mBase);
    }
  }

  /**
   * Get the number base.
   * @return the base
   */
  public int getBase() {
    return mBase;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      updateString();
      final char c = mS.charAt(mN);
      if (c == '.') {
        // Skip any decimal point
        continue;
      }
      if (c == '0' && mN == 0) {
        // Skip leading zero
        continue;
      }
      return Z.valueOf(c <= '9' ? c - '0' : c - 'a' + 10);
    }
  }
}
