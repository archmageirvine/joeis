package irvine.oeis.cons;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * Properties of a (simple) periodic continued fraction
 * for the square root of a number,
 * its numerators, denominators and period elements.
 * This class is used for the continued fraction
 * of a single square root, and for the property sequences for
 * the continued fractions of all square roots.
 * @author Georg Fischer
 */
public class ContinuedFractionOfSqrtSequence implements SequenceWithOffset {

  protected int mN; // index of current term to be returned
  protected int mK; // compute the sqrt of this number
  protected boolean mIsPow2; // whether mK is a square
  protected int mRoot; // the integer root, floor(sqrt(n))
  protected int mB0; // numerator   of old partial fraction
  protected int mB1; // denominator of new partial fraction
  protected Z mC0; // old convergent numerator
  protected Z mC1; // new convergent numerator
  protected Z mD0; // old convergent denominator
  protected Z   mD1; // new convergent denominator
  protected int mP0; // numerator   of old partial fraction
  protected int mP1; // denominator of new partial fraction
  protected int mQ0; // numerator of old partial fraction
  protected int mQ1; // denominator of new partial fraction
  protected int mPerInd; // index  in period
  protected int mPerLen; // length of period
  protected int mPerLeast; // least element of the period
  protected int mPerCount1; // number of ONEs in the period
  //protected int mPerCenter; // central element(s) in period
  protected int[] mPeriod;
  protected int mSize; // necessary size of mPeriod
  protected int mOffset; // OEIS offset1 as of generation time

  /**
   * Construct an instance which selects all numbers k
   * that have some property in the continued fractions
   * of their square roots.
   * @param offset first valid term has this index
   */
  protected ContinuedFractionOfSqrtSequence(final int offset) {
    mOffset = offset;
    mN = offset - 1;
    mK = offset - 1; // will be increased in first call of getNext(With)Property()
    mPeriod = new int[16];
  } // Constructor for all k with a property

  /**
   * Construct the continued fraction for the square root
   * of a single, specified number.
   * @param offset first valid term has this index
   * @param k compute the sqrt of this non-negative number
   */
  public ContinuedFractionOfSqrtSequence(final int offset, final int k) {
    mOffset = offset;
    mN  = offset - 1; // will be increased in first call of next().
    mK  = k;
    mPeriod = new int[16];
    initialize();
    mC0     = Z.ONE;
    mD0     = Z.ZERO;
    mC1     = Z.valueOf(mRoot);
    mD1     = Z.ONE;
  } // Constructor for a single k

  /**
   * Get the offset.
   * @return OEIS offset as of generation time
   */
  public int getOffset() {
    return mOffset;
  } // getOffset

  /**
   * Initialize the member properties.
   * The caller must already have set <em>mK, mN</em>.
   * This method is used for the continued fraction
   * of a single square root, and for the property sequences for
   * the continued fractions of all square roots.
   */
  protected void initialize() {
    mRoot   = (int) Math.sqrt(mK);
    mSize   = mRoot << 2; // * 4
    if (mPeriod.length < mSize) {
      mPeriod = new int[mSize];
    }
    mIsPow2 = mRoot * mRoot == mK;
    mP0     = 0;
    mQ0     = 1;
    mB0     = mRoot;
    mP1     = 0;
    mQ1     = 0;
    mB1     = 1;
    mPerLen = -1; // undefined so far
    mPerInd = 0; // index in mPeriod
  } // initialize

  /**
   * Initialize the member properties, and fill the period.
   * The caller must already have set <em>mK, mN</em>.
   * This method is used for the selection of some
   * property of the continued fractions of the square roots
   * of all numbers.
   */
  public void fillPeriod() {
    initialize();
    mPerCount1 = 0;
    if (!mIsPow2) { // no square number
      while (mPerLen < 0 || mPerInd < mPerLen) { // fill
        mP1 = mB0 * mQ0 - mP0;
        mQ1 = (mK - mP1 * mP1) / mQ0;
        mB1 = (mRoot + mP1) / mQ1;
        if (mPerLen < 0) {
          if (mQ0 == mQ1) {
            mPerLen = mPerInd * 2 + 1;
            //mPerCenter = mB0;
          } else if (mP0 == mP1) {
            mPerLen = mPerInd * 2;
            //mPerCenter = mB0;
          }
        }
        if (mPerInd == 0) { // first period element
          mPerLeast = mB1;
        } else if (mB1 < mPerLeast) {
          mPerLeast = mB1;
        }
        if (mB1 == 1) {
          ++mPerCount1;
        }
        ++mPerInd;
        mP0 = mP1;
        mQ0 = mQ1;
        mB0 = mB1;
        if (mPerLen < 0 || mPerInd <= mPerLen) {
          mPeriod[mPerInd - 1] = mB1;
        }
      } // while filling
    } else {
      mPerLen = 0;
      mPerInd = 0;
      mPerLeast = 0;
    }
  } // fillPeriod

