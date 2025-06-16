/* Holonomic rational sequences where the recurrence equation for a(n) has polynomials in n as coefficients.
 * @(#) $Id$
 * 2025-06-11, Georg Fischer: copied from HolonomicRecurrence; ML=+106
 */
package irvine.oeis.recur;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.q.QUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A holonomic sequence is defined by a recurrence equation
 * where the factors of <code>a[n-i], i=0..k</code> are either constant
 * (like in <code>LinearRecurrence.java</code>), or are polynomials in <code>n</code>..
 * The equation is written in the form of an <code>annihilator</code>:
 * <pre>
 * p[0]*1 + p[1]*a[n-k+1] + p[2]*a[n-k+2] + ...+ p[k-1]*a[n-k+k-1] + p[k]*a[n] = 0
 * </pre>
 * <code>k-1</code> is the order of the recurrence,
 * and <code>p[i], i= 0..k</code> are the polynomials (or constants) in <code>n</code>.
 * <code>a[n]</code> is the next term to be computed.
 * The recurrence equation may have a term <code>p[0]</code> which is independent
 * of any sequence term.
 * @author Georg Fischer
 */
public class RationalRecurrence extends AbstractSequence implements RationalSequence {
  /** Bitmask indicating an ordinary generating function. */
  public static final int OGF = 0;
  /** Bitmask indicating an exponential generating function. */
  public static final int EGF = 1;
  /** Bitmask indicating a rational generating function. */
  public static final int DEN = 4;

  private final int mOffset;
  protected Q[] mInitTerms; // initial terms for a(n)
  protected int mNDist; // d >= 0 if a(n+d) is the highest and next element to be computed (0 <= d <= k).
  protected int mMaxDegree; // maximum degree of polynomials in n; = 0 for linear recurrences
  protected int mN; // index of the next sequence element to be computed
  protected Q[] mNdPowers; // powers of mNDist for exponents 0..mMaxDegree
  protected int mOrder; // order k-1 of the recurrence, number of previous sequence elements used to compute a(n)
  protected ArrayList<Q[]> mPolyList; // polynomials as coefficients of <code>n^i, i=0..m</code>
  protected Q[] mBuffer; // ring buffer for the elements involved in the recurrence, indexed with mN modulo mOrder
  protected int mBufSize; // size of the ring buffer
  protected int mGfType; // type of the g.f.: 0 = ordinary, 1 = exponential, 2 = dirichlet ...

  /**
   * Offset only constructor.
   * @param offset sequence offset
   */
  protected RationalRecurrence(final int offset) {
    super(offset);
    mOffset = offset;
    mNDist = 0;
    mPolyList = new ArrayList<>(16);
    mInitTerms = new Q[] {Q.ONE};
    // initialize();
  }

  /**
   * Construct a holonomic recurrence sequence from Q parameters.
   * @param offset first valid term has this index
   * @param polyList polynomials as coefficients of <code>n^i, i=0..m</code>
   * @param initTerms initial values of <code>a[0..k]</code>
   * @param nDist index distance between the highest recurrence element and <code>a[n]: 0..k-1</code>
   */
  public RationalRecurrence(final int offset, final ArrayList<Q[]> polyList, final Q[] initTerms, final int nDist) {
    super(offset);
    mOffset = offset;
    mNDist = nDist;
    mPolyList = polyList;
    mInitTerms = initTerms.length == 0 ? new Q[] {Q.ONE} : Arrays.copyOf(initTerms, initTerms.length);
    initialize();
  } // Constructor

  /**
   * Construct a holonomic recurrence sequence from Q parameters.
   * @param offset first valid term has this index
   * @param polyList polynomials as coefficients of <code>n^i, i=0..m</code>
   * @param initTerms initial values of <code>a[0..k]</code>
   */
  public RationalRecurrence(final int offset, final ArrayList<Q[]> polyList, final Q[] initTerms) {
    this(offset, polyList, initTerms, 0);
  } // Constructor

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param offset first valid term has this index
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   * @param nDist index distance between the highest recurrence element and a[n]: 0..k-1
   */
  public RationalRecurrence(final int offset, final String matrix, final String initTerms, final int nDist) {
    this(offset, matrix, initTerms, nDist, OGF);
  }

