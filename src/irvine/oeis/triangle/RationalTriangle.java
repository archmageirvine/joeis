package irvine.oeis.triangle;

import java.util.ArrayList;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Generate the rows of a triangle T(n,k).
 * The sequence runs through T(n,k) for k = 0 to n and n &gt;= 0.
 * The internal calling sequence is <code>++n, addRow(n), set(n,k=0..n)</code>.
 * The class maintains an array of all rows,
 * and the contract is that all calls <code>get(n, k)</code> can access the elements
 * in previous rows with <code>get(n - i, k)</code> for <code>i=1..m-1</code>,
 * and in the last row with <code>mLastRow[k - j]</code> for <code>j=1..k</code>.
 * @author Georg Fischer
 */
public class RationalTriangle extends AbstractSequence implements RationalSequence {

  private final static int DEFOFF = 0;
  protected ArrayList<Q[]> mArr;
  protected int mRow; // current row index n
  protected int mCol; // current column index k
  protected Q[] mLastRow; // = get(mRow)
  protected Q[] mInits; // buffer for the initial terms
  protected int mLinit; // = mInits.size()
  protected int mIn; // index for initial terms
  protected boolean mHasRAM; // random access method: whether <code>compute(n,k)</code> can be called without obeying the usual row-by-row order

  /**
   * Empty constructor.
   * Generates an ordinary Pascal triangle (A007318).
   */
  public RationalTriangle() {
    super(DEFOFF);
    mArr = new ArrayList<>();
    initialize(new Q[]{Q.ONE});
  }

  /**
   * Initializes the data structure.
   * Collects the code that is common to all constructors.
   */
  private void initialize(final Q[] inits) {
    mInits = inits;
    mLinit = mInits.length;
    mIn = -1; // index in mInits, starting with 0
    mRow = -1;
    mCol = -1; // start with first element T(0,0)
    mHasRAM = false; // default: no random access
  }

  /**
   * Determine whether <code>compute(n,k)</code> can be called without obeying the usual row-by-row order
   * @return true for random access, false if the usual increasing columns, row-by-row calling order must be obeyed
   */
  protected boolean hasRAM() {
    return mHasRAM;
  }

  /**
   * Set the "RAM" property
   * @param ram true for random access, false if the usual increasing columns, row-by-row calling order must be obeyed
   */
  protected void hasRAM(final boolean ram) {
    mHasRAM = ram;
  }

  /**
   * Sets a the value of a column in the last row.
   * @param k column number
   * @param value T(n,k)
   */
  protected void set(final int k, final Q value) {
    mLastRow[k] = value;
  }

  /**
   * Gets an element of the triangle.
   * @param n row number
   * @param k column number
   * @return T(n,k), or 0 for k &lt; 0 or k &gt; n.
   */
  protected Q get(final int n, final int k) {
    if (k > n || k < 0) {
      return Q.ZERO;
    } else if (n == mRow && k <= mCol) {
      return mLastRow[k];
    } else if (n < mRow) {
      return mArr.get(n)[k];
    } else {
      return compute(n, k);
    }
  }

  /**
   * Increases the row index, adds a new, empty row and resets the column index.
   */
  protected void addRow() {
    ++mRow;
    mArr.add(new Q[mRow + 1]);
    mLastRow = mArr.get(mRow);
    mCol = 0;
  }

  /**
   * Computes an element of the triangle.
   * The requirement is that all previous elements <code>T(0..n-1,k), T(n,0..k-1)</code>were already computed.
   * The default implementation here is Pascal's rule.
   * @param n row number
   * @param k column number
   * @return T(n,k)
   */
  protected Q compute(final int n, final int k) {
    ++mIn;
    final Q result;
    if (mIn < mLinit) {
      result = mInits[mIn]; // start with 1
    } else {
      result = get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
    }
    return result;
  }

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next rational term of the sequence.
   */
  @Override
  public Q nextQ() {
    if (++mCol > mRow) {
      addRow();
    }
    final Q result = compute(mRow, mCol);
    set(mCol, result);
    return result;
  }

  /**
   * Return next integral term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    return nextQ().num();
  }
}
