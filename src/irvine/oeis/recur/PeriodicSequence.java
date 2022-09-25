package irvine.oeis.recur;

import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;

/**
 * Base case for certain periodic sequences generated verbatim from a list.
 * @author Sean A. Irvine
 */
public class PeriodicSequence implements SequenceWithOffset {

  private final Z[] mSeq;
  private int mN = -1;
  private int mOffset = 0; // default

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final long... seq) {
    mSeq = new Z[seq.length];
    for (int k = 0; k < seq.length; ++k) {
      mSeq[k] = Z.valueOf(seq[k]);
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final Z... seq) {
    mSeq = seq;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final List<Z> seq) {
    mSeq = seq.toArray(new Z[0]);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final String seq) {
    mSeq = ZUtils.toZ(seq);
  }

  @Override
  public Z next() {
    ++mN;
    mN %= mSeq.length;
    return mSeq[mN];
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  public void setOffset(final int offset) {
    mOffset = offset;
  }

  /**
   * Gets the finite list of terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return Arrays.copyOf(mSeq, mSeq.length);
  }

}