  /**
   * Compute the elements for the next partial fraction, without the convergents.
   * This method must be called <em>after</em> fetching any
   * sequence element from the member properties.
   */
  protected void iterate() {
    if (!mIsPow2) { // no square number
      mP1 = mB0 * mQ0 - mP0;
      mQ1 = (mK - mP1 * mP1) / mQ0;
      mB1 = (mRoot + mP1) / mQ1;
      if (mPerLen < 0) {
        if (mQ0 == mQ1) {
          mPerLen = mPerInd * 2 + 1;
        } else if (mP0 == mP1) {
          mPerLen = mPerInd * 2;
        }
      }
      ++mPerInd;
      mP0 = mP1;
      mQ0 = mQ1;
      mB0 = mB1;
      if (mPerLen < 0 || mPerInd <= mPerLen) {
        mPeriod[mPerInd - 1] = mB1;
      }
      // code of iterateConvergents() removed from here
    } else {
      mB0 = 0;
      mPerLen = 0;
    } // no square number
  } // iterate

  /**
   * Compute the convergents for the next partial fraction.
   * This method must be called <em>after</em> fetching any
   * sequence element from the member properties.
   */
  protected void iterateConvergents() {
    if (!mIsPow2) { // no square number
      final Z mC2 = Z.valueOf(mB1).multiply(mC1).add(mC0);
      mC0 = mC1;
      mC1 = mC2;
      final Z mD2 = Z.valueOf(mB1).multiply(mD1).add(mD0);
      mD0 = mD1;
      mD1 = mD2;
    } // no square number
  } // iterateConvergents

  /**
   * Get the count of some value in the period.
   * The caller must already have filled the period,
   * and it must have a length &gt;= 1 (no perfect square).
   * @param value the desired value to be counted
   * @return the number of elements with the specified value
   */
  public int getCountInPeriod(final int value) {
    int iper = mPerLen - 1;
    int result = 0;
    while (iper >= 0) {
      if (mPeriod[iper] == value) {
        ++result;
      }
      --iper;
    } // while iper
    return result;
  } // getCountInPeriod

  /**
   * Get the least element in the period.
   * The caller must already have filled the period,
   * and it must have a length &gt;= 1 (no perfect square).
   * @return the least element
   */
  public int getLeastInPeriod() {
    int iper = mPerLen - 1;
    int least = mPeriod[0];
    while (iper > 0) {
      final int element = mPeriod[iper];
      if (element < least) {
        least = element;
      }
      --iper;
    } // while iper
    return least;
  } // getLeastInPeriod

  /**
   * Get the length of the period.
   * The caller must already have filled the period,
   * and it must have a length &gt;= 1 (no perfect square).
   * @return length of the period, including the trailing 2*root
   */
  public int getPeriodLength() {
    return mPerLen;
  } // getPeriodLength

  /**
   * Get some period element.
   * The caller must already have filled the period,
   * and it must have a length &gt;= 2 (no perfect square, and no square + 1).
   * @param index index of the element to be returned
   * @return element of the given index
   */
  public int getPeriodElement(final int index) {
    return mPeriod[index];
  } // getPeriodElement

  /**
   * Get the index of the current term of the sequence.
   * @return the index starting with the offset of the sequence
   */
  public int getIndex() {
    return mN;
  } // getIndex

  /**
   * Get the numerator of the convergent for the continued fraction.
   * @return numerator of the convergent
   */
  public Z getNumerator() {
    return mC1;
  } // getNumerator

  /**
   * Get the denominator of the convergent for the continued fraction.
   * @return denominator of the convergent
   */
  public Z getDenominator() {
    return mD1;
  } // getDenominator

