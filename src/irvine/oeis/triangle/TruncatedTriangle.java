package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Compute a triangle from an underlying triangle by omitting a number of the leading columns.
 * @author Georg Fischer
 */
public class TruncatedTriangle extends Triangle {

  private final Sequence mTri; // source triangle
  private final int mSkip; // default number of columns to be skipped 
  private int mRow = 0;
  private int mCol = 0;

  /**
   * Constructor with offset and a Triangle.
   * The leftmost colum is skipped.
   * @param offset first index of target triangle
   * @param tri sequence for source triangle
   */
  public TruncatedTriangle(final int offset, final Sequence tri) {
    this(offset, tri, 1);
  }

  /**
   * Constructor with offset, a Sequence and the number of columns to be skipped.
   * @param offset first index of target triangle
   * @param tri sequence for source triangle
   * @param skip number of columns to be skipped
   */
  public TruncatedTriangle(final int offset, final Sequence tri, final int skip) {
    setOffset(offset);
    mTri = tri;
    mSkip = skip;
  }

  @Override
  public Z next() {
    Z result = mTri.next();
    while (mCol < mSkip) {
      ++mCol;
      if (mCol > mRow) {
        ++mRow;
        mCol = 0;
      }
      result = mTri.next();
    }
    ++mCol;
    if (mCol > mRow) {
      ++mRow;
      mCol = 0;
    }
    return result;
  }

}
