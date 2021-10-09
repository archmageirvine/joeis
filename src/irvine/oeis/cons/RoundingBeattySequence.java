package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence like a Beatty sequence but formed by rounding the result rather than the floor function.
 * @author Sean A. Irvine
 */
public abstract class RoundingBeattySequence extends RealConstantSequence {

  private long mN;

  protected RoundingBeattySequence(final int offset, final CR x) {
    super(offset, x);
    mN = offset - 1;
  }

  @Override
  public Z next() {
    return getCR().multiply(++mN).round();
  }
}
