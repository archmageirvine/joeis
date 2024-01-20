package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.base.RunsBaseSequence;

/**
 * Construct the run-length transform of the given sequence.
 * @author Georg Fischer
 */
public class RunLengthTransformSequence extends RunsBaseSequence {

  private final DirectSequence mSeq;
  private final int mBase;
  private int mN;

  /**
   * Construct the run-length transform of the given sequence.
   * @param offset first index
   * @param seq sequence
   */
  public RunLengthTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mBase = 2;
    mSeq = DirectSequence.create(seq);
    mN = offset - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ONE;
    if (mN == 0) {
      return result;
    }
    //System.out.print("# mN=" + mN + ":");
    final int[] rls = super.getRunLengths(Z.valueOf(mN), mBase);
    for (int irl = 0; irl < rls.length; irl += 2) {
      result = result.multiply(mSeq.a(rls[irl]));
      //System.out.print(" [" + irl + "]" + rls[irl]);
    }
    //System.out.println();
    return result;
  }
}
