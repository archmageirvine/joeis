package irvine.oeis.transform;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Base class for sequences of elementary symmetric functions.
 * derived from another sequence.
 * @author Georg Fischer
 */
public class ElementarySymmetricFunctionSequence implements Sequence {

  protected final Sequence mSeq; // underlying sequence
  private int mN; // current index
  private int mOrder; // order of the function/polynomial, number of multiplicative factors in the sum.
  private Z mA; // previous term of the sequence
  private Z mProd; // product of the terms of the underlying sequence

  /**
   * Construct the sequence with default parameters.
   * @param seq underlying sequence
   */
  public ElementarySymmetricFunctionSequence(final Sequence seq) {
    this(1, -1, seq, 0);
  }

  /**
   * Construct the sequence with skip parameter.
   * @param seq underlying sequence
   * @param skip number of terms in the underlying sequence to be skipped initially.
   */
  public ElementarySymmetricFunctionSequence(final Sequence seq, final int skip) {
    this(1, -1, seq, skip);
  }

  /**
   * Construct the sequence with all parameters.
   * @param offset first index
   * @param order order of the polynomial, or -1 for (n-1)-st esf.
   * @param seq underlying sequence
   * @param skip number of terms in the underlying sequence to be skipped initially.
   */
  public ElementarySymmetricFunctionSequence(final int offset, final int order, final Sequence seq, int skip) {
    mSeq = seq;
    while (--skip >= 0) {
      mSeq.next();
    }
    mN = offset - 1;
    mOrder = order;
    mA = Z.ONE;
    mProd = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA;
    } else if (mN == 2) {
      final Z t = mSeq.next();
      final Z u = mSeq.next();
      mA = t.add(u);
      mProd = t.multiply(u);
      return mA;
    }
    final Z t = mSeq.next();
    //System.out.println("mN=" + mN + ", t=" + t + ", mProd=" + mProd + ", mA=" + mA);
    mA = mA.multiply(t).add(mProd);
    mProd = mProd.multiply(t);
    return mA;
  }
}
