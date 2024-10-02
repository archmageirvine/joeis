package irvine.oeis.triangle;

import java.util.ArrayList;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.Sequence;

/**
 * A matrix <code>D(n, k), n, k &gt;= 1</code> derived from a sequence <code>s</code> and its complement <code>t</code>.
 * <code>t</code> must start with <code>t(1) = 1</code>. 
 * The rows contain <code>t(n), s(t(n)), s(s(t(n))) ...</code>. The sequence is a permutation of the natural numbers.
 * Cf. the explanation in A191426.
 * @author Georg Fischer
 */
public class DispersionArray extends Triangle {

  private final int mRow0; // first row index
  private final int mCol0; // first columns index 
  private final int mDir; // direction: +1 = ascending, -1 = descending
  private final Sequence mSeq; // the underlying sequence s
  private final ArrayList<Z> mS; // cache for the underlying sequence s, starting at offset 1, with terms <= 1 skipped
  private Z mT; // last computed term of the complementary sequence t
  private int mSix; // index of the least element in s that is > mT
  private static final boolean DEBUG = "true".equals(System.getProperty("oeis.verbose"));

  /**
   * Constructor with offset, sequence, default corner (1,1) and direction (-1 = descending)
   * @param offset first index 
   * @param seq underlying sequence
   */
  public DispersionArray(final int offset, final Sequence seq) {
    this(offset, 1, 1, -1, seq);
  }

  /**
   * Constructor with offset, lambda expression, default corner (1,1) and direction (-1 = descending)
   * @param offset first index 
   * @param lambda expression for a simple sequence
   */
  public DispersionArray(final int offset, final Function<Integer, Z> lambda) {
    this(offset, 1, 1, -1, lambda);
  }

  /**
   * Constructor with corner indices and direction-
   * @param offset first index of the resulting sequence
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   * @param lambda expression for a simple sequence
   */
  public DispersionArray(final int offset, final int row0, final int col0, final int dir, final Function<Integer, Z> lambda) {
    this(offset, row0, col0, dir, new LambdaSequence(0, lambda));
  }

  /**
   * Constructor with corner indices and direction-
   * @param offset first index of the resulting sequence
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   * @param seq underlying sequence
   */
  public DispersionArray(final int offset, final int row0, final int col0, final int dir, final Sequence seq) {
    super(offset); 
    hasRAM(false);
    mRow0 = row0;
    mCol0 = col0;
    mDir = dir;
    mSeq = seq;
    mS = new ArrayList<Z>(16);
    mS.add(Z.ZERO); // [0] is not used, always start at offset 1
    Z term = mSeq.next();
    while (term.compareTo(Z.ONE) <= 0) { // skip any terms <= 1
      term = mSeq.next();
    }
    mSix = 1;
    mS.add(term); // mS[1] > 1
    mT = Z.ONE;
  }

  /**
   * Access the underlying sequence directly.
   * @param index index of the desired element of <code>s</code>
   * @return <code>s[index]</code>
   */
  private Z getS(final int index) {
    while (index >= mS.size()) {
      final Z s = mSeq.next();
//*   if (sDebug) {
//*     System.out.println("  gets(" + index + "): " + s + ", size=" + mS.size());
//*   }
      mS.add(s);
    }
    return mS.get(index);
  }

  /**
   * Advance to the next term of the complementary sequence <code>t</code>.
   */
  private void advanceT() {
    mT = mT.add(1);
    Z nextS = getS(mSix);
    while (mT.compareTo(nextS) >= 0) {
      mT = nextS.add(1);
      nextS = getS(++mSix);
    }
    // now mT < getS(mSix)
//* if (sDebug) {
//*   System.out.println("  advanceT() -> " + mT + ", mSix=" + mSix + ", nextS=" + nextS);
//* }
  }

  /**
   * Retrieve an element of the matrix that was previously computed by {@link #matrixElement}.
   * The indices are shifted with <code>mRow0, mCol0</code>.
   * @param i shifted row number
   * @param j shifted column number
   * @return M(i, j)
   */
  public Z getElement(final int i, final int j) {
//* if (sDebug) {
//*   System.out.println("getElement(" + i + ", " + j + ") -> [" + String.valueOf(j - mCol0) + "," + String.valueOf(i - mRow0 - (j - mCol0)) + "]");
//* }
    return mDir < 0
      ? super.get(j - mCol0 + i - mRow0, i - mRow0)
      : super.get(i - mRow0            , j - mCol0 + i - mRow0)
      ;
  }

  /**
   * Compute an element of the matrix.
   * The indices are shifted with <code>mRow0, mCol0</code>.
   * @param i shifted row number
   * @param j shifted column number
   * @return M(i, j)
   */
  public Z matrixElement(final int i, final int j) {
//* if (sDebug) {
//*   System.out.println("matrixElement(" + i + ", " + j + ")");
//* }
    if (j == 1) { // column 1 = sequence t
      if (i > 1) {
        advanceT();
      }
      return mT;
    }
    final Z elem = getElement(i, j - 1);
//* if (sDebug) {
//*   System.out.println("  elem=" + elem);
//* }
    return getS(elem.intValueExact());
  }

  /**
   * Compute an element of the resulting triangle.
   * @param n row number
   * @param k column number
   * @return T(n, k)
   */
  protected Z compute(final int n, final int k) {
    return mDir < 0 
        ? matrixElement(k + mRow0    , n - k + mCol0) // T(n, k) = (k + row0    , n - k + col0) descending
        : matrixElement(n - k + mRow0, k + mCol0)     // T(n, k) = (n - k + row0, k + col0    ) ascending
        ;
  }

}
