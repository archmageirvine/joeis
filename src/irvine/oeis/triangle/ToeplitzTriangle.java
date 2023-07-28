package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * Compute a triangle from an underlying triangle by prepending it with a column vector.
 * @author Georg Fischer
 */
public class ToeplitzTriangle extends BaseTriangle {

  private final MemorySequence mSeq; // a column vector to be prepended (default A000007 = [1,0,0,0,0...])

  /**
   * Constructor with offset, a Sequence and a leading column vector
   * @param offset first index of target triangle
   * @param seq the sequence for the leading column
   */
  public ToeplitzTriangle(final int offset, final Sequence seq) {
    super(offset, 0, 0);
    hasRAM(true);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mSeq.a(n - k);
  }

}
