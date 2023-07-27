package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000007;

/**
 * Compute a triangle from an underlying triangle by prepending it with a column vector.
 * @author Georg Fischer
 */
public class PrependColumn extends Triangle {

  private final Sequence mTri; // source triangle
  private final Sequence mVector; // a column vector to be prepended (default A000007 = [1,0,0,0,0...])
  private int mRow = -1;
  private int mCol = 0;

  /**
   * Constructor with offset, a Sequence and A000007 as first column
   * @param offset first index of target triangle
   * @param tri sequence for source triangle
   */
  public PrependColumn(final int offset, final Sequence tri) {
    this(offset, tri, new A000007());
  }
  /**
   * Constructor with offset, a Sequence and a leading column vector
   * @param offset first index of target triangle
   * @param tri sequence for source triangle
   * @param vector the sequence for the leading column
   */
  public PrependColumn(final int offset, final Sequence tri, final Sequence vector) {
    setOffset(offset);
    mTri = tri;
    mVector = vector;
  }

  @Override
  public Z next() {
    if (mCol > mRow) {
      ++mRow;
      mCol = 0;
    }
    if (mCol == 0) {
      ++mCol; 
      return mVector.next();
    }
    ++mCol;
    return mTri.next();
  }

}
