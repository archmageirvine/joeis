package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;

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

  /**
   * Main method: compute the INVERT transform of a sequence.
   * @param args command line arguments:
   * <ul>
   * <li>-a A-number</li>
   * <li>-d debugging mode: 0=none,. 1=some, 2=more</li>
   * <li>-k start for loop variable <code>k</code></li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-s skip this number of terms in the underlying sequence (default 1)</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNo = null;
    Sequence mSeq = null;
    int offset = 0;
    int noTerms = 32;
    int skipNo = 0;
    int kStart = 1;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-a")) {
          aSeqNo = args[iarg++];
          mSeq = SequenceFactory.sequence(aSeqNo);
        } else if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-k")) {
          kStart = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-o")) {
          offset = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-s")) {
          skipNo = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    }

    final InvertTransform invts = new InvertTransform(offset, mSeq, skipNo, kStart);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(invts.next());
    }
    System.out.println();
  }
}