  //=====================================
  /**
   * Get the next term of the sequence.
   * This is an example only.
   * The method is typically overwritten to get some other
   * element related to the continued fraction of the square root
   * of this number.
   * @return the next element of the continued fraction
   */
  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mB0); // member of the periodic continued fraction
    iterate();
    return result;
  } // next

  /**
   * Get some property of the next number.
   * This is an example only.
   * The method is typically overwritten to get some other
   * property related to the continued fraction.
   * @return property of the next number
   */
  protected Z getNextProperty() {
    ++mK;
    fillPeriod();
    return getProperty();
  } // getNextProperty

  /**
   * Get the next term of a sequence which fulfills some property.
   * @return the next number with the property
   */
  protected Z getNextWithProperty() {
    int loopCheck = 1000000;
    while (loopCheck > 0) {
      ++mK;
      fillPeriod();
      if (isOk()) {
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    if (loopCheck == 0) {
      throw new IllegalArgumentException("more than 10^6 iterations in ContinuedFractionOfSqrtSequence.getNextWithProperty()");
    }
    return Z.valueOf(mK);
  } // getNextWithProperty

  /**
   * Get the size of the period of the continued fraction for sqrt(n).
   * This method is an example only.
   * It is typically overwritten in order to return some other property.
   * The caller must ensure that the period is already filled.
   * @return property of the period of the continued fraction for the square root
   * of the current number <em>mK</em>.
   */
  protected Z getProperty() {
    return Z.valueOf(mPerLen);
  } // getProperty

  /**
   * Determine whether the current number has the property which includes it in the sequence.
   * This method is an example only.
   * It is typically overwritten in order to test some other property.
   * The caller must ensure that the period is already filled.
   * @return true iff the current number <em>mK</em> has some property.
   */
  protected boolean isOk() {
    return true;
  } // isOk

  //==== for test only ===
//  /**
//   * Show the period and its properties.
//   */
//  private void printPeriod() {
//    System.out.print(" isPow2=" + mIsPow2 + ", len=" + getPeriodLength() + ", ind=" + mPerInd
//        + ", center=" + mPerCenter + ", least=" + getLeastInPeriod()
//        + ", count1=" + getCountInPeriod(1));
//    if (mPeriod != null && mPeriod.length >= mPerLen) {
//      System.out.print("\tperiod: ");
//      for (int iper = 0; iper < mPerLen; iper ++) {
//        if (iper > 0) {
//          System.out.print(",");
//        }
//        System.out.print(mPeriod[iper]);
//      } // for
//      System.out.println();
//    }
//  } // printPeriod
//
//  /** Test method.
//   *  @param args command line arguments: [n [number of terms]]
//   *  Show various elements related to the continued fraction for the square root of n.
//   *  If n is &lt; 0, several properties of the period for all numbers are shown.
//   */
//  public static void main(String[] args) {
//    int n = -1;
//    int iarg = 0;
//    if (iarg < args.length) {
//      try {
//        n = Integer.parseInt(args[iarg ++]);
//      } catch (Exception exc) {
//      }
//    }
//    int noterms = 8;
//    if (iarg < args.length) {
//      try {
//        noterms = Integer.parseInt(args[iarg ++]);
//      } catch (Exception exc) {
//      }
//    }
//    ContinuedFractionOfSqrtSequence cf = null;
//    int iterm = 0;
//    if (n > 0) { // properties of a single nubmer
//      cf = new ContinuedFractionOfSqrtSequence(1, n);
//      while (iterm < noterms) {
//        System.out.println(String.format("%4d:", iterm)
//           + " "    + cf.mB0
//           + " B1=" + cf.mB1
//           + " P0=" + cf.mP0
//           + " P1=" + cf.mP1
//           + " Q0=" + cf.mQ0
//           + " Q1=" + cf.mQ1
//           + " PerLen=" + cf.getPeriodLength()
//           + " PerInd=" + cf.mPerInd
//           + "\t"   + cf.mC0 + "/" + cf.mD0
//           + " C1=" + cf.mC1
//           + " D1=" + cf.mD1
//           );
//        cf.next();
//        iterm ++;
//      } // while iterm
//    } else { // properties of all numbers
//      cf = new ContinuedFractionOfSqrtSequence(0);
//      while (iterm < noterms) {
//        cf.getNextProperty();
//        if (!cf.mIsPow2) {
//          System.out.print(String.format("%4d:", iterm));
//          cf.printPeriod();
//        }
//        iterm ++;
//      } // while iterm
//    } // all
//  } // main

} // ContinuedFractionOfSqrtSequence
