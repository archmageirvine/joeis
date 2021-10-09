package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Sequence formed by the Beatty expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class BeattySequence extends RealConstantSequence {

  protected long mN;

  protected BeattySequence(final int offset, final CR x) {
    super(offset, x);
    mN = offset - 1;
  }

  @Override
  public Z next() {
    return getCR().multiply(++mN).floor();
  }
}
