package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * Return the boustrophedon transform of a sequence.
 * @author Sean A. Irvine
 */
public class BoustrophedonTransformSequence extends MemoryFunction2Sequence<Long, Z> {

  private final Sequence mSeq;
  private long mN = -1;

  /**
   * Create the boustrophedon transform of a sequence.
   * @param offset offset
   * @param seq underlying sequence
   */
  public BoustrophedonTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Create the boustrophedon transform of a sequence.
   * @param seq underlying sequence
   */
  public BoustrophedonTransformSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return mSeq.next();
    }
    return get(n, m - 1).add(get(n - 1, n - m));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
