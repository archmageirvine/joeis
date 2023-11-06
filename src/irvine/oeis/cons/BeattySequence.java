package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;

/**
 * Sequence formed by the Beatty expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class BeattySequence extends RealConstantSequence implements DirectSequence {

  protected int mN;

  protected BeattySequence(final int offset, final CR x) {
    super(offset, x);
    mN = offset - 1;
  }

  @Override
  public Z a(final Z n) {
    return getCR().multiply(n).floor();
  }

  @Override
  public Z a(final int n) {
    return getCR().multiply(n).floor();
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

