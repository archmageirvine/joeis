package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the INVERT transform of another sequence.
 * @author Georg Fischer
 */
public class InvertTransform extends AbstractSequence {

  private final Sequence mSeq;
  private int mN;
  private final ArrayList<Z> mTar; // buffer for target sequence
  private final ArrayList<Z> mSrc; // buffer for source sequence
  private final int mKStart; // low value for index <code>k</code>

  /**
   * Creates a new INVERT transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   */
  public InvertTransform(final int offset, final Sequence seq) {
    this(offset, seq, 0, 1);
  }

  /**
   * Creates a new INVERT transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   */
  public InvertTransform(final int offset, final Sequence seq, final int skipNo) {
    this(offset, seq, skipNo, 1);
  }

  /**
   * Creates a new INVERT transform sequence of the given sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param skipNo number terms in underlying sequence to be skipped, default 0
   * @param kStart low value for index <code>k</code>, default 1
   */
  public InvertTransform(final int offset, final Sequence seq, final int skipNo, final int kStart) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mKStart = kStart;
    mTar = new ArrayList<Z>();
    mSrc = new ArrayList<Z>();
    int srcOffset = mSeq.getOffset();
    while (--srcOffset >= 0) {
      mSrc.add(Z.ZERO);
    }
    int sk = skipNo;
    while (--sk >= 0) {
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    mTar.add(Z.ZERO);
    if (mN == 0) {
      sum = Z.ONE;
      mSrc.add(mSeq.next());
    } else {
      while (mN > mSrc.size() - 1) {
        mSrc.add(mSeq.next());
      }
      for (int k = mKStart; k <= mN; ++k) {
        sum = sum.add(mTar.get(mN - k).multiply(mSrc.get(k)));
      }
    }
    mTar.set(mN, sum);
    return sum;
  }
}
