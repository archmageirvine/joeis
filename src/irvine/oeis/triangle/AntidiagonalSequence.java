package irvine.oeis.triangle;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Construct a sequence generated from antidiagonals of a function.
 * @author Sean A. Irvine
 */
public class AntidiagonalSequence extends AbstractSequence {

  private int mN;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mT;

  protected AntidiagonalSequence(final int offset, final MemoryFunctionInt2<Z> t) {
    super(offset);
    mN = offset - 1;
    mT = t;
  }

  protected AntidiagonalSequence(final MemoryFunctionInt2<Z> t) {
    this(0, t);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = getOffset();
    }
    return mT.get(mM, mN + getOffset() - mM);
  }
}

