package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the binomial transform of another sequence.
 * @author Georg Fischer
 */
public class BinomialTransform extends AbstractSequence {

  private final Sequence mSeq;
  private final boolean mInverse; // whether to do an InverseBinomialTransform
  private int mRow; // current row number of Pascal's triangle
  private final ArrayList<Z> mBinom;
  private final ArrayList<Z> mTerms;

  /**
   * Creates a new binomial transform sequence of the given sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public BinomialTransform(final int offset, final Sequence seq) {
    this(offset, seq, 0, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence.
   * @param seq underlying sequence
   */
  public BinomialTransform(final Sequence seq) {
    this(0, seq, 0, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   */
  public BinomialTransform(final int offset, final Sequence seq, final int skip) {
    this(offset, seq, skip, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   */
  public BinomialTransform(final Sequence seq, final int skip) {
    this(0, seq, skip, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   * @param inverse true for an inverse binomial transform, false for a binomial transform
   */
  public BinomialTransform(final int offset, final Sequence seq, int skip, final boolean inverse) {
    super(offset);
    mSeq = seq;
    mInverse = inverse;
    while (--skip >= 0) {
      mSeq.next();
    }
    mTerms = new ArrayList<>();
    mBinom = new ArrayList<>();
    mRow = -1;
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   * @param inverse true for an inverse binomial transform, false for a binomial transform
   */
  public BinomialTransform(final Sequence seq, final int skip, final boolean inverse) {
    this(0, seq, skip, inverse);
  }

  @Override
  public Z next() {
    ++mRow;
    mTerms.add(mSeq.next());
    mBinom.add(Z.ONE);
    Z oldBinom = Z.ZERO; // previous binomial coefficient
    Z sum = Z.ZERO;
    for (int iCol = 0; iCol <= mRow; ++iCol) {
      final Z absBinom = mBinom.get(iCol);
      final Z sigBinom = mInverse && (iCol & 1) != (mRow & 1) ? absBinom.negate() : absBinom;
          // inverse Pascal's triangle: even columns in odd rows and odd columns in even rows are negative
      sum = sum.add(sigBinom.multiply(mTerms.get(iCol)));
      mBinom.set(iCol, oldBinom.add(absBinom));
      oldBinom = absBinom;
    }
    return sum;
  }
}
