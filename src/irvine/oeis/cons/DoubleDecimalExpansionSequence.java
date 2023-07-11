package irvine.oeis.cons;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Sequence formed by the decimal expansion of a double. This should not be
 * used for exact values, but is appropriate for certain measured quantities
 * in physics.
 * @author Sean A. Irvine
 */
public abstract class DoubleDecimalExpansionSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private double mValue;
  private double mUncertainty;

  protected DoubleDecimalExpansionSequence(final int offset, final double value, final double uncertainty, final boolean trimLeadingZeros) {
    super(offset);
    mValue = value;
    mUncertainty = uncertainty;
    while (mValue >= 10) {
      mValue /= 10;
      mUncertainty /= 10;
    }
    if (trimLeadingZeros) {
      while (mValue < 0.1) {
        mValue *= 10;
        mUncertainty *= 10;
      }
    }
    if (mValue < 1) {
      next(); // skips leading 0 in expansions like 0.1223
    }
  }

  protected DoubleDecimalExpansionSequence(final double value, final double uncertainty, final boolean trimLeadingZeros) {
    this(DEFOFF, value, uncertainty, trimLeadingZeros);
  }

  protected DoubleDecimalExpansionSequence(final int offset, final double value, final double uncertainty) {
    this(offset, value, uncertainty, false);
  }

  protected DoubleDecimalExpansionSequence(final double value, final double uncertainty) {
    this(DEFOFF, value, uncertainty, false);
  }

  @Override
  public final Z next() {
    if (mUncertainty > 0.5) {
      throw new UnsupportedOperationException("Known certainty exceeded");
    }
    final double digit = Math.floor(mValue);
    mValue -= digit;
    mValue *= 10;
    mUncertainty *= 10;
    return Z.valueOf((long) digit);
  }
}
