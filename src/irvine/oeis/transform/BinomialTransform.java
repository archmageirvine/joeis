package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the binomial transform of another sequence.
 * @author Georg Fischer
 */
public class BinomialTransform implements Sequence {

  private final Sequence mSeq;
  private final boolean mInverse; // whether to do an InverseBinomialTransform
  private int mRow; // current row number of Pascal's triangle
  private final ArrayList<Z> mBinom;
  private final ArrayList<Z> mTerms;

  /**
   * Creates a new binomial transform sequence of the given sequence.
   * @param seq underlying sequence
   */
  public BinomialTransform(final Sequence seq) {
    this(seq, 0, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   */
  public BinomialTransform(final Sequence seq, int skip) {
    this(seq, skip, false);
  }

  /**
   * Creates a new binomial transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   * @param seq underlying sequence
   * @param skip number of terms of the source sequence to be skipped before the transform
   * @param inverse true for an InverseBinomialTransform, false for a BinomialTransorm
   */
  public BinomialTransform(final Sequence seq, int skip, final boolean inverse) {
    mSeq = seq;
    mInverse = inverse;
    while (--skip >= 0) {
      mSeq.next();
    }
    mTerms = new ArrayList<>();
    mBinom = new ArrayList<>();
    mRow = -1;
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
    /*
      System.out.println("  mRow=" + mRow + ", iCol=" + iCol + ", oldBinom=" + oldBinom + ", sigBinom=" + sigBinom + ", term=" + mTerms.get(iCol));
      for (int i = 0; i <= mRow; ++i) {
        System.out.print("  " + mBinom.get(i));
      }
      System.out.println();
    */
      sum = sum.add(sigBinom.multiply(mTerms.get(iCol)));
      mBinom.set(iCol, oldBinom.add(absBinom));
      oldBinom = absBinom;
    }
    return sum;
  }
}
