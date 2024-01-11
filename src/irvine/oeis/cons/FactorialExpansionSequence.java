package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Sequence formed by the factorial expansion of a computable real number.
 * @author Georg Fischer
 */
public class FactorialExpansionSequence extends AbstractSequence {

  private int mN;
  private Z mF; // factorial
  private final CR mX;

  /**
   * Construct a new expansion of a computable real number.
   * @param offset first index
   * @param x the number to be expanded
   */
  public FactorialExpansionSequence(final int offset, final CR x) {
    super(offset);
    mN = offset - 1;
    mX = x;
    mF = Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN == getOffset()) {
      return mX.floor();
    }
    final Z f1 = mF;
    mF = mF.multiply(mN);
    return mX.multiply(mF).floor().subtract(mX.multiply(f1).floor().multiply(mN));
  }
}
