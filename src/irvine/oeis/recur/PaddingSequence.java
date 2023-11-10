package irvine.oeis.recur;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A sequence generated verbatim from terms of the first (left) list, and when that is exhausted,
 * continuing with the terms from the second (right) list.
 * The result can be thought as if the right list were repeated infinitely,
 * and the left list were superimposed.
 * The Mathematica function <code>PadRight</code> uses the parameters in the same way.
 * See also {@link PeriodicSequence}.
 * @author Georg Fischer
 */
public class PaddingSequence extends AbstractSequence implements DirectSequence {

  private final Z[] mLList; // start with this list
  private final Z[] mRList; // superimpose this list when mLList is exhausted
  private final int mLLen; // length of mLList
  private final int mRLen; // length of mRList
  private int mN = -1; // first element will be mLList[0]
  private final int mOffset; // first index

  /**
   * Construct the sequence.
   * @param leftList the left list
   * @param rightList the right list
   */
  public PaddingSequence(final long[] leftList, final long[] rightList) {
    this(0, ZUtils.toZ(leftList), ZUtils.toZ(rightList));
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param leftList the left list
   * @param rightList the right list
   */
  public PaddingSequence(final String leftList, final String rightList) {
    this(0, ZUtils.toZ(leftList), ZUtils.toZ(rightList));
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param leftList the left list
   * @param rightList the right list
   */
  public PaddingSequence(final int offset, final long[] leftList, final long[] rightList) {
    this(offset, ZUtils.toZ(leftList), ZUtils.toZ(rightList));
  }

  /**
   * Construct the sequence.
   * @param leftList the left list
   * @param rightList the right list
   */
  public PaddingSequence(final int offset, final String leftList, final String rightList) {
    this(offset, ZUtils.toZ(leftList), ZUtils.toZ(rightList));
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param leftList the left list
   * @param rightList the right list
   */
  public PaddingSequence(final int offset, final Z[] leftList, final Z[] rightList) {
    super(offset);
    mOffset = offset;
    mLList = leftList;
    mLLen = mLList.length;
    mRList = rightList;
    mRLen = mRList.length;
  }

  @Override
  public Z next() {
    ++mN;
    return mN < mLLen ? mLList[mN] : (mRLen == 1 ? mRList[0] : mRList[mN % mRLen]);
  }

  @Override
  public Z a(int n) {
    while (n < 0) {
      n += mRLen;
    }
    n -= mOffset;
    return n < mLLen ? mLList[n] : (mRLen == 1 ? mRList[0] : mRList[n % mRLen]);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  /**
   * Gets the list of initial terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return Arrays.copyOf(mLList, mLList.length);
  }

  /**
   * Gets the list of initial terms.
   * @return array of terms
   */
  public Z[] getPaddingTerms() {
    return Arrays.copyOf(mRList, mRList.length);
  }

}