  /**
   * Construct a holonomic recurrence sequence from String parameters, with a specified type of the generating function.
   * @param offset first valid term has this index
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   * @param nDist index distance between the highest recurrence element and a[n]: 0..k-1
   * @param gfType one of <code>OGF, EGF, DGF</code>
   */
  public RationalRecurrence(final int offset, final String matrix, final String initTerms, final int nDist, final int gfType) {
    super(offset);
    mOffset = offset;
    mNDist = nDist;
    int start = 0;
    while (matrix.charAt(start) == '[') {
      ++start;
    }
    int behind = matrix.length();
    while (matrix.charAt(behind - 1) == ']') {
      --behind;
    }
    mPolyList = new ArrayList<>(16);
    if (start <= 1) { // linear case, simple vector of the form "[0,1,2,...]"
      final String[] polys = matrix.substring(start, behind).split("\\s*,\\s*");
      for (int k = 0; k < polys.length; ++k) {
        mPolyList.add(new Q[] {new Q(polys[k])});
      } // for k
    } else { // holonomic case, vector list "[[0,1,2],[0],[17,0,18]]"
      final String[] polys = matrix.substring(start, behind).split("\\]\\s*,\\s*\\[");
      for (int k = 0; k < polys.length; ++k) {
        mPolyList.add(QUtils.toQ(polys[k]));
      } // for k
    }
    mInitTerms = (initTerms.isEmpty() || "[]".equals(initTerms)) ? new Q[] {Q.ONE} : QUtils.toQ(initTerms.replaceAll("[\\[\\]]", ""));
    initialize();
    mGfType = gfType;
  } // Constructor

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param offset first valid term has this index
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param prefix initial values of the sequence which do not participate in the recurrence
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   * @param nDist index distance between the highest recurrence element and a[n]: 0..k-1
   */
  public RationalRecurrence(final int offset, final String matrix, final String prefix, final String initTerms, final int nDist) {
    this(offset, matrix, (prefix + "," + initTerms).replaceAll("\\s*\\]\\s*,\\s*\\[\\s*", ","), nDist);
  } // Constructor

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param offset first valid term has this index
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param prefix initial values of the sequence which do not participate in the recurrence
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   */
  public RationalRecurrence(final int offset, final String matrix, final String prefix, final String initTerms) {
    this(offset, matrix, ((prefix.isEmpty() || "[]".equals(prefix) ? "" : prefix + ",")
      + initTerms).replaceAll("\\s*\\]\\s*,\\s*\\[\\s*", ","), 0);
  } // Constructor

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param offset first valid term has this index
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], as a String vector, for example "[0,1,2,3]"
   */
  public RationalRecurrence(final int offset, final String matrix, final String initTerms) {
    this(offset, matrix, initTerms, 0);
  } // Constructor

  /**
   * Get the type of the generating function.
   * @return code for the type: 0 = ordinary, 1 = exponential, 2 = additional function
   */
  public int getGfType() {
    return mGfType;
  }

  /**
   * Set the type of the generating function.
   * @param gfType code for the type: 0 = ordinary, 1 = exponential, 2 = additional function
   */
  public void setGfType(final int gfType) {
    mGfType = gfType;
  }

  /**
   * Initialize the sequence.
   * This code is common to all constructors.
   */
  protected void initialize() {
    mGfType = 0; // normally it is an ordinary g.f.
    mN = mOffset - 1;
    mMaxDegree = 1;
    int k = mPolyList.size() - 1;
    mBufSize = k + 2; // at least 1
    mBuffer = new Q[mBufSize];
    Arrays.fill(mBuffer, Q.ZERO);
    mOrder = k - 1;
    while (k >= 0) { // determine mMaxDegree
      final int klen = mPolyList.get(k).length;
      if (klen > mMaxDegree) {
        mMaxDegree = klen;
      }
      --k;
    } // while k
    mNdPowers = new Q[mMaxDegree + 2]; // ensure that [0], [1] always exist
    mNdPowers[0] = Q.ONE;
  } // initialize

  /**
   * For <code>gftype=2</code>, add the value of some function of the current index {@link #mN}.
   * to the constant term in the recurrence equation.
   * This method is typically overwritten, for example in ComplementaryEquationSequence.
   * @param n index of the term a(n) to be computed
   * @return value to be added to the constant term (default: 0).
   */
  public Q adjunct(final int n) {
    return Q.ZERO;
  }

  /**
   * Gets the next term of the sequence.
   * @return a rational term
   */
  @Override
  public Q nextQ() {
    int ibuf; // index in mBuffer
    final Q result;
    ++mN;
    if (mN - mOffset < mInitTerms.length) {
      result = mInitTerms[mN - mOffset];
    } else {
      final int nd = mN - mNDist;
      mNdPowers[1] = Q.valueOf(nd);
      for (int m = 2; m < mMaxDegree; ++m) { // fill powers of mN
        mNdPowers[m] = mNdPowers[m - 1].multiply(nd);
      } // for powers of mN
      int k = mPolyList.size() - 1;
      final Q[] pvals = new Q[k + 1];
      while (k >= 0) { // evaluate all polynomials
        Q pvalk = Q.ZERO; // one coefficient = value of a polynomial in n
        final Q[] poly = mPolyList.get(k);
        // handle the linear case separately
        Q coeffi = poly[0];
        if (!coeffi.isZero()) {
          pvalk = pvalk.add(coeffi);
        }
        for (int i = 1; i < poly.length; i++) { // possibly holonomic: evaluate polynomial in nd
          coeffi = poly[i];
          if (coeffi.isZero()) {
            // ignore
          } else if (coeffi.equals(Q.ONE)) {
            pvalk = pvalk.add(mNdPowers[i]);
          } else if (coeffi.equals(Q.NEG_ONE)) {
            pvalk = pvalk.subtract(mNdPowers[i]);
          } else { // abs(coeffi) > 1
            pvalk = pvalk.add(mNdPowers[i].multiply(coeffi));
          }
        } // for i - terms of one polynomial in nd
        pvals[k] = pvalk;
        --k;
      } // while k - coefficients of the recurrence
      // pvals[0..mOrder] now contain the coefficients of the recurrence equation
      Q sum = pvals[0]; // k=0, the constant term (without a(k)) in the recurrence, mostly ZERO
      if (mGfType == 2 && mN >= mOrder) {
        sum = sum.add(adjunct(mN));
      }
      for (k = 1; k <= mOrder; ++k) { // sum all previous elements of the recurrence
        ibuf = mN - mOrder - 1 + k; // index of previous recurrence element a[n-i]
        while (ibuf < 0) {
          ibuf += mBufSize;
        }
        ibuf %= mBufSize;
        sum = sum.add(pvals[k].multiply(mBuffer[ibuf]));
      } // for k - summing
      if (!pvals[mOrder + 1].isZero()) {
        if ((mGfType & EGF) != 0 && mN >= 2) { // exponential: multiply by mN
          sum = sum.multiply(Q.valueOf(mN));
        }
        result = sum.negate().divide(pvals[mOrder + 1]);
      } else {
        result = null;
      }
    }
    if ((mGfType & EGF) != 0 && result != null) { // exponential: multiply buffer by mN
      final Q zn = Q.valueOf(mN);
      for (ibuf = 0; ibuf < mBufSize; ++ibuf) {
        if (mBuffer[ibuf] != null) {
          mBuffer[ibuf] = mBuffer[ibuf].multiply(zn);
        }
      }
    }
    ibuf = mN;
    while (ibuf < 0) {
      ibuf += mBufSize;
    }
    ibuf %= mBufSize;
    mBuffer[ibuf] = result;
    return result;
  } // nextQ

  @Override
  public Z next() {
    return (mGfType & DEN) != 0 ? nextQ().den() : nextQ().num();
  }

  /**
   * Gets the order of <code>this</code> recurrence
   * @return number of sequence elements in the recurrence equation, minus one.
   * The vector for the equation has an additional element for the constant,
   * and another for the new sequence element to be computed.
   */
  public int getOrder() {
    return mOrder;
  }

  /**
   * Gets the vectors for the coefficient polynomials.
   * @return a list of coefficient vectors for the powers of <code>n</code>.
   */
  public ArrayList<Q[]> getPolyList() {
    return mPolyList;
  }

  /**
   * Gets the vector for the initial terms.
   * @return a vector for the initial values of the sequence.
   */
  public Q[] getInitTerms() {
    return mInitTerms;
  }

  /**
   * Gets the index distance between the highest recurrence element and a[n]: 0..k-1
   * @return a non-negative number
   */
  public int getDistance() {
    return mNDist;
  }

  /**
   * Gets a String representation
   * of the coefficient polynomials.
   * @return a list of polynomials of the form "[[0,1],[1,2],[1]]".
   */
  public String getPolyString() {
    final StringBuilder result = new StringBuilder(256);
    final ArrayList<Q[]> polyList = getPolyList();
    for (int i = 0; i < polyList.size(); ++i) { // polynomials
      final Q[] poly = polyList.get(i);
      result.append(i == 0 ? '[' : ',');
      for (int j = 0; j < poly.length; ++j) {
        result.append(j == 0 ? '[' : ',');
        result.append(poly[j]);
      } // for j
      result.append(']');
    } // for i
    result.append(']');
    return result.toString();
  } // getPolyString

  /**
   * Gets a String representation
   * of the initial terms.
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  public String getInitString() {
    final StringBuilder result = new StringBuilder(256);
    final Q[] initTerms = getInitTerms();
    int j = 0;
    while (j < initTerms.length) {
      result.append(j == 0 ? '[' : ',');
      result.append(initTerms[j]);
      ++j;
    } // while j
    result.append(']');
    return result.toString();
  } // getInitString()

}
