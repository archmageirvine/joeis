package irvine.oeis.triangle;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;

/**
 * Select a column, row, diagonal or some other subsection of an array represented as the upper left triangle read by antidiagonals.
 * @author Georg Fischer
 */
public class ArraySelector implements SequenceWithOffset {

  private int mOffset; // first index of this sequence
  private final Sequence mSeq; // the underlying sequence
  protected int mRow0; // first row index
  protected int mCol0; // first columns index 
  private final Function<Integer, int[]> mSelect; // function giving a pair of indexes (coordinates) into the underlying triangle
  private boolean mHasRAM; // whether the underlying sequence has a random access method
  private UpperLeftTriangle mULTriangle; // <code>mSeq</code> casted into a Triangle when <code>mHasRAM = true</code>
  private int mN; // row index
  private int mTri; // current index of triangle element
  private int mStop; // sequential index of next relevant triangle element; this element is selected when <code>mTri == mStop</code>.

  /**
   * Construct the sequence with the same offset for rows and columns, and no random access method.
   * @param seq underlying sequence
   * @param row0 first row index of the triangle.
   * Usually we start with T(0,0) or T(1,1), so that <code>row0</code> is the offset of the triangle sequence.
   * @param select function giving a pair of indexes (coordinates) into the underlying triangle
   */
  public ArraySelector(final Sequence seq, final int row0, final Function<Integer, int[]> select) {
    this(seq, row0, row0, select);
  }

  /**
   * Construct the sequence with the same offset for rows and columns, and no random access method.
   * @param offset first index of this sequence
   * @param seq underlying sequence
   * @param row0 first row index of the triangle.
   * Usually we start with T(0,0) or T(1,1), so that <code>row0</code> is the offset of the triangle sequence.
   * @param select function giving a pair of indexes (coordinates) into the underlying triangle
   */
  public ArraySelector(final int offset, final Sequence seq, final int row0, final Function<Integer, int[]> select) {
    this(offset, seq, row0, row0, select, false);
  }

  /**
   * Construct the sequence with no random access method.
   * @param seq underlying sequence
   * @param row0 first row index of the triangle
   * @param col0 first column index of the triangle
   * @param select function giving a pair of indexes (coordinates) into the underlying triangle
   */
  public ArraySelector(final Sequence seq, final int row0, final int col0, final Function<Integer, int[]> select) {
    this(0, seq, row0, col0, select, false);
  }

  /**
   * Construct the sequence with no random access method.
   * @param offset first index of this sequence
   * @param seq underlying sequence
   * @param row0 first row index of the triangle
   * @param col0 first column index of the triangle
   * @param select function giving a pair of indexes (coordinates) into the underlying triangle
   */
  public ArraySelector(final int offset, final Sequence seq, final int row0, final int col0, final Function<Integer, int[]> select) {
    this(offset, seq, row0, col0, select, false);
  }

  /**
   * Construct the sequence.
   * @param offset first index of this sequence
   * @param seq underlying sequence
   * @param row0 first row index of the triangle
   * @param col0 first column index of the triangle
   * @param select function giving a pair of indexes (coordinates) into the underlying triangle
   * @param hasRAM Whether the underlying sequence has a random access method.
   * <code>hasRAM = true</code> is an optimization only.
   * If <code>hasRAM = false</code>, the resulting linear index into the flattened triangle must be strictly increasing,
   * and all elements of the underlying triangle are computed and investigated for their proper coordinates.
   */
  public ArraySelector(final int offset, final Sequence seq, final int row0, final int col0, final Function<Integer, int[]> select, final boolean hasRAM) {
    mOffset = offset;
    mSeq = seq;
    mRow0 = row0;
    mCol0 = col0;
    mSelect = select;
    mHasRAM = hasRAM;
    if (mSeq instanceof UpperLeftTriangle) {
      mULTriangle = (UpperLeftTriangle) mSeq;
      mHasRAM = mULTriangle.hasRAM();
    }
    mN = offset - 1;
    final int[] pair = mSelect.apply(mN + 1);
    final int n = pair[0] - mRow0;
    final int k = pair[1] - mCol0;
    mStop = n * (n + 1) / 2 + k;
    // System.out.println("init hasRAM=" + mHasRAM + ", n=" + n + ", k=" + k + ", mTri=" + mTri + ", mStop=" + mStop);
    mTri = -1; // we always think it would start with T(0,0)
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mHasRAM) {
        final int[] pair = mSelect.apply(mN);
        // System.out.println("next1 hasRAM=" + mHasRAM + ", n=" + pair[0] + ", k=" + pair[1] + ", result=" + mULTriangle.matrixElement(pair[0], pair[1]));
        return mULTriangle.matrixElement(pair[0], pair[1]);
      } else {
        ++mTri;
        Z result = mSeq.next();
        while (mTri < mStop) {
          ++mTri;
          result = mSeq.next();
        }
        // now mTri == mStop: proper result; compute next value of mStop
        final int[] pair = mSelect.apply(mN + 1);
        final int n = pair[0] - mRow0;
        final int k = pair[1] - mCol0;
        mStop = n * (n + 1) / 2 + k;
        // System.out.println("next2 hasRAM=" + mHasRAM + ", n=" + n + ", k=" + k + ", mTri=" + mTri + ", result=" + result + ", mStop=" + mStop);
        return result;
      }
    }
  }
}
