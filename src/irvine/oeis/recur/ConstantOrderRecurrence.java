package irvine.oeis.recur;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;

/**
 * A recurrence with constant order (depth), specified by a single formula,
 * depending on <code>a(n+k)</code>.
 * @author Georg Fischer
 */
public abstract class ConstantOrderRecurrence implements SequenceWithOffset {

  protected int mInitLen; // number of initial terms
  protected int mIn; // index for counting initial terms
  protected int mShift; // d &gt;= 0 such that <code>a(n+d)</code> is the highest and next element to be computed (0 &lt;= d &lt;= k).
  protected int mN; // index of the next sequence element to be computed
  protected int mOffset; // index of the first sequence element
  protected int mOrder; // order k-1 of the recurrence, number of previous sequence elements used to compute <code>a(n+shift)</code>
  protected Z[] mBuffer; // ring buffer for the elements of the recurrence, must have some length 2^k &gt; {@link #mOrder}, preset with 0
  protected int mBufLen; // length of {@link #mBuffer}
  protected int mMask; // bit mask for accessing elements of {@link #mBuffer}, <code>= mBufLen - 1</code>
  // future: protected int mGfType; // bit mask for type(s) of the g.f.: 0 = ordinary, 1 = exponential, 2 = adjunct, 4 = reverse ...

  /**
   * Empty constructor.
   */
  protected ConstantOrderRecurrence() {
    this(0, 1, 0, 1); // black start
  }

  /**
   * Construct a general recurrence sequence.
   * @param offset first valid term has this index
   * @param order order (depth) of the recurrence, index distance between <code>a(n+kmin)</code> and <code>a(n+kmax)</code>
   * @param shift compute next element <code>a(n+shift)</code> instead of <code>a(n)</code>
   * @param initTerms initial values of <code>a(offset..order+offset-1)</code>
   */
  public ConstantOrderRecurrence(final int offset, final int order, final int shift, final String initTerms) {
    this(offset, order, shift, ZUtils.toZ(initTerms));
  }

  /**
   * Construct a general recurrence sequence with shift 0.
   * @param offset first valid term has this index
   * @param order order (depth) of the recurrence, index distance between <code>a(n+kmin)</code> and <code>a(n+kmax)</code>
   * @param initTerms initial values of <code>a(offset..order+offset-1)</code>
   */
  public ConstantOrderRecurrence(final int offset, final int order, final String initTerms) {
    this(offset, order, 0, ZUtils.toZ(initTerms));
  }

  /**
   * Construct a general recurrence sequence.
   * @param offset first valid term has this index
   * @param order order (depth) of the recurrence, index distance between <code>a(n+kmin)</code> and <code>a(n+kmax)</code>
   * @param shift compute next element <code>a(n+shift)</code> instead of <code>a(n)</code>
   * @param initTerms initial values of <code>a(offset..order+offset-1)</code>
   */
  public ConstantOrderRecurrence(final int offset, final int order, final int shift, final long... initTerms) {
    this(offset, order, shift, ZUtils.toZ(initTerms));
  }

  /**
   * Construct a general recurrence sequence.
   * @param offset first valid term has this index
   * @param order order (depth) of the recurrence, index distance between <code>a(n+kmin)</code> and <code>a(n+kmax)</code>
   * @param shift compute next element <code>a(n+shift)</code> instead of <code>a(n)</code>
   * @param initTerms initial values of <code>a(offset..order+offset-1)</code>
   */
  public ConstantOrderRecurrence(final int offset, final int order, final int shift, final Z... initTerms) {
    mOffset = offset;
    mOrder = order;
    mShift = shift;
    mIn = 0;
    mN = offset - 1; //  + mBufLen) & mMask;
    mInitLen = initTerms.length;
    mBufLen = Integer.highestOneBit(mOrder + 1) << 1;
    if (mBufLen < mInitLen) {
      mBufLen = Integer.highestOneBit(mInitLen + 1) << 1; // does not matter if too high
    }
    mMask = mBufLen - 1;
    mBuffer = new Z[mBufLen];
    for (int i = 0; i < mBufLen; ++i) {
      mBuffer[i] = Z.ZERO;
    }
    for (int i = 0; i < mInitLen; ++i) {
      mBuffer[(i + offset + mBufLen) & mMask] = initTerms[i];
    }
  }

  /**
   * Access a recurrence element.
   * @param n index of the element
   * @return integer
   */
  protected Z a(final int n) {
    return mBuffer[(n + mBufLen) & mMask];
  }

  /**
   * This method must compute <code>a(n+shift)</code>.
   * @param n index of term to be computed, without shift
   * @return value of the new element
   */
  protected abstract Z compute(final int n);

  /**
   * Gets the index distance between the highest recurrence element and <code>a[n]: 0..k-1</code>.
   * @return a non-negative number
   */
  public int getDistance() {
    return mShift;
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
   * Gets the offset
   * @return the index where the sequence elements start
   */
  public int getOffset() {
    return mOffset;
  }
  @Override
  public Z next() {
    ++mN;
//System.out.print("next1: mN=" + mN + "; "); for (int i = 0; i < mBufLen; ++i) { System.out.print(mBuffer[i] + ","); } System.out.println();
    if (++mIn <= mInitLen) {
      return mBuffer[mN & mMask];
    }
    final Z result = compute(mN - mShift);
    mBuffer[mN & mMask] = result;
//System.out.print("next2: mN=" + mN + "; "); for (int i = 0; i < mBufLen; ++i) { System.out.print(mBuffer[i] + ","); } System.out.println();
    return result;
  }
}
