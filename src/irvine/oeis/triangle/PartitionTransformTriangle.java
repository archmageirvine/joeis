package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * Triangle resulting from the application of Peter Luschny&apos;s Partition Transform to another sequence.
 * @author Georg Fischer
 */
public class PartitionTransformTriangle extends BaseTriangle {

  private final boolean mAccumul; // multiply by k!
  private final boolean mInverse; // whether to compute the inversion
  private final boolean mPrefix0; // whether to add a column [1,0,0,0...] at the left
  private final MemorySequence mSeq; // underlying sequence (= first column)
  private int mSkip = 0; // number of terms in underlying sequence to be skipped
  private int mN = -1; // current index
  private int mTri = -29; // next triangular number - for prefix0, not active with this setting
  private int mTrix = 0; // index of next triangular number

  /**
   * Constructor with sequence only.
   * @param seq underlying sequence
   */
  public PartitionTransformTriangle(final Sequence seq) {
    this(0, seq, 0, "");
  }

  /**
   * Constructor with offset and sequence only.
   * @param offset first index
   * @param seq underlying sequence
   */
  public PartitionTransformTriangle(final int offset, final Sequence seq) {
    this(offset, seq, 0, "");
  }

  /**
   * Constructor with offset and sequence only.
   * @param offset first index
   * @param seq underlying sequence
   * @param skip number of terms in underlying sequence to be skipped
   */
  public PartitionTransformTriangle(final int offset, final Sequence seq, final int skip) {
    this(offset, seq, skip, "");
  }

  /**
   * Compatibility constructor.
   * @param offset first index
   * @param seq underlying sequence
   * @param inverse whether to compute the inverse
   */
  public PartitionTransformTriangle(final int offset, final Sequence seq, final boolean inverse) {
    this(offset, seq, inverse, false);
  }

  /**
   * Compatibility constructor.
   * @param offset first index
   * @param seq underlying sequence
   * @param inverse whether to compute the inverse
   * @param accu whether to accumulate
   */
  public PartitionTransformTriangle(final int offset, final Sequence seq, final boolean inverse, final boolean accu) {
    this(offset, seq, 0, (inverse ? "i" : "") + (accu ? "a" : ""));
  }

  /**
   * Constructor with all parameters.
   * @param offset first index, must be &gt;= 0.
   * @param seq underlying sequence
   * @param skip number of terms in underlying sequence to be skipped
   * @param mode String indicating variants: i=inverse, a=accumulate, p=prefix with column [1,0,0,...]
   */
  public PartitionTransformTriangle(final int offset, final Sequence seq, final int skip, final String mode) {
    super(offset, 0, 0, n -> n + 1); // no row or column shift
    mSkip = skip;
    mSeq = mSkip == 0 ? MemorySequence.cachedSequence(seq) : MemorySequence.cachedSequence(new SkipSequence(seq, mSkip));
    mAccumul = mode.indexOf('a') >= 0;
    mInverse = mode.indexOf('i') >= 0;
    mPrefix0 = mode.indexOf('p') >= 0;
    mTri = mPrefix0 ? 0 : -29;
    if (!mInverse) {
      next();
    }
  }

  /**
   * Gets an element of the triangle.
   * @param n row number
   * @param k column number
   * @return T(n, k), or 0 for k &lt; 0 or k &gt; n.
   */
  protected Z get(final int n, final int k) {
    if (k > n || k < 0) {
      return Z.ZERO;
    } else if (n == 0) {
      return Z.ONE;
    } else if (n == mRow && k <= mCol) {
      return mLastRow[k];
    }
    // else if (n < mRow) {
    return mRows.get(n)[k];
  }

  @Override
  protected void addRow() {
    super.addRow();
    // System.out.println("addRow, mRow=" + mRow + ", mRowLen=" + mRowLen + ", mLastRow.length=" + mLastRow.length);
    int k = mRowLen - 1;
    final int m = k;
    if (mInverse) {
      mLastRow[k--] = get(m - 1, m - 1).divide(mSeq.a(0));
      // System.out.println("inverse, m=" + m + ", k=" + k + ", a(0)=" + mSeq.a(0) + ", mLastRow.length=" + mLastRow.length);
      while (k >= 0) {
        Z sum = Z.ZERO;
        for (int i = 0; i <= m - k + 1; ++i) {
          sum = sum.add(mSeq.a(i).multiply(k + i > m || mLastRow[k + i] == null ? Z.ZERO : mLastRow[k + i]));
        }
        mLastRow[k] = get(m - 1, k - 1).subtract(sum).divide(mSeq.a(0));
        --k;
      }
    } else { // not inverse
      mLastRow[k--] = get(m - 1, m - 1).multiply(mSeq.a(0));
      // System.out.println("m=" + m + ", k=" + k + ", a(0)=" + mSeq.a(0) + ", mLastRow.length=" + mLastRow.length);
      while (k >= 0) {
        Z sum = Z.ZERO;
        for (int i = 0; i <= m - k + 1; ++i) {
          sum = sum.add(mSeq.a(i).multiply(get(m - i - 1, k - 1)));
        }
        mLastRow[k] = sum;
        --k;
      }
    }
  }

  @Override
  protected Z compute(final int n, final int k) {
    return mLastRow[k];
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return get(n, k);
  }

  @Override
  public Z next() {
    ++mCol;
    // System.out.println("next, mCol=" + mCol + ", mRow=" + mRow + ", mRowLen=" + mRowLen);
    if (mCol >= mRowLen) {
      addRow();
    }
    if (!mInverse && mCol == 0 && mRow >= 1) {
      if (!mPrefix0) {
        ++mCol;
      }
    }
    if (mInverse && mRow <= 0) {
      return Z.ONE;
    } else {
      final Z result = mLastRow[mCol];
      return result;
    }
  }
}
