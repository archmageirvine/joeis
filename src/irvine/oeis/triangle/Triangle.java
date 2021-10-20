package irvine.oeis.triangle;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

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
public class Triangle extends ArrayList<Z[]> implements Sequence {

  protected int mRow; // current row index n
  protected int mCol; // current column index k
  protected Z[] mLastRow; // = get(mRow)
  protected Z[] mInits; // buffer for the initial terms
  protected int mLinit; // = mInits.size()
  protected int mIn; // index for initial terms

  /**
   * Empty constructor.
   * Generates an ordinary Pascal triangle (A007318).
   */
  public Triangle() {
    initialize(new Z[] { Z.ONE });
  }

  /**
   * Constructor with initial terms.
   * @param inits list of initial terms
   * Generates a triangle with Pascal's rule.
   */
  public Triangle(final String inits) {
    initialize(inits.length() == 0 ? new Z[] { Z.ONE } : ZUtils.toZ(inits));
  }

  /**
   * Constructor with initial terms.
   * @param inits array of initial terms
   * Generates a triangle with Pascal's rule.
   */
  public Triangle(final long... inits) {
    initialize(ZUtils.toZ(inits));
  }

  /**
   * Initializes the data structure.
   * Collects the code that is common to all constructors.
   */
  private void initialize(final Z[] inits) {
    mInits = inits;
    mLinit = mInits.length;
    mIn = -1; // index in mInits, starting with 0
    mRow = -1;
    mCol = -1; // start with first element T(0,0)
  }

  /**
   * Sets a the value of a column in the last row.
   * @param k column number
   * @param value T(n,k)
   */
  protected void set(final int k, final Z value) {
    mLastRow[k] = value;
  }

  /**
   * Gets an element of the triangle.
   * The requirement is that all elements <code>T(0..n-1,m), T(n,0..k)</code>were already computed.
   * @param n row number
   * @param k column number
   * @return T(n,k), or 0 for k &lt; 0 or k &gt; n.
   */
  protected Z get(final int n, final int k) {
    if (k > n || k < 0) {
      return Z.ZERO;
    } else if (n == mRow && k <= mCol) {
      return mLastRow[k];
    } else if (n < mRow) {
      return get(n)[k];
    } else {
      // System.err.println("assertion failed in Triangle.get(" + n + ", " + k + "), mIn=" + mIn);
      return Z.ZERO;
    }
  }

  /**
   * Increases the row index, adds a new, empty row and resets the column index.
   */
  protected void addRow() {
    ++mRow;
    add(new Z[mRow + 1]);
    mLastRow = get(mRow);
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
  protected Z compute(final int n, final int k) {
    ++mIn;
    final Z result;
    if (mIn < mLinit) {
      result = mInits[mIn]; // start with 1
    } else {
      result = get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
    }
    return result;
  }

  /**
   * Return next term, reading the triangle row by row from left to right, starting with T(0,0).
   * @return the next term of the sequence.
   */
  @Override
  public Z next() {
    if (++mCol > mRow) {
      addRow();
    }
    final Z result = compute(mRow, mCol);
    set(mCol, result);
    return result;
  }

  /**
   * Convert an arbitrary sequence into a Triangle.
   * @param seq Sequence to be converted
   */
  public static Triangle asTriangle(final Sequence seq) {
    return seq instanceof Triangle ? (Triangle) seq : new Triangle() {

      protected Z compute(final int n, final int k) {
        return seq.next();
      }
    };
  }

  /**
   * Multiply this Triangle with a second
   * @param s2 second Triangle
   * @return the product
   */
  public Triangle multiply(final Triangle s2) {
    return new Product(this, s2);
  }

  /**
   * Debugging output of a row
   * @param n row number
   */
  public void printRow(final int n) {
    if (n >= 0) {
      System.out.printf("%4d: ", n);
      for (int k = 0; k <= n; ++k) {
        final Z term = get(n, k);
        System.out.printf("%5s", term == null ? "null" : term.toString());
      }
      System.out.println();
    }
  }

  /**
   * Debugging output of the whole triangle
   * @param n row number
   */
  public void print() {
    for (int n = 0; n <= mRow; ++n) {
      printRow(n);
    }
  }
}
